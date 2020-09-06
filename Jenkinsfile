pipeline {
    agent any

    stages {
        stage('代码拉取') {
            steps {
                echo '代码拉取'
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'e2d885a5-a18f-4c15-ae26-21882059f389', url: 'git@github.com:chenshanyuan/-.git']]])
            }
        }
        stage('项目构建') {
            steps {
                echo '项目构建'
                sh 'mvn clean package'
            }
        }
         stage('项目部署') {
            steps {
                echo '项目部署'
                deploy adapters: [tomcat8(credentialsId: '06ea1385-1811-4438-9f2e-11a9eaa6e1d4', path: '', url: 'http://175.24.64.110:8080')], contextPath: null, war: 'target/*.war'
            }
        }
    }
}
