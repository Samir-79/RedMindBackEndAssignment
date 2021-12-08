FROM openjdk:17-alpine
EXPOSE 8080
ADD target/RedMindBackEndAssignment-1.0-SNAPSHOT.jar ATM.jar
ENTRYPOINT ["java", "-jar", "/ATM.jar"]
