pipelineJob('theme-park-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/nimendra/java-spring-app.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}