node{
    stage("satage1"){
      git  'https://github.com/akarayol03/terraform-iaac-eks'

    }

    stage("satage2"){
       echo "Hello" 
    }

    stage("satage3"){
        echo "Hello"
    }

    stage("satage4"){
        echo "Hello"
    }
}