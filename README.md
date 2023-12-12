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


Build

```
cd microservices/product-service
docker build -t product-service .
```

Check if we got a docker image for product service:

```
docker images | grep product-service
```

Run a container

```
docker run --rm -p8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" product-service
```

Run a container in detached mode
```
docker run -d -p8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" --name prd-svc product-service
```

Send a request to a running service 

```
curl localhost:8080/product/3
```

Get the logs of a service running in docker

``` 
docker logs prd-svc -f
```

Stop the service and remove the container

```
docker rm -f prd-svc
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
