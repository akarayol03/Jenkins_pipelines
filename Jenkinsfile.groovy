node {
    stage("pull Repo"){

    }
    stage("Build Image"){
        sh "packer version"
        
    }
    stage("send Notification to Slack"){
        echo "Hello"
        
    }
    stage("Send Email"){
        echo "Hello"
        
    }
}
