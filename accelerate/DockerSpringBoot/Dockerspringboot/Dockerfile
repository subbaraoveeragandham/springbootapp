FROM openjdk:8
ADD target/Docker-springboot-0.0.1-SNAPSHOT.jar docker-spring-boot.jar
EXPOSE 8089
ENTRY POINT ["java","-jar" "docker-spring-boot.jar"]
