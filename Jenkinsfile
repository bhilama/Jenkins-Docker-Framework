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
                bat 'docker-compose down || echo Grid already down'
                bat 'docker-compose up -d'
            }
        }

        stage('Run Tests'){
            steps{
                bat 'mvn clean test -DsuiteXmlFile=TestNG.xml'
            }
        }
    }

    post{
        always{
            junit 'target/surefire-reports/testng-results.xml'
            bat 'docker-compose down'
        }
    }
}