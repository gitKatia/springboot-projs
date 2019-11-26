## Simple Web App

Simple Spring Boot Web Application

localhost:8082/simple-web-app

It loads Home Page

It uses an embedded database which is accessible at:

localhost:8082/h2-console

See application.properties for credentials to access the h2 database

The application also exposes an api with base url: http://localhost:8082/simple-web-app/api/musicbands

Example of post request:

{
	"name":"pinkfloyd",
    "yearCreated":1967,
    "genre":"ROCK",
    "members":[
    	{"firstname": "David", "lastname":"Gilmour"},
    	{"firstname": "Roger", "lastname":"Waters"},
	    {"firstname": "Richard", "lastname":"Wright"},
	    {"firstname": "Syd", "lastname":"Barrett"},
	    {"firstname": "Nick", "lastname":"Mason"}
	 ]
}

Actuator endpoints:

http://localhost:8082/simple-web-app/actuator/info

http://localhost:8082/simple-web-app/actuator/health

http://localhost:8082/simple-web-app/actuator/metrics

http://localhost:8082/simple-web-app/actuator/beans

http://localhost:8082/simple-web-app/actuator/scheduledtasks

http://localhost:8082/simple-web-app/actuator/threaddump

http://localhost:8082/simple-web-app/actuator/loggers

http://localhost:8082/simple-web-app/actuator/env

http://localhost:8082/simple-web-app/actuator/configprops

http://localhost:8082/simple-web-app/actuator/conditions

http://localhost:8082/simple-web-app/actuator/caches