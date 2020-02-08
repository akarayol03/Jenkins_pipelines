node {

    properties([parameters([choice(choices: ['us-east-1', 'us-east-2', 'us-west-1', 'us-west-2'], description: 'Please select a region', name: 'AMI_REGION')])])
    stage("pull Repo"){
        git 'https://github.com/akarayol03/packer-1.git'

    }
    stage("Build Image"){
        sh "packer version"
        sh "packer bild -var region=${AMI_REGION} tools/jenkins_example.json
        
    }
    stage("send Notification to Slack"){
        echo "Hello"
        
    }
    stage("Send Email"){
        echo "Hello"
        
    }
}
