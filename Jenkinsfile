pipeline {
	agent any
	
	stages {
		stage("build") {
			steps {
				sh 'echo hello bong - build phase'
				echo 'Another way of displaying console output'
			}
		}
		stage("test") {
			steps {
				sh 'echo hello bong - test phase'
			}
		}
		stage("deploy") {
			steps {
				sh 'echo hello bong - deploy phase'
			}
		}
	}
}
