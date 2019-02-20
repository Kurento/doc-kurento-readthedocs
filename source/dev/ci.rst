======================
Continuous Integration
======================

We have two types of repositories containing Debian packages: either Release or Nightly builds of the KMS Main Repositories and KMS Fork Repositories.

Each of these types of repos are made available for two Long-Term Support (*LTS*) versions of Ubuntu: **Ubuntu 16.04 (Xenial)** and **Ubuntu 18.04 (Bionic)** (64-bits only).

After some exploration of the different options we had, in the end we settled on the option to have self-contained repos, where all Kurento packages are stored and no dependencies with additional repositories are needed.

There is an independent repository for each released version of Kurento, and one single repository for nightly builds:

- Release: ``deb http://ubuntu.openvidu.io/<KmsVersion> <UbuntuCodename> kms6``
- Nightly: ``deb http://ubuntu.openvidu.io/dev          <UbuntuCodename> kms6``

Here, ``<KmsVersion>`` is any of the released versions of KMS (e.g. ``6.7.2``, ``6.8.1``, ``6.9.0``, etc.) and ``<UbuntuCodename>`` is the name of each supported Ubuntu version (e.g. ``xenial``, ``bionic``, etc. if more added in the future.)

We also have several Continuous-Integration (*CI*) jobs such that new nightly packages can be built from each Git repository's ``master`` branch, to be then uploaded to the nightly repositories.

All scripts used by CI are stored in the Git repo `adm-scripts <https://github.com/Kurento/adm-scripts>`__.
