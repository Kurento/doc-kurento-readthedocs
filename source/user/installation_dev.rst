=============================
Installing Pre-Release Builds
=============================

Some components of KMS are built nightly, with the code developed during that same day. Other components are built immediately when code is merged into the source repositories.

These builds end up being uploaded to *Development* repositories so they can be installed by anyone. Use these if you want to develop *Kurento itself*, or if you want to try the latest changes before they are officially released.

.. warning::
   Pre-release builds always represent the current state on the software development; 99% of the time this is stable code, very close to what will end up being released.

   However, it's also possible (although unlikely) that these builds might include undocumented changes, regressions, bugs or deprecations. It's safer to be conservative and avoid using pre-release builds in a production environment, unless you have a strong reason to do it.

.. note::
   If you are looking to build KMS from the source code, then you should check the section aimed at development of *KMS itself*: :ref:`dev-sources`.



Kurento Media Server
====================

The steps to install a pre-release version of KMS are pretty much the same as those explained in :ref:`installation-local`, with the only change of using a different package repository.

1. Define what version of Ubuntu is installed in your system. Open a terminal and copy **only one** of these commands:

   .. code-block:: bash

      # KMS for Ubuntu 14.04 (Trusty)
      DISTRO="trusty"

   .. code-block:: bash

      # KMS for Ubuntu 16.04 (Xenial)
      DISTRO="xenial"

2. Add the Kurento repository to your system configuration. Run these two commands in the same terminal you used in the previous step:

   .. code-block:: text

      sudo apt-key adv --keyserver keyserver.ubuntu.com --recv-keys 5AFA7A83

   .. code-block:: text

      sudo tee "/etc/apt/sources.list.d/kurento.list" >/dev/null <<EOF
      # Kurento Media Server - Nightly packages
      deb [arch=amd64] http://ubuntu.openvidu.io/dev $DISTRO kms6
      EOF

3. Install KMS:

   .. code-block:: text

      sudo apt-get update
      sudo apt-get install kurento-media-server

This will install the latest KMS pre-release (potentially unstable) version.



Kurento Java Client
===================

The development builds of the Kurento Java Client are made available for Maven in https://maven.openvidu.io/index.action
To use these, you need to add first this repository to your Maven configuration.

Adding a repository to Maven can be done at three scope levels:

- **Project level**.

  This will add access to development builds only for the project where the configuration is done. Open the project's *pom.xml* and include this:

  .. code-block:: xml

     <project>
       ...
       <repositories>
         <repository>
           <id>kurento-snapshots</id>
           <name>Kurento Snapshots</name>
           <url>https://maven.openvidu.io/repository/snapshots/</url>
           <releases>
             <enabled>false</enabled>
           </releases>
           <snapshots>
             <enabled>true</enabled>
           </snapshots>
         </repository>
       </repositories>
       <pluginRepositories>
         <pluginRepository>
           <id>kurento-snapshots</id>
           <name>Kurento Snapshots</name>
           <url>https://maven.openvidu.io/repository/snapshots/</url>
           <releases>
             <enabled>false</enabled>
           </releases>
           <snapshots>
             <enabled>true</enabled>
           </snapshots>
         </pluginRepository>
       </pluginRepositories>
       ...
     </project>

  After this is included, there are two ways to use the updated versions:

  1. In the same *pom.xml*, look for the desired *<dependency>* and change its version. For example:

     .. code-block:: xml

        <dependency>
          <groupId>org.kurento</groupId>
          <artifactId>kurento-client</artifactId>
          <version>6.6.3-SNAPSHOT</version>
        </dependency>

  2. If you have not specified a dependency version, use the ``-U`` switch in your next Maven run to force updating all dependencies.

- **User and System levels**.

  The file *settings.xml* provides configuration for all projects, but its contents have a different reach depending on where it is located:

  - At ``$HOME/.m2/settings.xml``, it defines the settings that will be applied for a single user.
  - At ``/etc/maven/settings.xml``, it defines the settings that will be applied for all Maven users on a machine.

  To use this method, first edit the settings file at one of the mentioned locations, and include this:

  .. code-block:: xml

     <settings>
       ...
       <profiles>
         <profile>
           <id>kurento</id>
           <repositories>
             <repository>
               <id>kurento-snapshots</id>
               <name>Kurento Snapshots</name>
               <url>https://maven.openvidu.io/repository/snapshots/</url>
               <releases>
                 <enabled>false</enabled>
               </releases>
               <snapshots>
                 <enabled>true</enabled>
               </snapshots>
             </repository>
           </repositories>
           <pluginRepositories>
             <pluginRepository>
               <id>kurento-snapshots</id>
               <name>Kurento Snapshots</name>
               <url>https://maven.openvidu.io/repository/snapshots/</url>
               <releases>
                 <enabled>false</enabled>
               </releases>
               <snapshots>
                 <enabled>true</enabled>
               </snapshots>
             </pluginRepository>
           </pluginRepositories>
         </profile>
       </profiles>
       ...
     </settings>

  After this is included, use the ``-Pkurento`` switch in your next Maven run to enable the new profile, so all artifacts get downloaded into you local repository. Once in your local repository, Maven can successfully resolve the dependencies and the profile no longer needs to be activated in future runs.

For more information about adding snapshot repositories to Maven, check their official documentation: `Guide to Testing Development Versions of Plugins <https://maven.apache.org/guides/development/guide-testing-development-plugins.html>`__.



Kurento JavaScript Client
=========================

Node.js
-------

If you are using the Kurento JavaScript Client from a Node.js application and want to use the latest development version of this library, you have to change the *dependencies* section in the application's *package.json*. This way, NPM will point directly to the development repository:

.. code-block:: js

   "dependencies": {
       "kurento-client": "Kurento/kurento-client-js#master",
   }


Browser JavaScript
------------------

If you are using the Kurento JavaScript Client from a browser application, with Bower to handle JS dependencies, and want to use the latest development version of this library, you have to change the *dependencies* section in the application's *bower.json*. This way, Bower will point directly to the development repository:

.. code-block:: js

   "dependencies": {
       "kurento-client": "master",
       "kurento-utils": "master",
   }

Alternatively, if your browser application is pointing directly to JavaScript libraries from HTML resources, then you have to change to development URLs:

.. code-block:: html

   <script type="text/javascript"
       src="http://builds.openvidu.io/dev/master/latest/js/kurento-client.min.js">
   </script>
