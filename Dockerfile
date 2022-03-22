FROM openjdk:11-jdk
VOLUME /tmp
EXPOSE 8085

ARG JAR_FILE=target/bankCredit-0.0.1.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]