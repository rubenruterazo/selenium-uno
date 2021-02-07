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
                    sh './gradlew clean test'
                }  
            }
            post {
                always {
                    junit 'build/test-results/test/TEST-*.xml'
                    //archiveArtifacts 'build/reports/*'
                }
            }
        }
        stage('Check') {
            steps {
                withGradle{
                    sh './gradlew check'
                }
            }
            post {
                always {
                    recordIssues(
                            enabledForFailure: true, aggregatingResults: true,
                            tools: [java(), checkStyle(pattern: 'build/reports/checkstyle/*.xml', reportEncoding: 'UTF-8')]
                    )
                }
            }
        }
    }
}
