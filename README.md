# DEMO

Demo project built for spring metrics issue.

To run locally
`./gradlew bootrun` // Automatically sets the h2 profile to run 

To build and run docker
`./gradlew bootBuildImage`
`docker run -e "SPRING_PROFILES_ACTIVE=h2" -p 8080:8080 -t demo:0.0.1-SNAPSHOT` // problem is not found here