FROM alpine:3.15.5
RUN apk add --no-cache openjdk11
COPY target/test1-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app/
ENTRYPOINT ["java","-jar","/app/test1-0.0.1-SNAPSHOT.jar"]