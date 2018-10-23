===============
Developer Guide
===============

This section is a comprehensive guide for development of *Kurento itself*. The intended reader of this text is any person who wants to get involved in writing code for the Kurento project, or to understand how the source code of this project is structured.

If you are looking to write applications that make use of Kurento, then you should read :doc:`/user/writing_applications`.

.. contents:: Table of Contents



Introduction
============

This is an overview of the tools and technologies used by KMS:

- The code is written in C and C++ languages.
- The code style is heavily influenced by that of Gtk and GStreamer projects.
- CMake is the build tool of choice, and is used to build all modules.
- Source code is versioned in several GitHub repositories.
- The officially supported platforms are Ubuntu LTS distributions: 14.04 (Trusty) and 16.04 (Xenial).
- The GStreamer multimedia framework sits at the heart of Kurento Media Server.
- In addition to GStreamer, KMS uses other libraries like boost, jsoncpp, libnice, etc.



.. _dev-code-repos:

Code Repositories
=================

Kurento source code is stored in several GitHub repositories at https://github.com/Kurento. Each one of these repositories has a specific purpose and usually contains the code required to build a shared library of the same name.

An overview of the relationships between all repos forming the Kurento Media Server:

.. graphviz:: /images/graphs/dependencies-all.dot
   :align: center
   :caption: All dependency relationships

As the dependency graph is not strictly linear, there are multiple possible ways to order all modules into a linear dependency list; this section provides one possible order, which will be consistently used through all Kurento documents.

**Fork Repositories**:

KMS depends on several open source libraries, the main one being GStreamer. Sometimes these libraries show specific behaviors that need to be tweaked in order to be useful for KMS; other times there are bugs that have been fixed but the patch is not accepted at the upstream source for whatever reason. In these situations, while the official path of feature requests and/or patch submit is still tried, we have created a fork of the affected libraries.

- `jsoncpp <https://github.com/Kurento/jsoncpp>`__
- `libsrtp <https://github.com/Kurento/libsrtp>`__
- `openh264 <https://github.com/Kurento/openh264>`__
- `usrsctp <https://github.com/Kurento/usrsctp>`__
- `gstreamer <https://github.com/Kurento/gstreamer>`__ (produces libgstreamer1.5)
- `gst-plugins-base <https://github.com/Kurento/gst-plugins-base>`__
- `gst-plugins-good <https://github.com/Kurento/gst-plugins-good>`__
- `gst-plugins-bad <https://github.com/Kurento/gst-plugins-bad>`__
- `gst-plugins-ugly <https://github.com/Kurento/gst-plugins-ugly>`__
- `gst-libav <https://github.com/Kurento/gst-libav>`__
- `openwebrtc-gst-plugins <https://github.com/Kurento/openwebrtc-gst-plugins>`__
- `libnice <https://github.com/Kurento/libnice>`__ (produces gstreamer1.0-nice, gstreamer1.5-nice)

**Main Repositories**

- `kurento-module-creator <https://github.com/Kurento/kurento-module-creator>`__: It is a code generation tool for generating code scaffolding for plugins. This code includes KMS code and Kurento client code. It has mainly Java code.
- `kms-cmake-utils <https://github.com/Kurento/kms-cmake-utils>`__: Contains a set of utilities for building KMS with CMake.
- `kms-jsonrpc <https://github.com/Kurento/kms-jsonrpc>`__: Kurento protocol is based on JsonRpc, and makes use of a JsonRpc library contained in this repository. It has C++ code.
- `kms-core <https://github.com/Kurento/kms-core>`__: Contains the core GStreamer code. This is the base library that is needed for other libraries. It has 80% C code and a 20% C++ code.
- `kms-elements <https://github.com/Kurento/kms-elements>`__: Contains the main elements offering pipeline capabilities like WebRtc, Rtp, Player, Recorder, etc. It has 80% C code and a 20% C++ code.
- `kms-filters <https://github.com/Kurento/kms-filters>`__: Contains the basic video filters included in KMS. It has 65% C code and a 35% C++ code.
- `kurento-media-server <https://github.com/Kurento/kurento-media-server>`__: Contains the main entry point of KMS. That is, the main() function for the server executable code. This program depends on libraries located in the above repositories. It has mainly C++ code.

**Extra Repositories**

KMS is distributed with some basic GStreamer pipeline elements, but other elements are available in form of modules.
These modules are *demos* of what third party modules could be written and integrated into Kurento. These are just for instructional purposes, and shouldn't be used in production servers.

- `kms-chroma <https://github.com/Kurento/kms-chroma>`__
- `kms-crowddetector <https://github.com/Kurento/kms-crowddetector>`__
- `kms-platedetector <https://github.com/Kurento/kms-platedetector>`__
- `kms-pointerdetector <https://github.com/Kurento/kms-pointerdetector>`__

**Omni-Build Repository**

This repository is an special project because it is designed to build all KMS Main Repositories from a single entry point. This repo brings the other KMS Main Repositories as Git submodules: it makes KMS development easier because if you build this project, you don’t need to manually install the libraries of the other KMS Main Repositories. However, all other development and support libraries must still be installed manually.

- `kms-omni-build <https://github.com/Kurento/kms-omni-build>`__

**Client Repositories**

Application Servers can be developed in Java, JavaScript with Node.js, or JavaScript directly in the browser. Each of these languages have their support tools made available in their respective repositories.

- `kurento-client-js <https://github.com/Kurento/kurento-client-js>`__ (Node.js Application Servers, browser JavaScript)
- `kurento-java <https://github.com/Kurento/kurento-java>`__ (Java Application Servers)

**Tutorial or demo repositories**

There are several repositories that contain sample code for developers that use Kurento or want to develop a custom Kurento module. Currently these are:

- `kms-datachannelexample <https://github.com/Kurento/kms-datachannelexample>`__
- `kms-opencv-plugin-sample <https://github.com/Kurento/kms-opencv-plugin-sample>`__
- `kms-plugin-sample <https://github.com/Kurento/kms-plugin-sample>`__
- `kurento-tutorial-java <https://github.com/Kurento/kurento-tutorial-java>`__
- `kurento-tutorial-js <https://github.com/Kurento/kurento-tutorial-js>`__
- `kurento-tutorial-node <https://github.com/Kurento/kurento-tutorial-node>`__

A KMS developer must know how to work with KMS Fork and Main Repositories and understand that each of these have a different development life cycle. The majority of development for KMS will occur at theK MS Main Repositories, while it's unusual to make changes in Fork Repositories except for updating their upstream versions.



Development 101
===============

KMS is a C/C++ project developed with an Ubuntu system as main target, which means that its dependency management and distribution is based on the Debian package system.



Libraries
---------

It is not a trivial task to configure the compiler to use a set of libraries because a library can be composed of several *.so* and *.h* files. To make this task easier, `pkg-config <https://www.freedesktop.org/wiki/Software/pkg-config>`__ is used when compiling programs and libraries. In short: when a library is installed in a system, it registers itself in the ``pkg-config`` database with all its required files, which allows to later query those values in order to compile with the library in question.

For example, if you want to compile a C program which depends on GLib 2.0, you can run:

.. code-block:: bash

   gcc -o program program.c $(pkg-config --libs --cflags glib-2.0)



Debian packages
---------------

In a Debian/Ubuntu system, development libraries are distributed as Debian packages which are made available in public package repositories. When a C or C++ project is developed in these systems, it is usual to distribute it also in Debian packages. It is then possible to install them with the command ``apt-get install``, which will handle automatically all the package's dependencies.

When a library is packaged, the result usually consists of several packages. These are some pointers on the most common naming conventions for packages, although they are not always strictly enforced by Debian or Ubuntu maintainers:

- **bin package**: Package containing the binary files for the library itself. Programs are linked against them during development, and they are also loaded in production. The package name starts with *lib*, followed by the name of the library.
- **dev package**: Contains files needed to link with the library during development. The package name starts with *lib* and ends with *-dev*. For example: *libboost-dev* or *libglib2.0-dev*.
- **dbg package**: Contains debug symbols to ease error debugging during development. The package name starts with *lib* and ends with *-dbg*. For example: *libboost-dbg*.
- **doc package**: Contains documentation for the library. Used in development. The package name starts with *lib* and ends with *-doc*. For example: *libboost-doc*.
- **src package**: Package containing the source code for the library. It uses the same package name as the bin version, but it is accessed with the command ``apt-get source`` instead of ``apt-get install``.



Build tools
-----------

There are several tools for building C/C++ projects: Autotools, Make, CMake, Gradle, etc. The most prominent tool for building projects is the Makefile, and all the other tools tend to be simply wrappers around this one. KMS uses CMake, which generates native Makefiles to build and package the project. There are some IDEs that recognize CMake projects directly, such as `JetBrains CLion <https://www.jetbrains.com/clion/>`__ or `Qt Creator <https://www.qt.io/ide/>`__.

A CMake projects consists of several *CMakeLists.txt* files, which define how to compile and package native code into binaries and shared libraries. These files also contain a list of the libraries (dependencies) needed to build the code.

To specify a dependency it is necessary to know how to configure this library in the compiler. The already mentioned ``pkg-config`` tool is the standard de-facto for this task, so CMake comes with the ability to use ``pkg-config`` under the hood. There are also some libraries built with CMake that use some specific CMake-only utilities.



.. _dev-sources:

Building from sources
=====================

To work directly with KMS source code, or to just build KMS from sources, the easiest way is using the module **kms-omni-build**. Just follow these steps:

1. Add the Kurento repository to your system configuration.
2. Install development packages: tools like Git, GCC, CMake, etc., and KMS development libraries.
3. Clone **kms-omni-build**.
4. Build with CMake and Make.
5. Run the newly compiled KMS.
6. Run KMS tests.



.. _dev-repository:

Add Kurento repository
----------------------

These steps are pretty much the same as those explained in :ref:`installation-local`, with the only change of using a different package repository.

**First Step**. Define what version of Ubuntu is installed in your system. Open a terminal and copy **only one** of these lines:

.. code-block:: bash

   # Choose one:
   DISTRO="trusty"  # KMS for Ubuntu 14.04 (Trusty)
   DISTRO="xenial"  # KMS for Ubuntu 16.04 (Xenial)

**Second Step**. Add the Kurento repository to your system configuration. Run these two commands in the same terminal you used in the previous step:

.. code-block:: text

   sudo apt-key adv --keyserver keyserver.ubuntu.com --recv-keys 5AFA7A83

   sudo tee "/etc/apt/sources.list.d/kurento.list" >/dev/null <<EOF
   # Kurento Media Server - Pre-Release packages
   deb [arch=amd64] http://ubuntu.openvidu.io/dev $DISTRO kms6
   EOF



Install development packages
----------------------------

Run:

.. code-block:: bash

    PACKAGES=(
      # Development tools
      build-essential
      cmake
      debhelper
      default-jdk
      gdb
      git openssh-client
      maven
      pkg-config
      wget

      # 'maven-debian-helper' installs an old Maven version in Ubuntu 14.04 (Trusty),
      # so this ensures that the effective version is the one from 'maven'.
      maven-debian-helper-

      # System development libraries
      libboost-dev
      libboost-filesystem-dev
      libboost-log-dev
      libboost-program-options-dev
      libboost-regex-dev
      libboost-system-dev
      libboost-test-dev
      libboost-thread-dev
      libevent-dev
      libglib2.0-dev
      libglibmm-2.4-dev
      libopencv-dev
      libsigc++-2.0-dev
      libsoup2.4-dev
      libssl-dev
      libvpx-dev
      libxml2-utils
      uuid-dev

      # Kurento external libraries
      gstreamer1.5-plugins-base
      gstreamer1.5-plugins-good
      gstreamer1.5-plugins-bad
      gstreamer1.5-plugins-ugly
      gstreamer1.5-libav
      gstreamer1.5-nice
      gstreamer1.5-tools
      gstreamer1.5-x
      libgstreamer1.5-dev
      libgstreamer-plugins-base1.5-dev
      libnice-dev
      openh264-gst-plugins-bad-1.5
      openwebrtc-gst-plugins-dev
      kmsjsoncpp-dev
      ffmpeg
    )

    sudo apt-get update
    sudo apt-get install "${PACKAGES[@]}"



Download KMS
------------

Run:

.. code-block:: bash

   git clone https://github.com/Kurento/kms-omni-build.git
   cd kms-omni-build/
   git submodule update --init --recursive
   git submodule update --remote

.. note::

   ``--recursive`` and ``--remote`` are not used together, because each individual submodule may have some other submodules that are intended to be loaded in some specific commit, and we don't want to update those with upstream's latest changes.

Change to the *master* branch of each submodule, if you will be developing on each one of those:

.. code-block:: text

   REF=master
   for d in $(find . -maxdepth 1 -mindepth 1 -type d)
   do pushd $d ; git checkout "$REF" ; popd ; done

You can also set ``REF`` to any other branch or tag, such as ``REF=6.7.1``. This will bring the code to the state it had in that version.



Build KMS
---------

Run:

.. code-block:: text

   TYPE=Debug
   mkdir build-$TYPE
   cd build-$TYPE/
   cmake -DCMAKE_BUILD_TYPE=$TYPE ..
   make

CMake accepts the following build types: *Debug*, *Release*, *RelWithDebInfo*. So, for a Release build, you would run ``TYPE=Release`` instead of ``TYPE=Debug``.

.. note::

   The standard way of compiling a project with CMake is to create a *build* directory and run the ``cmake`` and ``make`` commands from there. This allows the developer to have different build folders for different purposes. However **do not use this technique** if you are trying to compile a subdirectory of **kms-omni-build**. For example, if you do this to build *kms-ombi-build/kms-core*, no more that one build folder can be present at a time in *kms-ombi-build/kms-core/build*. If you want to keep several builds of a single module, it is better to just work on a separate Git clone of that repository.

It is also possible to enable GCC's AddressSanitizer or ThreadSanitizer with these flags:

.. code-block:: text

   -DENABLE_ANALYZER_ASAN=ON  # Enable the AddressSanitizer (aka ASan) memory error detector. Implies ``CMAKE_BUILD_TYPE=Release``.
   -DSANITIZE_ADDRESS=ON
   -DSANITIZE_THREAD=ON
   -DSANITIZE_LINK_STATIC=ON

[TODO: finish testing that these modes do actually work]

Verbose mode can be enabled too:

.. code-block:: text

   -DCMAKE_VERBOSE_MAKEFILE=ON

Lastly, it's possible to run either Unit tests or Valgrind tests, by using different *make* targets:

.. code-block:: text

   make check
   make valgrind



Launch KMS
----------

Run:

.. code-block:: bash

   export GST_DEBUG="3,Kurento*:4,kms*:4,sdp*:4,webrtc*:4,*rtpendpoint:4,rtp*handler:4,rtpsynchronizer:4,agnosticbin:4"

   kurento-media-server/server/kurento-media-server \
       --modules-path=. \
       --modules-config-path=./config \
       --conf-file=./config/kurento.conf.json \
       --gst-plugin-path=.

You can set the logging level of specific categories with the option ``--gst-debug``, which can be used multiple times, once for each category. Besides that, the global logging level is specified with ``--gst-debug-level``. These values can also be defined in the environment variable ``GST_DEBUG`` (see :doc:`/features/logging`).

Other launch options that could be useful:

.. code-block:: text

   --logs-path, -d <Path> : Path where rotating log files will be stored
   --log-file-size, -s <Number> : Maximum file size for log files, in MB
   --number-log-files, -n <Number> : Maximum number of log files to keep

More launch options, handled by GStreamer:
https://gstreamer.freedesktop.org/data/doc/gstreamer/head/gstreamer/html/gst-running.html



KMS Unit Tests
--------------

KMS uses the Check unit testing framework for C (https://libcheck.github.io/check/). To build and run all tests, change the last one of the build commands from ``make`` to ``make check``. All available tests will run, and a summary report will be shown at the end.

.. note::

   It is recommended to first disable GStreamer log colors, that way the resulting log files won't contain extraneous escape sequences such as ``^[[31;01m ^[[00m``. Also, it could be useful to specify a higher logging level than the default; set the environment variable *GST_DEBUG*, as explained in :ref:`logging-levels`.

   The complete command would look like this:

   .. code-block:: bash

      export GST_DEBUG_NO_COLOR=1
      export GST_DEBUG="3,check:5"
      make check

The log output of the whole test suite will get saved into the file *./Testing/Temporary/LastTest.log*. To find the starting point of each individual test inside this log file, search for the words "*test start*". For the start of a specific test, search for "*{TestName}: test start*". For example:

.. code-block:: text

   webrtcendpoint.c:1848:test_vp8_sendrecv: test start

To build and run one specific test, use ``make {TestName}.check``. For example:

.. code-block:: text

   make test_agnosticbin.check

If you want to analyze memory usage with Valgrind, use ``make {TestName}.valgrind``. For example:

.. code-block:: text

   make test_agnosticbin.valgrind



.. _dev-clean:

Clean up your system
--------------------

To leave the system in a clean state, remove all KMS packages and related development libraries. Run this command and, for each prompted question, visualize the packages that are going to be uninstalled and press Enter if you agree. This command is used on a daily basis by the development team at Kurento with the option ``--yes`` (which makes the process automatic and unattended), so it should be fairly safe to use. However we don't know what is the configuration of your particular system, and running in manual mode is the safest bet in order to avoid uninstalling any unexpected package.

Run:

.. code-block:: text

    PACKAGES=(
      # KMS main components + extra modules
      '^(kms|kurento).*'

      # Kurento external libraries
      ffmpeg
      '^gir1.2-gst.*1.5'
      gir1.2-nice-0.1
      '^(lib)?gstreamer.*1.5.*'
      '^lib(nice|s3-2|srtp|usrsctp).*'
      '^srtp-.*'
      '^openh264(-gst-plugins-bad-1.5)?'
      '^openwebrtc-gst-plugins.*'

      # System development libraries
      '^libboost-?(filesystem|log|program-options|regex|system|test|thread)?-dev'
      '^lib(glib2.0|glibmm-2.4|opencv|sigc++-2.0|soup2.4|ssl|tesseract|vpx)-dev'
      uuid-dev
    )

    # Run a loop over all package names and uninstall them.
    for PACKAGE in "${PACKAGES[@]}"; do
      sudo apt-get purge --auto-remove "$PACKAGE" || { echo "Skip unexisting"; }
    done



Working on a forked library
===========================

These are the two typical workflows used to work with fork libraries:



Full cycle
----------

This workflow has the easiest and fastest setup, however it also is the slowest one. To make a change, you would edit the code in the library, then build it, generate Debian packages, and lastly install those packages over the ones already installed in your system. It would then be possible to run KMS and see the effect of the changes in the library.

This is of course an extremely cumbersome process to follow during anything more complex than a couple of edits in the library code.



In-place linking
----------------

The other work method consists on changing the system library path so it points to the working copy where the fork library is being modified. Typically, this involves building the fork with its specific tool (which often is Automake), changing the environment variable ``LD_LIBRARY_PATH``, and running KMS with such configuration that any required shared libraries will load the modified version instead of the one installed in the system.

This allows for the fastest development cycle, however the specific instructions to do this are very project-dependent. For example, when working on the GStreamer fork, maybe you want to run GStreamer without using any of the libraries installed in the system (see https://cgit.freedesktop.org/gstreamer/gstreamer/tree/scripts/gst-uninstalled).

[TODO: Add concrete instructions for every forked library]



Debian packaging
================

You can easily create Debian packages for KMS itself and for any of the forked libraries. Packages are generated by a Python script called *compile_project.py*, which can be found in the `adm-scripts <https://github.com/Kurento/adm-scripts>`__ repository, and you can use it to generate Debian packages locally in your machine. Versions number of all packages are timestamped, so a developer is able to know explicitly which version of each package has been installed at any given time.

Follow these steps to generate Debian packages from any of the Kurento repositories:

1. (**Optional**) Make sure the system is in a clean state. The section :ref:`dev-clean` explains how to do this.

2. (**Optional**) Add Kurento Packages Repository. The section about :ref:`Dependency resolution <dev-depresolution>` explains what is the effect of adding the repo, and the section :ref:`dev-repository` explains how to do this.

3. Install system tools and Python modules. Run:

   .. code-block:: bash

      PACKAGES=(
        build-essential
        debhelper
        curl
        fakeroot
        flex
        git openssh-client
        libcommons-validator-java
        python
        python-apt
        python-debian
        python-git
        python-requests
        python-yaml
        subversion
        wget
      )

      sudo apt-get update
      sudo apt-get install "${PACKAGES[@]}"

   .. note::

      - ``flex`` will be automatically installed by GStreamer, but for now a bug in package version detection prevents that.
      - ``libcommons-validator-java`` seems to be required to build *gstreamer* (it failed with lots of errors from *jade*, when building documentation files).
      - ``subversion`` (svn) is used in the Python build script (*compile_project.py*) due to GitHub's lack of support for git-archive protocol (see https://github.com/isaacs/github/issues/554).

4. Download the Kurento CI scripts and the desired module. Run:

   .. code-block:: text

      git clone https://github.com/Kurento/adm-scripts.git
      git clone https://github.com/Kurento/kms-core.git

   But instead of *kms-core*, use the one you intend to build.

5. Build packages for the desired module. Run:

   .. code-block:: text

      sudo -s
      cd kms-core/

      export PYTHONUNBUFFERED=1
      export PATH="$PWD/../adm-scripts:$PATH"

      ../adm-scripts/kms/compile_project.py \
          --base_url https://github.com/Kurento \
          compile

   Other variable you can export is ``DEB_BUILD_OPTIONS``, in order to disable any of unit testing, doc generation (which at the Debian level is mostly nothing, this doesn't refer to the whole Kurento project documentation site), and binary stripping. For example:

   .. code-block:: text

      export DEB_BUILD_OPTIONS="nocheck nodoc nostrip"



.. _dev-depresolution:

Dependency resolution: to repo or not to repo
---------------------------------------------

The script *compile_project.py* is able to resolve all dependencies for any given module. For each dependency, the following process will happen:

1. If the dependency is already available to ``apt-get`` from the Kurento Packages Repository, it will get downloaded and installed. This means that the dependency will not get built locally.

2. If the dependency is not available to ``apt-get``, its corresponding project will be cloned from the Git repo, built, and packaged itself. This triggers a recursive call to *compile_project.py*, which in turn will try to satisfy all the dependencies corresponding to that sub-project.

It is very important to keep in mind the dependency resolution mechanism that happens in the Python script, because it can affect which packages get built in the development machine. **If the Kurento Packages Repository has been configured for ``apt-get``, then all dependencies for a given module will be downloaded and installed from the repo, instead of being built**. On the other hand, if the Kurento repo has not been configured, then all dependencies will be built from source.

This can have a very big impact on the amount of modules that need to be built to satisfy the dependencies of a given project. The most prominent example is **kurento-media-server**: it basically depends on *everything* else. If the Kurento repo is available to ``apt-get``, then all of KMS libraries will be downloaded and installed. If the repo is not available, then all source code of KMS will get downloaded and built, including the whole GStreamer libraries and other forked libraries.

.. note::

   This only applies to Ubuntu 16.04 (Xenial), for which the official package repositories already contain all required development libraries to build the whole KMS. However, for Ubuntu 14.04 (Trusty) the official repos are missing some required packages, so the Kurento Packages Repository must be configured in the system in order to build all of KMS. Refer to the following sections.



Package generation script
-------------------------

This is the full procedure followed by the *compile_project.py* script:

1. Check if all development dependencies for the given module are installed in the system. This check is done by parsing the file *debian/control* of the project.
2. If some dependencies are not installed, ``apt-get`` tries to install them.
3. For each dependency defined in the file *.build.yaml*, the script checks if it got installed during the previous step. If it wasn't, then the script checks if these dependencies can be found in the source code repository given as argument. The script then proceeds to find this dependency's real name and requirements by checking its online copy of the *debian/control* file.
4. Every dependency with source repository, as found in the previous step, is cloned and the script is run recursively with that module.
5. When all development dependencies are installed (either from package repositories or compiling from source code), the initially requested module is built, and its Debian packages are generated and installed.



Building KMS on Ubuntu 14.04 (Trusty)
-------------------------------------

KMS cannot be built in Trusty without adding the Kurento Packages Repository, because some of the system development libraries are required in a more recent version than the one available by default in the official Ubuntu Trusty repos. This is a non exhaustive list of those required libraries, compared with the versions available in Xenial and in the Kurento repo:

================  ===============================  ==============  ==============  ===============  =====
Name              Requirement                      In Trusty repo  In Xenial repo  In Kurento repo  Notes
================  ===============================  ==============  ==============  ===============  =====
kms-core          libglib2.0-dev (>= 2.46)         2.40            2.48            2.46             [1]
gst-plugins-base  libsoup2.4-dev (>= 2.48)         2.44            2.52            2.50
libsrtp           libssl-dev (>= 1.0.2)            1.0.1f          1.0.2g          1.0.2g
gst-plugins-bad   libde265-dev (any)               none            1.0.2           0.9
gst-plugins-bad   libx265-dev (any)                none            1.9             1.7
gst-plugins-bad   libass-dev (>= 0.10.2)           0.10.1          0.13.1          0.10.2
gst-plugins-bad   libgnutls28-dev, librtmp-dev                                                      [2]
kms-elements      libnice-dev (>= 0.1.13)          0.1.4           0.1.13          0.1.13
libnice           libgupnp-igd-1.0-dev (>= 0.2.4)  0.2.2           0.2.4           0.2.4
================  ===============================  ==============  ==============  ===============  =====

[1] It actually builds and works fine with 2.40, but the required version of GLib was first raised from 2.40 to 2.42 and later to 2.46 in commits ``b10d318b`` and ``7f703bed``, justified as providing huge performance improvements in ``mutex`` and ``g_object_ref``.

[2] The latter depends on *libgnutls-dev*, which conflicts with the former (only in 14.04). Solution: use *librtmp-dev* from Kurento repo, which doesn't depend on *libgnutls-dev*.

This list of dependencies means that it is not possible to build the whole KMS on Ubuntu Trusty, at least not without the Kurento Packages Repository already configured in the system. But as we mentioned in the previous section, the mere presence of this repo will skip building as many packages as possible if the build script is able to find them already available for install with ``apt-get``.

In case that we want to force building the whole KMS libraries and modules -*as opposed to downloading them from the repo*- the solution to this problem is to clone each module separately, and manually build them one by one, in the order given by their :ref:`dev-code-repos`.



How-To
======

How to add or update external libraries
---------------------------------------

Add or change it in these files:

- *debian/control*.
- *CMakeLists.txt*.



How to add new fork libraries
-----------------------------

1. Fork the repository.
2. Create a *.build.yaml* file in this repository, listing its project dependencies (if any).
3. Add dependency to *debian/control* in the project that uses it.
4. Add dependency to *CMakeLists.txt* in the project that uses it.



How to work with API changes
----------------------------

What to do when you are developing a new feature that spans across KMS and the public API? This is a summary of the actions done in CI by ``adm-scripts/kurento_generate_java_module.sh`` and ``adm-scripts/kurento_maven_deploy.sh``:

1. Work on your changes, which may include changing the KMS files where the Kurento API is defined.

2. Generate client SDK dependencies:

   .. code-block:: bash

      cd <module>  # E.g. kms-filters
      rm -rf build
      mkdir build && cd build
      cmake .. -DGENERATE_JAVA_CLIENT_PROJECT=TRUE -DDISABLE_LIBRARIES_GENERATION=TRUE
      cd java
      mvn clean install

3. Generate client SDK:

   .. code-block:: bash

      cd kurento-java
      mvn clean install

4. At this point, the new Java packages have been generated and installed *in the local repository*. Your Java application can now make use of any changes that were introduced in the API.



Known problems
--------------

- Sometimes the GStreamer fork doesn't compile correctly. Try again.
- Some unit tests can fail, especially if the storage server (which contains some required input files) is having connectivity issues. If tests fail, packages are not generated. To skip tests, edit the file *debian/rules* and change ``-DGENERATE_TESTS=TRUE`` to ``-DGENERATE_TESTS=FALSE -DDISABLE_TESTS=TRUE``.
