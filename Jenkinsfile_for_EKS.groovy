node{
    stage("stage1"){
      git  'https://github.com/akarayol03/terraform-iaac-eks.git'

    }

    stage("stage2"){
       sh "terraform version"
    }

    stage("stage3"){
        echo "Hello"
    }

    stage("stage4"){
        echo "Hello"
    }
}