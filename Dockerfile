# Docker file : Instructions to create the docker image,

FROM openjdk:17

RUN mkdir /usr/app/

COPY target /Allium_Cepa_App.jar /usr/app/

WORKDIR /usr/dir/

ENTRYPOINT["java","-jar","Allium_Cepa_App.jar"]