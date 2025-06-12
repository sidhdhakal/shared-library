def call() {
  stage('Build') {
    echo 'Building the project...'
    sh 'whoami'
    sh 'docker build -t notes-app:latest .'
  }
}
