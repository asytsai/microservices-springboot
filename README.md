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

## TEST ALL SERVICES 

Prepequisite: all services must be running

```agsl
./test-em-all.bash
```

## STOP ALL SERVICES

```agsl
kill $(jobs -p)
```
