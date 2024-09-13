#!/bin/bash

set -euo pipefail

# Create needed directories
mkdir -p /var/jenkins_home/.ssh
mkdir -p /var/jenkins_home/plugins

# Copy needed files for functioning
cp -a /opt/init/.ssh/known_hosts /var/jenkins_home/.ssh/known_hosts
cp -a /usr/share/jenkins/ref/plugins/* /var/jenkins_home/plugins/
#cp -af /opt/init/config.xml /var/jenkins_home/config.xml

# Setting perms for jenkins user on efs mounted home dir
chown -R jenkins:jenkins /var/jenkins_home/

# Start Jenkins
/usr/bin/tini -s -- /usr/local/bin/jenkins.sh