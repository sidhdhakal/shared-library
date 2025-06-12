def call(String projectName, String imageTag, String dockerhubUser) {
    echo "Building Docker image: ${dockerhubUser}/${projectName}:${imageTag}"
    sh "docker build -t ${dockerhubUser}/${projectName}:${imageTag} ."
}
