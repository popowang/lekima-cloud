FROM primetoninc/jdk:1.8
VOLUME /tmp
ADD lekima-register-center-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]