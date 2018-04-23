node {
	    stage('Checkout') { 
	         checkout scm 
	     } 
  
		stage('Initialize'){
			def dockerHome = tool 'myDocker' 
	        def mavenHome  = tool 'myMaven' 
	        env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}" 
		}


        stage('Build') {
            sh "mvn -B -Dmaven.test.failure.ignore=true clean package"
            junit 'target/surefire-reports/**/*.xml'
        }

		 stage('Copy WAR Image') {
	 		sh "ls -al"
			sh "cp target/*.war /home/ken/eclipse-workspace/TimeManagement/ValidateEmployeeByLoginId/target"
		}

		 stage('Create Docker Image') {
		      sh "docker build -t validateemployeebyloginid:latest  -t validateemployeebyloginid:latest --pull --no-cache ."
		}

}