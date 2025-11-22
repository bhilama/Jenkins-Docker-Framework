pipeline{
    agent any

    triggers{
        githubPush()
    }

    stages{

        stage('Checkout Code'){
            steps{
                git branch: 'master',
                    url: 'https://github.com/bhilama/Jenkins-Docker-Framework.git'
            }
        }

        stage('Start Selenium Grid'){
            steps{
                sh 'docker-compose down || true'
                sh 'docker-compose up -d'
            }
        }

        stage('Run Tests'){
            steps{
                sh 'mvn clean test -DsuiteXmlFile=TestNG.xml'
            }
        }
    }

    post{
        always{
            juni '**/test-output/testng-results.xml'
            sh 'docker-compose down'
        }
    }
}