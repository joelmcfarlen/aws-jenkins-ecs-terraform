# Use the official Jenkins image from Docker Hub
FROM jenkins/jenkins:lts-jdk17

# Switch to root to install additional packages
USER root

# Install updates and required packages
RUN apt-get update && \
   apt-get upgrade -y && \
    apt-get install -y lsb-release apt-transport-https ca-certificates curl jq software-properties-common vim sudo \
       awscli expect pipx
    
# Install Terraform
# RUN apt-get install -y gnupg software-properties-common && \
#     curl -fsSL https://apt.releases.hashicorp.com/gpg | gpg --dearmor -o /usr/share/keyrings/hashicorp-archive-keyring.gpg && \
#     echo "deb [signed-by=/usr/share/keyrings/hashicorp-archive-keyring.gpg] https://apt.releases.hashicorp.com $(lsb_release -cs) main" | tee /etc/apt/sources.list.d/hashicorp.list > /dev/null && \
#     apt-get update && \
#     apt-get install -y terraform

# Install SSM
 RUN ARCH=$(dpkg --print-architecture) && \
     PART=$(if [ "$ARCH" = "arm64" ]; then echo "arm64"; else echo "64bit"; fi) && \
     curl "https://s3.amazonaws.com/session-manager-downloads/plugin/latest/ubuntu_$PART/session-manager-plugin.deb" -o "session-manager-plugin.deb" && \
     dpkg -i session-manager-plugin.deb && \
     rm session-manager-plugin.deb && \
     session-manager-plugin

# Create jenkins related initialization directories and copy data
RUN mkdir -p /opt/init/.ssh && \
    mkdir -p /opt/pipx/bin && \
    touch /opt/init/.ssh/known_hosts && \
    ssh-keyscan github.com >> /opt/init/.ssh/known_hosts
COPY plugins.txt /opt/init
COPY entrypoint.sh /opt/init/entrypoint.sh
RUN chown -R jenkins:jenkins /opt/init /opt/pipx && \
    chmod +x /opt/init/entrypoint.sh
    
# Switch back to the Jenkins user
USER jenkins

# Skip initial setup wizard by setting environment variable
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
ENV PATH="$PATH:/opt/pipx/bin"
ENV PIPX_BIN_DIR=/opt/pipx/bin PIPX_HOME=/opt/pipx PIPX_MAN_DIR=/usr/local/share/man

# Install runway
RUN pipx install runway

# Install Jenkins plugins
RUN jenkins-plugin-cli --plugin-file /opt/init/plugins.txt --latest

# Set Jenkins Security
COPY security.groovy /usr/share/jenkins/ref/init.groovy.d/security.groovy.override

# Copy Jenkins config file
#COPY config.xml /opt/init/config.xml

# Set git options
RUN git config --global --add safe.directory '*'

#Run entry script
ENTRYPOINT ["/opt/init/entrypoint.sh"]
