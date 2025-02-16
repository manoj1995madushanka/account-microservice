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
###### docker compose down