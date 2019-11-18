FROM tomee:8-jre-7.1.0-plus
WORKDIR /usr/local/tomee/webapps/
MAINTAINER "abc@gmail.com"
ADD sample-hello-world.jar .
EXPOSE 9080
ENTRYPOINT ["java", "-jar", "sample-hello-world.jar"]