Welcome to the Jenkins Image for ECS

SPECIAL SETUP INSTRUCTIONS:
- Adjust the docker file to contain any needed aditional configurations. 

- Jenkins username is 'admin'. Password is created via the jenkins tf module and input in Secrets Manager under 'jenkins-credentials'. Password can be updated via the 'security.groovy' file if needed (manual code update)

- The 'entrypoint.sh' file can be used to run any additional commands after the image is deployed to the container

- Add additional desired Jenkins plugins in the 'plugins.txt' file

NOTE: THe default security for the Jenkins console is full admin priv once logged into. You can configure additional/granular secutiry settings in the security.groovy file
