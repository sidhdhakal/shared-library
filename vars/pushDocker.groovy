def call(String imageName, String imageTag, String credentialsId) {
    script {
        withCredentials([usernamePassword(credentialsId: credentialsId, usernameVariable: 'DOCKERHUB_USERNAME', passwordVariable: 'DOCKERHUB_PASSWORD')]) {
            sh "docker login -u $DOCKERHUB_USERNAME -p $DOCKERHUB_PASSWORD"
            sh "docker push ${imageName}:${imageTag}"
        }
    }
}
