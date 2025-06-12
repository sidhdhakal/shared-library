def call(String url, String branch) {
  stage('Clone') {
    echo "Cloning repository from ${url} on branch ${branch}"
    git url: url, branch: branch
  }
}
