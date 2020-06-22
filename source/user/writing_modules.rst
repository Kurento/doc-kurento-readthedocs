=======================
Writing Kurento Modules
=======================

.. contents:: Table of Contents

You can develop your own modules to expand the features of Kurento Media Server. There are two main flavors of Kurento modules:

* Modules based on :term:`OpenCV`. These are recommended if you would like to add features such as **Computer Vision** or **Augmented Reality**.

* Modules based on :term:`GStreamer`. This kind of modules provide a generic entry point for media processing within the GStreamer framework. Such modules are more powerful, but also they are more difficult to develop. It is necessary to have good knowledge of GStreamer development.

The starting point to develop a filter is to create a basic structure for the source codem what we'll call the *scaffold*. This is done with the ``kurento-module-scaffold`` tool, which comes included in the ``kurento-media-server-dev`` package. To install it, run this command:

.. code-block:: text

   sudo apt-get update && sudo apt-get install --no-install-recommends --yes \
       kurento-media-server-dev

Now use the scaffold tool. For example:

* For an OpenCV module:

  .. code-block:: text

     kurento-module-scaffold MyCvModule cv-module-dir true

* For a GStreamer module:

  .. code-block:: text

     kurento-module-scaffold MyGstModule gst-module-dir

The scaffolding tool generates the folder tree, all the needed *CMakeLists.txt* files to build with CMake, and example files of Kurento Module Descriptor files (.kmd); these files contain the description of the module, including its constructor, methods, properties, events, and the complex types defined by the developer.

Once your *KMD* files have been filled with all information, it is time to generate the corresponding server stub code with ``kurento-module-creator``. Run this from the root directory of your module:

.. code-block:: text

   mkdir build && cd build/
   cmake ..
   make

The following sections detail how to create your module, depending on the filter type you chose (OpenCV or GStreamer).



OpenCV module
=============

There are several files in ``src/server/implementation/objects/``:

.. code-block:: text

   <ModuleName>Impl.cpp
   <ModuleName>Impl.hpp
   <ModuleName>OpenCVImpl.cpp
   <ModuleName>OpenCVImpl.hpp

The first two files contain the server-side implementation of the JSON-RPC API, and should not be modified. The last two files will contain the logic of your module.

The file ``<ModuleName>OpenCVImpl.cpp`` contains functions to deal with the methods and the parameters (you must implement the logic). Also, this file contains a function called ``process``. This function will be called with each new frame, thus you must implement the logic of your filter inside it.



GStreamer module
================

In this case, these are the files that you'll find under ``src/``:

* ``src/gst-plugins/`` contains the implementation of your GStreamer Element:

  .. code-block:: text

     gst<modulename>.cpp
     gst<modulename>.h
     <modulename>.c

* ``src/server/implementation/objects/`` contains the server-side implementation of the JSON-RPC API:

  .. code-block:: text

     <ModuleName>Impl.cpp
     <ModuleName>Impl.hpp

In the file ``<ModuleName>Impl.cpp`` you have to invoke the methods of your GStreamer element. The actual module logic should be implemented in the GStreamer Element.



For both kind of modules
========================

If you need extra compilation dependencies, you can add compilation rules to the *kurento-module-creator* using the function ``generate_code`` in the ``src/server/CMakeLists.txt`` file.

The following parameters are available:

* ``SERVER_STUB_DESTINATION`` (required)

  The generated code that you may need to modify will be generated on the folder indicated by this parameter.

* ``MODELS`` (required)

  This parameter receives the folders where the models (*KMD* files) are located.

* ``INTERFACE_LIB_EXTRA_SOURCES``, ``INTERFACE_LIB_EXTRA_HEADERS``, ``INTERFACE_LIB_EXTRA_INCLUDE_DIRS``, ``INTERFACE_LIB_EXTRA_LIBRARIES``

  These parameters allow to add additional source code to the static library. Files included in *INTERFACE_LIB_EXTRA_HEADERS* will be installed in the system as headers for this library. All the parameters accept a list as input.

* ``SERVER_IMPL_LIB_EXTRA_SOURCES``, ``SERVER_IMPL_LIB_EXTRA_HEADERS``, ``SERVER_IMPL_LIB_EXTRA_INCLUDE_DIRS``, ``SERVER_IMPL_LIB_EXTRA_LIBRARIES``

  These parameters allow to add additional source code to the interface library.  Files included in *SERVER_IMPL_LIB_EXTRA_HEADERS* will be installed in the system as headers for this library. All the parameters accept a list as input.

* ``MODULE_EXTRA_INCLUDE_DIRS``, ``MODULE_EXTRA_LIBRARIES``

  These parameters allow to add extra include directories and libraries to the module.

* ``SERVER_IMPL_LIB_FIND_CMAKE_EXTRA_LIBRARIES``

  This parameter receives a list of strings. Each string has this format:

  .. code-block:: text

     ``libname[<VersionRange>]``

  where ``<VersionRange>`` can use these symbols: ``AND``, ``OR``, ``<``, ``<=``, ``>``, ``>=``, ``^``, and ``~``.

  .. note::

     * ``^`` indicates a "compatible" version, under the definition of :term:`Semantic Versioning`.
     * ``~`` indicates a "similar" version, again according to the definition of SemVer.



Using the module
================

Using the module comprises two sides of the same coin:

1. Installing the module in the media server. This makes KMS know about the module and allows the server to use it when clients attempt to instantiate a new object that is exported by the module code.

2. Using the module from client applications. This is done by using client code that gets automatically-generated from the Kurento Module Descriptor files (.kmd).



Install with KMS
----------------

Once the module logic is implemented and the compilation process is finished, you need to install your module before being able to use it from a Kurento Pipeline. There are a couple ways to do this:

A. You can generate a Debian package, and then install it in the machine where KMS is running.

   This is the easiest method for end users, because it is just a simple package installation over an already running system. It doesn't require the user to know anything about plugin paths.

   To build a Debian package file (``.deb``), install and run the appropriate tools:

   .. code-block:: text

      # Install dpkg-buildpackage, the Debian package builder
      sudo apt-get update && sudo apt-get install --no-install-recommends --yes \
          dpkg-dev

      # Run dpkg-buildpackage to build Debian package files
      dpkg-buildpackage -us -uc

      # Copy the generated package files to their final destination
      cp ../*.*deb /path/to/destination/

   This will end up generating one or more Debian package files **in the parent directory**, together with some additional files that are specific to Debian and can be deleted. For example:

   .. code-block:: text

      ls -1 ../*.*deb
      ../my-gst-module-dev_0.0.1~rc1_amd64.deb
      ../my-gst-module_0.0.1~rc1_amd64.deb

   It it important to understand the different packages that can be generated by the Debian package builder:

   * The file without any suffix contains the shared library code that has been compiled from our source code. This is the file that end users of our module will need to install in their systems.
   * ``-dev`` packages contain header files and are used by *other developers* to build their software upon our own code. This is unneeded by end users.
   * ``-doc`` packages usually contain *manpages* and other documentation, if we wrote it for the package.
   * ``-dbg`` and ``-dbgsym`` packages contain the debug symbols that have been extracted from the compilation of our module. It can be used by other developers to troubleshoot crashes and provide bug reports.

   Now that we have our packages built, we just have to copy and install them into the target machine where KMS is already installed:

   .. code-block:: text

      sudo dpkg -i my-gst-module_0.0.1~rc1_amd64.deb

   For more information about the Debian package creation process, check these resources:

   * `Debian Building Tutorial <https://wiki.debian.org/BuildingTutorial>`__
   * `Debian Policy Manual <https://www.debian.org/doc/debian-policy/index.html>`__

B. It is also possible to build our module, and just copy the resulting binary artifacts. You can then define the following environment variables in the file ``/etc/default/kurento`` in order to instruct Kurento about the place where your plugin files are stored:

   .. code-block:: text

      KURENTO_MODULES_PATH+=" <ModulePath>/build/src"
      GST_PLUGIN_PATH+=" <ModulePath>/build/src"

   KMS will then add these paths to the path lookup it performs at startup, when looking for all available plugins.



Generate client code: Java
--------------------------

Run from the ``build/`` directory:

.. code-block:: text

   cd build/
   cmake .. -DGENERATE_JAVA_CLIENT_PROJECT=TRUE

This generates a ``java/`` directory, containing all the client code. You can now run ``make java_install`` and your module will be installed in your Maven local repository. To use the module in your Maven project, you have to add the dependency to the ``pom.xml`` file:

.. code-block:: xml

   <dependency>
     <groupId>org.kurento.module</groupId>
     <artifactId>modulename</artifactId>
     <version>0.0.1</version>
   </dependency>



Generate client code: JavaScript
--------------------------------

Run from the ``build/`` directory:

.. code-block:: text

   cmake .. -DGENERATE_JS_CLIENT_PROJECT=TRUE

This generates a ``java/`` directory, containing all the client code. You can now manually copy this code to your application. Alternatively, you can use :term:`Bower` (for *Browser JavaScript*) or :term:`NPM` (for *Node*). To do that, you should add your JavaScript module as a dependency in your *bower.json* or *package.json* file, respectively:

.. code-block:: js

   "dependencies": {
     "modulename": "0.0.1"
   }



Examples
========

Simple examples for both kinds of modules are available in GitHub:

- `OpenCV module <https://github.com/Kurento/kms-opencv-plugin-sample>`__.
- `GStreamer module <https://github.com/Kurento/kms-plugin-sample>`__.

There are a lot of examples showing how to define methods, parameters or events in all our public built-in modules:

- `kms-pointerdetector <https://github.com/Kurento/kms-pointerdetector/tree/master/src/server/interface>`__.
- `kms-crowddetector <https://github.com/Kurento/kms-crowddetector/tree/master/src/server/interface>`__.
- `kms-chroma <https://github.com/Kurento/kms-chroma/tree/master/src/server/interface>`__.
- `kms-platedetector <https://github.com/Kurento/kms-platedetector/tree/master/src/server/interface>`__.

Besides that, all of the Kurento main modules are developed using this methodology, so you can also have a look in these:

- `kms-core <https://github.com/Kurento/kms-core>`__.
- `kms-elements <https://github.com/Kurento/kms-elements>`__.
- `kms-filters <https://github.com/Kurento/kms-filters>`__.
