Welcome to the containerized Jenkins Solution

SUMMARY:
This module is used to deploy a containerized jenkins solutions and its supporting infrastructure in AWS. It contains the following:

1) Application Load Balancer
2) Jenkins credentials (stored in Secrets Manager)
3) Route53/DNS endpoint
4) Fargate ECS cluster
5) EFS storage to support the ECS cluster
6) IAM roles/policies
7) Monitoring and Alarm (monitoring dns endpoint)

DEPLOYMENT NOTES:
You will need to update the config.tf file with the needed terraform backend resources as well as the terrform-variables.tfvars file with needed variables. Resource naming also relies on terraform workspaces to be used.

The canary config file found in the monitoring.tf module can be tailored to needed configurations. 


DEPLOYMENT COMMANDS (when in the "jenkins-ecs-tf directory):

// Select your workspace

$ terraform workspace list

$ terraform workspace select WORKSPACE_NAME


// Deploy the solution

$ terraform apply -var-file=terraform-variables.tfvars