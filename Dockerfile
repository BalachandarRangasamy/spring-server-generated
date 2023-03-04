FROM anapsix/alpine-java

COPY target/swagger-spring-1.0.0.jar /home/swagger-spring-1.0.0.jar

EXPOSE 8080

CMD ["java", "-jar", "/home/swagger-spring-1.0.0.jar"]