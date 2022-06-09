FROM openjdk:8
EXPOSE 8080
ADD target/one.jar one.jar
ENTRYPOINT ["java","-jar","/one.jar"]