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
                    sh './gradlew build'
                    
                } 
            }
            /*post {
                success {
                    archiveArtifacts 'build/libs/*.jar'
                }
            }*/
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
                   
                }
            }
        }
    }
}
