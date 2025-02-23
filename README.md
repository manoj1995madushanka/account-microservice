# To open swagger doc go to

```java
http://localhost:8080/swagger-ui/index.html#
```

# To open h2 database go to

```java
http://localhost:8080/h2-console
```

###### course URL : https://github.com/eazybytes/microservices

### Ways to create docker image

#### Dockerfile

###### Need to create dockerfile with the list of instructions

#### Buildpacks

###### A project initiated by Heroku and Pivotal. Do not need to write dockerfile manually

#### Google Jib

###### Jib is a open-source java tool maintained by google for build docker images of Java applications.

###### We do not need to write dockerfile


###### docker build . -t accounts-service
###### docker run -d -p 8080:8080 [imageName]

###### docker compose up
#### To stop and remove all containers created by compose up command
###### docker compose down 
#### To only stop container
##### docker compose start/stop

## How to externalize configurations using command line arguments - highest presidents
#### java -jar account-service.jar --build.version="1.1"


## How to externalize configurations using JVM system properties
#### java -Dbuild.version="1.2" -jar account-service.jar


## How to externalize configurations using environment variables
#### Windows -> env:BUILD_VERSION="1.3"; java -jar account-service.jar
#### Linux -> BUILD_VERSION="1.3" java -jar account-service.jar