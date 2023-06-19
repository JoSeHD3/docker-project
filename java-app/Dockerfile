FROM adoptopenjdk:11-jdk-hotspot

WORKDIR /app

COPY ./demo/target/demo-0.0.1-SNAPSHOT.jar javaapp.jar

EXPOSE 8080

CMD ["java", "-jar", "javaapp.jar"]