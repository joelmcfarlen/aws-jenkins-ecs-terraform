import jenkins.model.*
import hudson.security.*

def env = System.getenv()
def jenkinsInstance = Jenkins.get()

def command = "aws secretsmanager get-secret-value --secret-id jenkins-credentials"
def secretString = command.execute().text.trim()

if (secretString) {
    try {
        def secretJson = new groovy.json.JsonSlurper().parseText(secretString)
        def adminPassword = secretJson.SecretString

        def hudsonRealm = new HudsonPrivateSecurityRealm(false)
        hudsonRealm.createAccount('admin', adminPassword)
        jenkinsInstance.setSecurityRealm(hudsonRealm)

        println "Admin user password set successfully."
    } catch (Exception e) {
        println "Failed to set up admin user in Jenkins: ${e.message}"
    }
}

// Configure the authorization/security strategy
def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
strategy.setAllowAnonymousRead(false)
jenkinsInstance.setAuthorizationStrategy(strategy)

// Persist changes
jenkinsInstance.save()
println "Security settings updated."
