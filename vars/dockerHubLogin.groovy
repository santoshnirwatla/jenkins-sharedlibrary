def call (string dockerHubUserName, string dockerHubPassword){
sh """
 docker login -u ${dockerHubName} --password ${dockerHubPasword}
"""
}
