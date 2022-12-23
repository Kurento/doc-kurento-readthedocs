==================
Release Procedures
==================

.. contents:: Table of Contents



Introduction
============

Kurento as a project spans across a multitude of different technologies and languages, each of them with their sets of conventions and *best practices*. This document aims to summarize all release procedures that apply to each one of the modules that compose the Kurento project. The main form of categorization is by technology type: C/C++ based modules, Java modules, JavaScript modules, and others.


.. _dev-release-general:

General considerations
----------------------

* Lists of projects in this document are sorted according to the repository lists given in :ref:`dev-code-repos`.

* Kurento projects to be released have supposedly been under development, and will have development version numbers:

  - In Java (Maven) projects, development versions are indicated by the suffix ``-SNAPSHOT`` after the version number. Example: ``1.0.0-SNAPSHOT``.
  - In C/C++ (CMake) projects, development versions are indicated by the suffix ``-dev`` after the version number. Example: ``1.0.0-dev``.

  These suffixes must be removed for release, and then recovered again to resume development.

* All dependencies to development versions will be changed to a release version during the release procedure. Concerning people will be asked to choose an appropriate release version for each development dependency.

* Tags are named with the version number of the release. Example: ``1.0.0``.

* Contrary to the project version, Debian package versions don't contain development suffixes, and should always be of the form ``1.0.0-0kurento1``:

  - The first part (*1.0.0*) is the project's **base version number**.

  - The second part (*0kurento1*) is the **Debian package revision**:

    - The number prefix (in this example: *0*) indicates the version relative to other same-name packages provided by the base system. When this number is *0*, it means that the package is original and only exists in Kurento, not in Debian or Ubuntu itself. This is typically the case for the projects owned or forked for the Kurento project.

    - The number suffix (in this example: *1*) means the number of times the same package has been re-packaged and re-published. *1* means that this is the *first* time a given project version was packaged.

    **Example**:

    Imagine that version *1.0.0* of your code is released for the first time. The full Debian package version will be: *1.0.0-0kurento1*. Later, you realize the package doesn't install correctly in some machines, because of a bug in the package's post-install script. You fix it, and now it's time to re-publish! But the project's source code itself has not changed at all, only the packaging files (in ``/debian/`` dir); thus, the *base version* will remain *1.0.0*, and only the *Debian revision* needs to change. The new package's full version will be *1.0.0-0kurento2*.

  Please check the `Debian Policy Manual`_ and `this Ask Ubuntu answer`_ for more information about the package versions.

* Kurento uses `Semantic Versioning`_. Whenever you need to decide what is going to be the *final release version* for a new release, try to follow the SemVer guidelines:

  .. code-block:: text

     Given a version number MAJOR.MINOR.PATCH, increment the:

     1. MAJOR version when you make incompatible API changes,
     2. MINOR version when you add functionality in a backwards-compatible manner, and
     3. PATCH version when you make backwards-compatible bug fixes.

  Please refer to https://semver.org/ for more information.

  **Example**:

  If the last Kurento release was **1.0.0**, then the next development version would be **1.0.1-dev** (or *1.0.1-SNAPSHOT* for Java components).

  Later, the time comes to release this new development. If the new code only includes bug fixes and patches, then the version number *1.0.1* is already good. However, maybe this new release ended up including new functionality, which according to Semantic Versioning should be accompanied with a bump in the *.MINOR* version number, so the next release version number should be *1.1.0*. The Debian package version is reset accordingly, so the full Debian version is **1.1.0-0kurento1**.

  If you are re-packaging an already published version, without changes in the project's code itself, then just increment the Debian package revision: *0kurento1* becomes *0kurento2*, and so on.



.. note::

   Made a mistake? Don't panic!

   Do not be afraid of applying some Git magic to solve mistakes during the release process. Here are some which can be useful:

   - How to remove a release tag?

     - Remove the local tag:

       .. code-block:: shell

          git tag --delete <TagName>

     - Remove the remote tag:

       .. code-block:: shell

          git push --delete origin <TagName>

   - How to push just a local tag?

     .. code-block:: shell

        git push origin <TagName>

   - How to amend a commit and push it again?

     See: https://www.atlassian.com/git/tutorials/rewriting-history#git-commit--amend

     .. code-block:: shell

        # <Remove Tag>
        # <Amend>
        # <Create Tag>
        git push --force origin <TagName>



.. warning::

   As of this writing, there is a mix of methods in the CI scripts (adm-scripts) when it comes to handle the release versions. The instructions in this document favor creating and pushing git tags manually in the developer's computer, however some projects also make use of the script *kurento_check_version.sh*, which tries to detect when a project's version is *not* a development snapshot, then creates and pushes a git tag automatically. However if the tag already exists (created manually by the developer), then the ``git tag`` command fails, and this script prints a warning message before continuing with its work.

   We've been toying with different methodologies between handling the tags automatically in CI or handling them manually by the developer before releasing new versions; both of these methods have pros and cons. For example, if tags are handled manually by the developer, solving mistakes in the release process becomes simpler because there are no surprises from CI creating tags inadvertently; on the other hand, leaving them to be created by CI seems to simplify a bit the release process, but not really by a big margin.



Release order
=============

First, the C/C++ parts of the code are built, Debian packages are created, and everything is left ready for deployment into an Aptly repository (for *apt-get*).

Before Kurento Media Server itself, all required forks and libraries must be built and installed (see :ref:`dev-release-forks`). These are:

* `jsoncpp`_
* `libsrtp`_
* `openh264`_
* `openh264-gst-plugin`_
* `libusrsctp`_
* `gstreamer`_
* `gst-plugins-base`_
* `gst-plugins-good`_
* `gst-plugins-bad`_
* `gst-plugins-ugly`_
* `gst-libav`_
* `openwebrtc-gst-plugins`_
* `libnice`_

The Kurento Media Server should be built in this order (see :ref:`dev-release-media-server`):

* `kurento-module-creator`_
* `kms-cmake-utils`_
* `kms-jsonrpc`_
* `kms-core`_
* `kms-elements`_
* `kms-filters`_
* `kurento-media-server`_

And the extra Kurento modules, which depend on Kurento's *core*, *elements*, and *filters*, can be built now:

* `kms-chroma`_
* `kms-crowddetector`_
* `kms-datachannelexample`_
* `kms-markerdetector`_
* `kms-platedetector`_
* `kms-pointerdetector`_

With this, the Media Server part of Kurento is built and ready for use. This includes an JSON-RPC server that listens for connections and speaks the :doc:`/features/kurento_protocol`.

To make life easier for application developers, there is a Java and a JavaScript client SDK that implements the RPC protocol. These are libraries that get auto-generated from each of the Kurento modules.

The *kurento-utils-js* library must be built before Java modules, because it is a dependency of both *kurento-java* and *kurento-tutorial-java*:

* `kurento-utils-js`_

Now, the main Java tools (see :ref:`dev-release-java`):

* kurento-module-creator-java (*org.kurento.kurento-module-creator*)
* `kurento-maven-plugin`_ (*org.kurento.kurento-maven-plugin*)
* `kurento-qa-pom`_ (*org.kurento.kurento-qa-pom*)

Main Kurento modules:

* kms-core-java (*org.kurento.kms-api-core*)
* kms-elements-java (*org.kurento.kms-api-elements*)
* kms-filters-java (*org.kurento.kms-api-filters*)

Client SDK:

* `kurento-java`_ (*org.kurento.kurento-client*)

After *kurento-java* is done, the extra Kurento modules (which depend on *kurento-java/kurento-client*):

* kms-chroma-java (*org.kurento.module.chroma*)
* kms-crowddetector-java (*org.kurento.module.crowddetector*)
* kms-datachannelexample-java (*org.kurento.module.datachannelexample*)
* kms-markerdetector-java (*org.kurento.module.markerdetector*)
* kms-platedetector-java (*org.kurento.module.platedetector*)
* kms-pointerdetector-java (*org.kurento.module.pointerdetector*)

And lastly, the tutorials (which depend on the extra modules):

* `kurento-tutorial-java`_ (*org.kurento.tutorial.\**)
* `kurento-tutorial-test`_

JavaScript follows a similar ordering (see :ref:`dev-release-javascript`). Starting from the main Kurento modules:

* kms-core-javascript (`kurento-client-core-js`_)
* kms-elements-javascript (`kurento-client-elements-js`_)
* kms-filters-javascript (`kurento-client-filters-js`_)

Extra Kurento modules:

* kms-chroma-javascript (`kurento-module-chroma-js`_)
* kms-crowddetector-javascript (`kurento-module-crowddetector-js`_)
* kms-datachannelexample-javascript (`kurento-module-datachannelexample-js`_)
* kms-markerdetector-javascript (`kurento-module-markerdetector-js`_)
* kms-platedetector-javascript (`kurento-module-platedetector-js`_)
* kms-pointerdetector-javascript (`kurento-module-pointerdetector-js`_)

Client SDK:

* `kurento-jsonrpc-js`_
* `kurento-client-js`_

And tutorials:

* `kurento-tutorial-js`_
* `kurento-tutorial-node`_

Last, but not least, the project maintains a set of Docker images and documentation pages:

* :ref:`dev-release-docker`
* :ref:`dev-release-doc`



.. _dev-release-forks:

Fork Repositories
=================

This graph shows the dependencies between forked projects used by Kurento:

.. graphviz:: /images/graphs/dependencies-forks.dot
   :align: center
   :caption: Projects forked by Kurento

Release order:

* `jsoncpp`_
* `libsrtp`_
* `openh264`_
* `openh264-gst-plugin`_
* `libusrsctp`_
* `gstreamer`_
* `gst-plugins-base`_
* `gst-plugins-good`_
* `gst-plugins-bad`_
* `gst-plugins-ugly`_
* `gst-libav`_
* `openwebrtc-gst-plugins`_
* `libnice`_



Release steps
-------------

#. Choose the *final release version*, following the SemVer guidelines as explained in :ref:`dev-release-general`.

#. Set the new version. This operation might vary between projects.

   .. code-block:: shell

      # Change here.
      NEW_VERSION="<ReleaseVersion>" # Eg.: 1.0.0
      NEW_DEBIAN="<DebianRevision>"  # Eg.: 0kurento1

      function do_release {
          local PACKAGE_VERSION="${NEW_VERSION}-${NEW_DEBIAN}"
          local COMMIT_MSG="Prepare release $PACKAGE_VERSION"

          local SNAPSHOT_ENTRY="* UNRELEASED"
          local RELEASE_ENTRY="* $COMMIT_MSG"

          DEBFULLNAME="Kurento" \
          DEBEMAIL="kurento@openvidu.io" \
          gbp dch \
              --ignore-branch \
              --git-author \
              --spawn-editor never \
              --new-version "$PACKAGE_VERSION" \
              \
              --release \
              --distribution "testing" \
              --force-distribution \
              \
              debian/ \
          || { echo "ERROR: Command failed: gbp dch"; return 1; }

          # First appearance of "UNRELEASED": Put our commit message
          sed -i "0,/${SNAPSHOT_ENTRY}/{s/${SNAPSHOT_ENTRY}/${RELEASE_ENTRY}/}" \
              debian/changelog \
          || { echo "ERROR: Command failed: sed"; return 2; }

          # Remaining appearances of "UNRELEASED" (if any): Delete line
          sed -i "/${SNAPSHOT_ENTRY}/d" \
              debian/changelog \
          || { echo "ERROR: Command failed: sed"; return 3; }

          git add debian/changelog \
          && git commit -m "$COMMIT_MSG" \
          || { echo "ERROR: Command failed: git"; return 4; }

          gbp tag \
          && gbp push \
          || { echo "ERROR: Command failed: gbp"; return 5; }

          echo "Done!"
      }

      # Run in a subshell where all commands are traced.
      ( set -o xtrace; do_release; )

#. Follow on with releasing Kurento Media Server.



New Development
---------------

**After the whole release has been completed**, bump to a new development version. Do this by incrementing the *Debian revision* number.

The version number (as opposed to the Debian revision) is only changed when the fork gets updated from upstream sources. Meanwhile, we only update the Debian revision.

.. code-block:: shell

   # Change here.
   NEW_VERSION="<NextVersion>"   # Eg.: 1.0.1
   NEW_DEBIAN="<DebianRevision>" # Eg.: 0kurento1

   function do_release {
       local PACKAGE_VERSION="${NEW_VERSION}-${NEW_DEBIAN}"
       local COMMIT_MSG="Bump development version to $PACKAGE_VERSION"

       DEBFULLNAME="Kurento" \
       DEBEMAIL="kurento@openvidu.io" \
       gbp dch \
             --ignore-branch \
             --git-author \
             --spawn-editor never \
             --new-version "$PACKAGE_VERSION" \
             debian/ \
       || { echo "ERROR: Command failed: gbp dch"; return 1; }

       git add debian/changelog \
       && git commit -m "$COMMIT_MSG" \
       || { echo "ERROR: Command failed: git"; return 2; }

       gbp tag \
       && gbp push \
       || { echo "ERROR: Command failed: gbp"; return 3; }

       echo "Done!"
   }

   # Run in a subshell where all commands are traced.
   ( set -o xtrace; do_release; )



.. _dev-release-media-server:

Kurento Media Server
====================

All KMS projects:

.. graphviz:: /images/graphs/dependencies-kms.dot
   :align: center
   :caption: Projects that are part of Kurento Media Server

Release order:

* `kurento-module-creator`_
* `kms-cmake-utils`_
* `kms-jsonrpc`_
* `kms-core`_
* `kms-elements`_
* `kms-filters`_
* `kurento-media-server`_
* `kms-chroma`_
* `kms-crowddetector`_
* `kms-datachannelexample`_
* `kms-markerdetector`_
* `kms-platedetector`_
* `kms-pointerdetector`_



Preparation: kurento-module-creator
-----------------------------------

* If *kurento-maven-plugin* is getting a new version, edit the file ``src/main/templates/maven/model_pom_xml.ftl`` to update it:

  .. code-block:: diff

        <groupId>org.kurento</groupId>
        <artifactId>kurento-maven-plugin</artifactId>
     -  <version>1.0.0</version>
     +  <version>1.1.0</version>



Release steps
-------------

#. Choose the *final release version*, following the SemVer guidelines as explained in :ref:`dev-release-general`.

#. Set the new version. This operation might vary between projects.

#. Commit and tag as needed.

#. Start the `Kurento Build job`_ with the parameters *JOB_RELEASE* **ENABLED** and *JOB_ONLY_KMS* **DISABLED**.

   The *Kurento Build job* is a *Jenkins MultiJob Project*. If it fails at any stage, after fixing the cause of the error there is no need to start the job again from the beginning. Instead, you can resume the build from the point it was before the failure.

   For this, just open the latest build number that failed (with a red marker in the *Build History* panel at the left of the job page); in the description of the build, the action *Resume build* is available on the left side.

#. Wait until all packages get created and published correctly. Fix any issues that might appear.

**All-In-One script**:

.. code-block:: shell

   # Change here.
   NEW_VERSION="<ReleaseVersion>" # Eg.: 1.0.0
   NEW_DEBIAN="<DebianRevision>"  # Eg.: 0kurento1

   cd kms-omni-build/

   # Set the new version.
   ./bin/set-versions.sh "$NEW_VERSION" --debian "$NEW_DEBIAN" \
       --release --commit --tag



Verify and push
---------------

**Before pushing commits**, test that the Kurento API Java module generation works. This is a great way of testing that everything is correct across a variety of components, including Kurento Module Creator, and Kurento Maven Plugin.

First, build the new version (if any) of kurento-module-creator, install it to the local Maven cache, and set the ``PATH`` appropriately:

.. code-block:: shell

   cd kurento-module-creator/
   mvn -DskipTests=false clean install
   export PATH="$PWD/scripts:$PATH"

Then, do the same for kurento-maven-plugin:

.. code-block:: shell

   cd kurento-maven-plugin/
   mvn -DskipTests=false clean install

Install dependencies:

.. code-block:: shell

   apt-get update ; apt-get install --no-install-recommends \
       kurento-module-creator \
       kms-cmake-utils \
       kms-jsonrpc-dev \
       kms-core-dev \
       kms-elements-dev \
       kms-filters-dev

Lastly, attempt to build all modules:

.. code-block:: shell

   cd kms-omni-build/

   function do_release {
       local PROJECTS=(
           kms-core
           kms-elements
           kms-filters
       )

       for PROJECT in "${PROJECTS[@]}"; do
           pushd "$PROJECT" || { echo "ERROR: Command failed: pushd"; return 1; }

           mkdir build/ && cd build/ \
           && cmake .. -DGENERATE_JAVA_CLIENT_PROJECT=TRUE -DDISABLE_LIBRARIES_GENERATION=TRUE \
           && cd java/ \
           && mvn -DskipTests=false clean install \
           || { echo "ERROR: Command failed"; return 1; }

           popd
       done

       echo "Done!"
   }

   # Run in a subshell where all commands are traced.
   ( set -o xtrace; do_release; )

If everything looks good, push commits and tags to the git repo:

.. code-block:: shell

   # Push committed changes.
   git submodule foreach 'git push --follow-tags'
   git push --follow-tags



New Development
---------------

**After the whole release has been completed**, bump to a new development version. Do this by incrementing the *.PATCH* number and resetting the **Debian revision** to 1.

**All-In-One script**:

.. code-block:: shell

   # Change here.
   NEW_VERSION="<NextVersion>"   # Eg.: 1.0.1
   NEW_DEBIAN="<DebianRevision>" # Eg.: 0kurento1

   cd kms-omni-build/

   # Set the new version.
   ./bin/set-versions.sh "$NEW_VERSION" --debian "$NEW_DEBIAN" \
       --new-development --commit

   # Push committed changes.
   git submodule foreach 'git push'

Then start the `Kurento Build job`_ with the parameters *JOB_RELEASE* **DISABLED** and *JOB_ONLY_KMS* **DISABLED**.



.. _dev-release-javascript:

Kurento JavaScript client
=========================

Release order:

* kms-core-javascript (`kurento-client-core-js`_)
* kms-elements-javascript (`kurento-client-elements-js`_)
* kms-filters-javascript (`kurento-client-filters-js`_)

* kms-chroma-javascript (`kurento-module-chroma-js`_)
* kms-crowddetector-javascript (`kurento-module-crowddetector-js`_)
* kms-datachannelexample-javascript (`kurento-module-datachannelexample-js`_)
* kms-markerdetector-javascript (`kurento-module-markerdetector-js`_)
* kms-platedetector-javascript (`kurento-module-platedetector-js`_)
* kms-pointerdetector-javascript (`kurento-module-pointerdetector-js`_)

* `kurento-utils-js`_
* `kurento-jsonrpc-js`_
* `kurento-client-js`_

* `kurento-tutorial-js`_
* `kurento-tutorial-node`_



Release steps
-------------

#. Start the `Kurento JavaScript job`_ and wait for it to finish.

   The *Kurento JavaScript job* is a *Jenkins MultiJob Project*. It will auto-generate the JavaScript Client libraries (from each of the Kurento Media Server modules that contain KMD API Definition files, ``*.kmd.json``), and will commit them to their corresponding repos (see below).

   At this point, all other JavaScript repos which are not auto-generated modules, will get a development build, which is good to verify that their jobs work fine, before the actual release build.

#. Check that the auto-generated API Client JavaScript repos have been updated and tagged with the new version:

   .. warning::

      During release 6.18.0, some of the jobs didn't publish a new version to NPM because the scripts detected a development number; the jobs had to be started manually a second time to make it detect a release number. Watch out because it's possible that there is a bug somewhere in the process.

   - kms-core-javascript -> `kurento-client-core-js`_
   - kms-elements-javascript -> `kurento-client-elements-js`_
   - kms-filters-javascript -> `kurento-client-filters-js`_

   - kms-chroma-javascript -> `kurento-module-chroma-js`_
   - kms-crowddetector-javascript -> `kurento-module-crowddetector-js`_
   - kms-datachannelexample-javascript -> `kurento-module-datachannelexample-js`_
   - kms-markerdetector-javascript -> `kurento-module-markerdetector-js`_
   - kms-platedetector-javascript -> `kurento-module-platedetector-js`_
   - kms-pointerdetector-javascript -> `kurento-module-pointerdetector-js`_

#. Also check that the JavaScript modules have been published by CI:

  - Open each module's page in NPM, and check that the latest version corresponds to the current release:

    - NPM: `kurento-client-core <https://www.npmjs.com/package/kurento-client-core>`__
    - NPM: `kurento-client-elements <https://www.npmjs.com/package/kurento-client-elements>`__
    - NPM: `kurento-client-filters <https://www.npmjs.com/package/kurento-client-filters>`__

  - If any of these are missing, it's probably due to the CI job not running (because the project didn't really contain any code difference from the previous version... happens sometimes when not all repos have changed since the last release). Open CI and run the jobs manually:

    - CI: `kurento_client_core_js_merged <https://ci.openvidu.io/jenkins/job/Development/job/kurento_client_core_js_merged/>`__
    - CI: `kurento_client_elements_js_merged <https://ci.openvidu.io/jenkins/job/Development/job/kurento_client_elements_js_merged/>`__
    - CI: `kurento_client_filters_js_merged <https://ci.openvidu.io/jenkins/job/Development/job/kurento_client_filters_js_merged/>`__

#. Choose the *final release version*, following the SemVer guidelines as explained in :ref:`dev-release-general`.

#. Check there are no uncommitted files.

#. Check latest changes from the main branch.

#. Set the new version. This operation might vary between projects.

#. Check there are no development versions in any of the dependencies.

#. Test the build. Make sure the code is in a working state.

   The most common issue is that the code is not properly formatted. To manually run the beautifier, do this:

   .. code-block:: shell

      npm install

      # To run beautifier over all files, modifying in-place:
      node_modules/.bin/grunt jsbeautifier::default

      # To run beautifier over a specific file:
      node_modules/.bin/grunt jsbeautifier::file:<FilePath>.js

#. Commit and tag as needed.

**All-In-One script**:

.. note::

   The *jq* command-line JSON processor must be installed.

.. code-block:: shell

   # Change here.
   NEW_VERSION="<ReleaseVersion>" # Eg.: 1.0.0

   function do_release {
       local COMMIT_MSG="Prepare release $NEW_VERSION"

       local PROJECTS=(
           kurento-utils-js
           kurento-jsonrpc-js
           kurento-client-js
           kurento-tutorial-js
           kurento-tutorial-node
       )

       for PROJECT in "${PROJECTS[@]}"; do
           pushd "$PROJECT" || { echo "ERROR: Command failed: pushd"; return 1; }

           # Check there are no uncommitted files.
           # Exclude JSON files, to allow re-running this function.
           git diff-index --quiet HEAD -- '!*.json' \
           || { echo "ERROR: Uncommitted files not allowed!"; return 1; }

           # Check latest changes from the main branch.
           git pull --rebase --autostash \
           || { echo "ERROR: Command failed: git pull"; return 1; }

           # Set the new version.
           ./bin/set-versions.sh "$NEW_VERSION" --release --git-add \
           || { echo "ERROR: Command failed: set-versions"; return 1; }

           # Check there are no development versions in any of the dependencies.
           grep -Fr --exclude-dir='*node_modules' --include='*.json' -e '-dev"' -e '"git+' \
           && { echo "ERROR: Development versions not allowed!"; return 1; }

           # Test the build.
           if [[ "$PROJECT" == "kurento-client-js" ]]; then
               # kurento-client-js depends on kurento-jsonrpc-js, so we'll use
               # `npm link` here to solve the dependency.
               # Use a custom Node prefix so `npm link` doesn't require root permissions.
               mkdir -p /tmp/.npm/lib/
               NPM_CONFIG_PREFIX=/tmp/.npm npm link ../kurento-jsonrpc-js
           fi
           if [[ -f package.json ]]; then
               npm install || { echo "ERROR: Command failed: npm install"; return 1; }
           fi
           if [[ -x node_modules/.bin/grunt ]]; then
               node_modules/.bin/grunt jsbeautifier \
               && node_modules/.bin/grunt \
               && node_modules/.bin/grunt sync:bower \
               || { echo "ERROR: Command failed: grunt"; return 1; }
           fi

           popd
       done

       echo "Everything seems OK; proceed to commit and push"

       for PROJECT in "${PROJECTS[@]}"; do
           pushd "$PROJECT" || { echo "ERROR: Command failed: pushd"; return 1; }

           # Commit all modified files.
           git commit -m "$COMMIT_MSG" \
           || { echo "ERROR: Command failed: git commit"; return 1; }

           # Push new commit(s).
           git push \
           || { echo "ERROR: Command failed: git push"; return 1; }

           #git tag -a -m "$COMMIT_MSG" "$NEW_VERSION" \
           #&& git push origin "$NEW_VERSION" \
           #|| { echo "ERROR: Command failed: git tag"; return 1; }
           # NOTE: the CI jobs automatically tag the repos upon releases

           popd
       done

       echo "Done!"
   }

   # Run in a subshell where all commands are traced.
   ( set -o xtrace; do_release; )



Post-Release
------------

When all CI jobs have finished successfully:

* Open the `Nexus Sonatype Staging Repositories`_ section.
* Select **kurento** repository.
* Inspect **Content** to ensure they are as expected:

  - kurento-module-chroma-js
  - kurento-module-crowddetector-js
  - kurento-module-datachannelexample-js
  - kurento-module-markerdetector-js
  - kurento-module-platedetector-js
  - kurento-module-pointerdetector-js

  - kurento-utils-js
  - kurento-jsonrpc-js
  - kurento-client-js

  All of them must appear in the correct version, ``$NEW_VERSION``.

* **Close** repository.
* Wait a bit.
* **Refresh**.
* **Release** repository.
* Maven artifacts will be available `within 30 minutes <https://central.sonatype.org/publish/publish-guide/#releasing-to-central>`__.



New Development
---------------

**After the whole release has been completed**, bump to a new development version. Do this by incrementing the *.PATCH* number.

**All-In-One script**:

.. note::

   The *jq* command-line JSON processor must be installed.

.. code-block:: shell

   # Change here.
   NEW_VERSION="<NextVersion>" # Eg.: 1.0.1

   function do_release {
       local COMMIT_MSG="Prepare for next development iteration"

       local PROJECTS=(
           kurento-jsonrpc-js
           kurento-utils-js
           kurento-client-js
           kurento-tutorial-js
           kurento-tutorial-node
       )

       for PROJECT in "${PROJECTS[@]}"; do
           pushd "$PROJECT" || { echo "ERROR: Command failed: pushd"; return 1; }

           # Set the new version.
           ./bin/set-versions.sh "$NEW_VERSION" --git-add \
           || { echo "ERROR: Command failed: set-versions"; return 1; }

           popd
       done

       echo "Everything seems OK; proceed to commit and push"

       for PROJECT in "${PROJECTS[@]}"; do
           pushd "$PROJECT" || { echo "ERROR: Command failed: pushd"; return 1; }

           # Commit all modified files.
           git commit -m "$COMMIT_MSG" \
           || { echo "ERROR: Command failed: git commit"; return 1; }

           # Push new commit(s).
           git push \
           || { echo "ERROR: Command failed: git push"; return 1; }

           popd
       done

       echo "Done!"
   }

   # Run in a subshell where all commands are traced.
   ( set -o xtrace; do_release; )



.. _dev-release-java:

Kurento Java client
===================

Release order:

* kurento-module-creator-java (*org.kurento.kurento-module-creator*)
* `kurento-maven-plugin`_ (*org.kurento.kurento-maven-plugin*)
* `kurento-qa-pom`_ (*org.kurento.kurento-qa-pom*)

* kms-core-java (*org.kurento.kms-api-core*)
* kms-elements-java (*org.kurento.kms-api-elements*)
* kms-filters-java (*org.kurento.kms-api-filters*)

* `kurento-java`_ (*org.kurento.kurento-client*)

* kms-chroma-java (*org.kurento.module.chroma*)
* kms-crowddetector-java (*org.kurento.module.crowddetector*)
* kms-datachannelexample-java (*org.kurento.module.datachannelexample*)
* kms-markerdetector-java (*org.kurento.module.markerdetector*)
* kms-platedetector-java (*org.kurento.module.platedetector*)
* kms-pointerdetector-java (*org.kurento.module.pointerdetector*)

* `kurento-tutorial-java`_ (*org.kurento.tutorial.\**)
* `kurento-tutorial-test`_

Dependency graph:

.. graphviz:: /images/graphs/dependencies-java.dot
   :align: center
   :caption: Java dependency graph



Preparation: kurento-java
-------------------------

* If *kurento-qa-pom* is getting a new version, edit the file ``kurento-parent-pom/pom.xml`` to update it:

  .. code-block:: diff

        <parent>
            <groupId>org.kurento</groupId>
            <artifactId>kurento-qa-pom</artifactId>
     -      <version>1.0.0</version>
     +      <version>1.1.0</version>
        </parent>

* If *kurento-maven-plugin* is getting a new version, edit the file ``kurento-parent-pom/pom.xml`` to update it:

  .. code-block:: diff

     -  <version.kurento-maven-plugin>1.0.0</version.kurento-maven-plugin>
     +  <version.kurento-maven-plugin>1.1.0</version.kurento-maven-plugin>


* If *kurento-utils-js* is getting a new version, edit the file ``kurento-parent-pom/pom.xml`` to update it:

  .. code-block:: diff

     -  <version.kurento-utils-js>1.0.0</version.kurento-utils-js>
     +  <version.kurento-utils-js>1.1.0</version.kurento-utils-js>



Release steps
-------------

#. Choose the *final release version*, following the SemVer guidelines as explained in :ref:`dev-release-general`.

#. Check there are no uncommitted files.

#. Check latest changes from the main branch.

#. Set the new version. This operation might vary between projects.

#. Check there are no development versions in any of the dependencies.

   In *kurento-java*, all dependencies are defined as properties in the file ``kurento-parent-pom/pom.xml``.

#. Test the build. Make sure the code is in a working state.

   The profile '*kurento-release*' is used to enforce no development versions are present.

#. Commit and tag as needed.

#. Start the `Kurento Java job`_ and wait for it to finish.

   The *Kurento Java job* is a *Jenkins MultiJob Project*. For each Java project, it will use Maven to compile, package, generate JARs with sources and JavaDoc, and finally deploy them to Sonatype Nexus, which is the gateway for publication to Maven Central.

**All-In-One script**:

.. code-block:: shell

   # Change here.
   NEW_VERSION="<ReleaseVersion>" # Eg.: 1.0.0

   function do_release {
       local COMMIT_MSG="Prepare release $NEW_VERSION"

       local PROJECTS=(
           kurento-qa-pom
           kurento-java
           kurento-tutorial-java
           kurento-tutorial-test # FIXME tests fail because Kurento Test Framework needs improvements
       )

       for PROJECT in "${PROJECTS[@]}"; do
           pushd "$PROJECT" || { echo "ERROR: Command failed: pushd"; return 1; }

           # Check there are no uncommitted files.
           # Exclude XML files, to allow re-running this function.
           git diff-index --quiet HEAD -- '!*.xml' \
           || { echo "ERROR: Uncommitted files not allowed!"; return 1; }

           # Check latest changes from the main branch.
           git pull --rebase --autostash \
           || { echo "ERROR: Command failed: git pull"; return 1; }

           # Set the new version.
           ./bin/set-versions.sh "$NEW_VERSION" --kms-api "$NEW_VERSION" --release --git-add \
           || { echo "ERROR: Command failed: set-versions"; return 1; }

           # Check there are no development versions in any of the dependencies.
           grep -Fr --include='pom.xml' -e '-SNAPSHOT' \
           && { echo "ERROR: Development versions not allowed!"; return 1; }

           popd
       done

       echo "Everything seems OK; proceed to commit and push"

       for PROJECT in "${PROJECTS[@]}"; do
           pushd "$PROJECT" || { echo "ERROR: Command failed: pushd"; return 1; }

           # Commit all modified files.
           git commit -m "$COMMIT_MSG" \
           || { echo "ERROR: Command failed: git commit"; return 1; }

           # Push new commit(s).
           git push \
           || { echo "ERROR: Command failed: git push"; return 1; }

           #git tag -a -m "$COMMIT_MSG" "$NEW_VERSION" \
           #&& git push origin "$NEW_VERSION" \
           #|| { echo "ERROR: Command failed: git tag"; return 1; }
           # NOTE: the CI jobs automatically tag the repos upon releases

           popd
       done

       echo "Done!"
   }

   # Run in a subshell where all commands are traced.
   ( set -o xtrace; do_release; )



Post-Release
------------

When all repos have been released, and all CI jobs have finished successfully:

* Open the `Nexus Sonatype Staging Repositories`_ section.
* Select **kurento** repository.
* Inspect **Content** to ensure they are as expected:

  - org.kurento.kurento-module-creator
  - org.kurento.kurento-maven-plugin
  - org.kurento.kurento-qa-pom
  - org.kurento.kms-api-core
  - org.kurento.kms-api-elements
  - org.kurento.kms-api-filters
  - org.kurento.kurento-client
  - org.kurento.module.chroma
  - org.kurento.module.crowddetector
  - org.kurento.module.datachannelexample
  - org.kurento.module.markerdetector
  - org.kurento.module.platedetector
  - org.kurento.module.pointerdetector
  - org.kurento.tutorial.\*

  All of them must appear in the correct version, ``$NEW_VERSION``.

* **Close** repository.
* Wait a bit.
* **Refresh**.
* **Release** repository.
* Maven artifacts will be available `within 30 minutes <https://central.sonatype.org/publish/publish-guide/#releasing-to-central>`__.



New Development
---------------

.. warning::

   You should wait for a full nightly run of the Kurento Media Server pipeline, so the next development packages become available from KMS API modules: *kms-api-core*, *kms-api-elements*, and *kms-api-filters*. This way, the properties in ``kurento-parent-pom/pom.xml`` will get updated to the latest SNAPSHOT version.

**After the whole release has been completed**, bump to a new development version. Do this by incrementing the *.PATCH* number.

**All-In-One script**:

.. code-block:: shell

   # Change here.
   NEW_VERSION="<NextVersion>" # Eg.: 1.0.1

   function do_release {
       local COMMIT_MSG="Prepare for next development iteration"

       local PROJECTS=(
           # FIXME: The interaction between this and kurento-java needs to
           # be addressed in the CI jobs. Probably copying the JAR artifacts.
           #kurento-qa-pom

           kurento-java

           # Do nothing; tutorials are left depending on release versions.
           #kurento-tutorial-java
           #kurento-tutorial-test
       )

       for PROJECT in "${PROJECTS[@]}"; do
           pushd "$PROJECT" || { echo "ERROR: Command failed: pushd"; return 1; }

           # Set the new version.
           ./bin/set-versions.sh "$NEW_VERSION" --kms-api "${NEW_VERSION}-SNAPSHOT" --git-add \
           || { echo "ERROR: Command failed: set-versions"; return 1; }

           # Install the project.
           # * Skip running the tests.
           # * Do not use `-U` because for each project we want Maven to find
           #   the locally installed artifacts from previous $PROJECT.
           mvn -Psnapshot -DskipTests=true clean install \
           || { echo "ERROR: Command failed: mvn clean install"; return 1; }

           popd
       done

       echo "Everything seems OK; proceed to commit and push"

       for PROJECT in "${PROJECTS[@]}"; do
           pushd "$PROJECT" || { echo "ERROR: Command failed: pushd"; return 1; }

           # Commit all modified files.
           git commit -m "$COMMIT_MSG" \
           || { echo "ERROR: Command failed: git commit"; return 1; }

           # Push new commit(s).
           git push \
           || { echo "ERROR: Command failed: git push"; return 1; }

           popd
       done

       echo "Done!"
   }

   # Run in a subshell where all commands are traced.
   ( set -o xtrace; do_release; )



.. _dev-release-docker:

Docker images
=============

A new set of development images is deployed to `Kurento Docker Hub`_ on each nightly build. Besides, a release version will be published as part of the CI jobs chain when the `Kurento Build job`_ is triggered.

The repository `kurento-docker`_ contains *Dockerfile*s for all the `Kurento Docker images`_, however this repo shouldn't be tagged, because it is essentially a "multi-repo" and the tags would be meaningless (because *which one of the sub-dirs would the tag apply to?*).



.. _dev-release-doc:

Kurento documentation
=====================

The documentation scripts will download both Java and JavaScript clients, generate HTML Javadoc / Jsdoc pages from them, and embed everything into a `static section <https://doc-kurento.readthedocs.io/en/latest/features/kurento_client.html#reference-documentation>`__.

For this reason, the documentation must be built only after all the other modules have been released.

#. Write the Release Notes in ``doc-kurento/source/project/relnotes/``.

#. Ensure that the whole nightly CI chain works:

   Job *doc-kurento* -> job *doc-kurento-readthedocs* -> `New build at Read the Docs`_.

#. Edit `VERSIONS.env`_ to set all relevant version numbers: version of the documentation itself, and all referred modules and client libraries.

   These numbers can be different because not all of the Kurento projects are necessarily released with the same frequency. Check each one of the Kurento repositories to verify what is the latest version of each one, and put it in the corresponding variable:

   - ``[VERSION_DOC]``: The docs version shown to readers. Normally same as ``[VERSION_KMS]``.
   - ``[VERSION_KMS]``: Repo `kurento-media-server`_.
   - ``[VERSION_CLIENT_JAVA]``: Repo `kurento-java`_.
   - ``[VERSION_CLIENT_JS]``: Repo `kurento-client-js`_.
   - ``[VERSION_UTILS_JS]``: Repo `kurento-utils-js`_.
   - ``[VERSION_TUTORIAL_JAVA]``: Repo `kurento-tutorial-java`_.
   - ``[VERSION_TUTORIAL_JS]``: Repo `kurento-tutorial-js`_.
   - ``[VERSION_TUTORIAL_NODE]``: Repo `kurento-tutorial-node`_.

#. In *VERSIONS.env*, set *VERSION_RELEASE* to **true**. Remember to set it again to *false* after the release, when starting a new development iteration.

#. Test the build locally, check everything works.

   .. code-block:: shell

      python3 -m venv python_modules
      source python_modules/bin/activate
      python3 -m pip install --upgrade -r requirements.txt
      make html

   Note that the JavaDoc and JsDoc pages won't be generated locally if you don't have your system prepared to do so; also there are some Sphinx constructs or plugins that might fail if you don't have them ready to use, but the Read the Docs servers have them so they should end up working fine.

#. Git add, commit, and push. Trigger a nightly build, where you can **check the result** of the documentation builds to have an idea of how the final release build will end up looking like, at https://doc-kurento.readthedocs.io/en/latest/.

   .. code-block:: shell

      # Change here.
      NEW_VERSION="<ReleaseVersion>" # Eg.: 1.0.0

      COMMIT_MSG="Prepare release $NEW_VERSION"

      # `--all` to include possibly deleted files.
      git add --all \
          VERSIONS.env \
          source/project/relnotes/ \
      && git commit -m "$COMMIT_MSG" \
      && git push \
      || echo "ERROR: Command failed: git"

#. Run the `doc-kurento CI job`_ with the parameter *JOB_RELEASE* **ENABLED**.

#. CI automatically tags Release versions in both Read the Docs source repos `doc-kurento`_ and `doc-kurento-readthedocs`_, so the release will show up in the Read the Docs dashboard.

   .. note::

      If you made a mistake and want to re-create the git tag with a different commit, remember that the re-tagging must be done manually in both *doc-kurento* and *doc-kurento-readthedocs* repos. Read the Docs CI servers will read the latter one to obtain the documentation sources and release tags.

#. Open `Read the Docs Builds`_. If the new version hasn't been detected and built, do it manually: use the *Build Version* button to force a build of the *latest* version. Doing this, Read the Docs will "realize" that there is a new tagged release version of the documentation in the *doc-kurento-readthedocs* repo.

#. **AFTER THE WHOLE RELEASE HAS BEEN COMPLETED**: Set *VERSION_RELEASE* to **false**. Now, create a Release Notes document template where to write changes that will accumulate for the next release.

   **All-In-One** script:

   .. code-block:: shell

      # Change here.
      NEW_VERSION="<NextVersion>" # Eg.: 1.0.1

      function do_release {
          local COMMIT_MSG="Prepare for next development iteration"

          # Set [VERSION_RELEASE]="false"
          sed -r -i 's/\[VERSION_RELEASE\]=.*/[VERSION_RELEASE]="false"/' VERSIONS.env \
          || { echo "ERROR: Command failed: sed"; return 1; }

          # Set [VERSION_DOC]
          local VERSION_DOC="${NEW_VERSION}-dev"
          sed -r -i "s/\[VERSION_DOC\]=.*/[VERSION_DOC]=\"$VERSION_DOC\"/" VERSIONS.env \
          || { echo "ERROR: Command failed: sed"; return 2; }

          # Add a new Release Notes document
          local RELNOTES_NAME="v${NEW_VERSION//./_}"
          cp source/project/relnotes/v0_TEMPLATE.rst \
              "source/project/relnotes/${RELNOTES_NAME}.rst" \
          && sed -i "s/1.2.3/${NEW_VERSION}/" \
              "source/project/relnotes/${RELNOTES_NAME}.rst" \
          && sed -i "8i\   $RELNOTES_NAME" \
              source/project/relnotes/index.rst \
          || { echo "ERROR: Command failed: sed"; return 3; }

          git add \
              VERSIONS.env \
              source/project/relnotes/ \
          && git commit -m "$COMMIT_MSG" \
          && git push \
          || { echo "ERROR: Command failed: git"; return 4; }

          echo "Done!"
      }

      # Run in a subshell where all commands are traced
      ( set -o xtrace; do_release; )



.. Kurento links

.. _kurento-media-server/CHANGELOG.md: https://github.com/Kurento/kurento-media-server/blob/master/CHANGELOG.md
.. _kms-omni-build/bin/set-versions.sh: https://github.com/Kurento/kms-omni-build/blob/master/bin/set-versions.sh
.. _Kurento Docker Hub: https://hub.docker.com/u/kurento
.. _Kurento Docker images: https://hub.docker.com/r/kurento/kurento-media-server
.. _kurento-docker: https://github.com/Kurento/kurento-docker
.. _Kurento Build job: https://ci.openvidu.io/jenkins/job/Development/job/00_KMS_BUILD_ALL/
.. _Kurento JavaScript job: https://ci.openvidu.io/jenkins/job/Development/job/00_KURENTO_JAVASCRIPT_ALL/
.. _Kurento Java job: https://ci.openvidu.io/jenkins/job/Development/job/00_KURENTO_JAVA_ALL/
.. _doc-kurento CI job: https://ci.openvidu.io/jenkins/job/Development/job/kurento_doc_merged/
.. _doc-kurento: https://github.com/Kurento/doc-kurento
.. _doc-kurento-readthedocs: https://github.com/Kurento/doc-kurento-readthedocs
.. _VERSIONS.env: https://github.com/Kurento/doc-kurento/blob/0e80f4c3aef3db6e46205ebf0075c00d2f20596b/VERSIONS.env



.. GitHub links
.. _jsoncpp: https://github.com/Kurento/jsoncpp
.. _libsrtp: https://github.com/Kurento/libsrtp
.. _openh264: https://github.com/Kurento/openh264
.. _openh264-gst-plugin: https://github.com/Kurento/openh264-gst-plugin
.. _libusrsctp: https://github.com/Kurento/libusrsctp
.. _gstreamer: https://github.com/Kurento/gstreamer
.. _gst-plugins-base: https://github.com/Kurento/gst-plugins-base
.. _gst-plugins-good: https://github.com/Kurento/gst-plugins-good
.. _gst-plugins-bad: https://github.com/Kurento/gst-plugins-bad
.. _gst-plugins-ugly: https://github.com/Kurento/gst-plugins-ugly
.. _gst-libav: https://github.com/Kurento/gst-libav
.. _openwebrtc-gst-plugins: https://github.com/Kurento/openwebrtc-gst-plugins
.. _libnice: https://github.com/Kurento/libnice

.. _kurento-module-creator: https://github.com/Kurento/kurento-module-creator
.. _kurento-maven-plugin: https://github.com/Kurento/kurento-maven-plugin
.. _kms-cmake-utils: https://github.com/Kurento/kms-cmake-utils
.. _kms-jsonrpc: https://github.com/Kurento/kms-jsonrpc
.. _kms-core: https://github.com/Kurento/kms-core
.. _kms-elements: https://github.com/Kurento/kms-elements
.. _kms-filters: https://github.com/Kurento/kms-filters
.. _kurento-media-server: https://github.com/Kurento/kurento-media-server
.. _kms-chroma: https://github.com/Kurento/kms-chroma
.. _kms-crowddetector: https://github.com/Kurento/kms-crowddetector
.. _kms-datachannelexample: https://github.com/Kurento/kms-datachannelexample
.. _kms-markerdetector: https://github.com/Kurento/kms-markerdetector
.. _kms-platedetector: https://github.com/Kurento/kms-platedetector
.. _kms-pointerdetector: https://github.com/Kurento/kms-pointerdetector

.. _kurento-client-core-js: https://github.com/Kurento/kurento-client-core-js
.. _kurento-client-elements-js: https://github.com/Kurento/kurento-client-elements-js
.. _kurento-client-filters-js: https://github.com/Kurento/kurento-client-filters-js
.. _kurento-module-chroma-js: https://github.com/Kurento/kurento-module-chroma-js
.. _kurento-module-crowddetector-js: https://github.com/Kurento/kurento-module-crowddetector-js
.. _kurento-module-datachannelexample-js: https://github.com/Kurento/kurento-module-datachannelexample-js
.. _kurento-module-markerdetector-js: https://github.com/Kurento/kurento-module-markerdetector-js
.. _kurento-module-platedetector-js: https://github.com/Kurento/kurento-module-platedetector-js
.. _kurento-module-pointerdetector-js: https://github.com/Kurento/kurento-module-pointerdetector-js

.. _kurento-jsonrpc-js: https://github.com/Kurento/kurento-jsonrpc-js
.. _kurento-utils-js: https://github.com/Kurento/kurento-utils-js
.. _kurento-client-js: https://github.com/Kurento/kurento-client-js
.. _kurento-tutorial-js: https://github.com/Kurento/kurento-tutorial-js
.. _kurento-tutorial-node: https://github.com/Kurento/kurento-tutorial-node

.. _kurento-qa-pom: https://github.com/Kurento/kurento-qa-pom
.. _kurento-java: https://github.com/Kurento/kurento-java
.. _kurento-tutorial-java: https://github.com/Kurento/kurento-tutorial-java
.. _kurento-tutorial-test: https://github.com/Kurento/kurento-tutorial-test



.. External links

.. _Debian Policy Manual: https://www.debian.org/doc/debian-policy/ch-controlfields.html#version
.. _Maven Versions Plugin: https://www.mojohaus.org/versions-maven-plugin/set-mojo.html#nextSnapshot
.. _Nexus Sonatype Staging Repositories: https://oss.sonatype.org/#stagingRepositories
.. _Semantic Versioning: https://semver.org/spec/v2.0.0.html#summary
.. _this Ask Ubuntu answer: https://askubuntu.com/questions/620533/what-is-the-meaning-of-the-xubuntuy-string-in-ubuntu-package-names/620539#620539
.. _Read the Docs Builds: https://readthedocs.org/projects/doc-kurento/builds/
.. _New build at Read the Docs: https://readthedocs.org/projects/doc-kurento/builds/
.. _Read the Docs Advanced Settings: https://readthedocs.org/dashboard/doc-kurento/advanced/
