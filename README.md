# Microservices-springboot

## BUILD

```./gradlew build```

Build all microservices as defined in settings file.



## RUN SERVICES IN BACKGROUND

``` 
java -jar microservices/product-composite-service/build/libs/*.jar &
java -jar microservices/product-service/build/libs/*.jar &
java -jar microservices/recommendation-service/build/libs/*.jar &
java -jar microservices/review-service/build/libs/*.jar &
```
## RUN A SERVICE IN DOCKER

```
cd microservices/product-service
docker build -t product-service .
```

Check if we got a docker image 
```
docker images | grep pro
```


## TEST A SERVICE MANUALLY

Example:

```
 curl http://localhost:7000/product-composite/1 | jq .

```


## TEST ALL SERVICES 

Prerequisite: all services must be running

```
./test-em-all.bash
```

## STOP ALL SERVICES

```
kill $(jobs -p)
```
