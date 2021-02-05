#!/usr/bin/env groovy
pipeline {
    agent any
    options {
        ansiColor('xterm')
    }
    //tools {
        //jdk 'OpenJDK-15.0.2'
    //}
    stages {
        stage('Build') {
            steps {
                withGradle{
                    sh './gradlew assemble'
                    
                } 
            }
            post {
                success {
                    archiveArtifacts 'build/libs/*.jar'
                }
            }
        }
        stage('Test') {
            steps {
                withGradle{
                    sh './gradlew clean test -Dbrowser=firefox'
                    sh './gradlew test -Dbrowser=chrome'
                    sh './gradlew test -Dbrowser=operablink'
                }  
            }
            post {
                always {
                    junit 'build/test-results/test/TEST-*.xml'
                    //archiveArtifacts 'build/reports/*'
                }
            }
        }
    }
}
