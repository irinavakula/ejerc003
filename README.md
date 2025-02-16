Install and run java application:
```
mvn install
mvn spring-boot:run
```

Up and Run database

```
docker run -e POSTGRES_PASSWORD=postgres -e POSTGRES_HOST_AUTH_METHOD=trust -p 5432:5432 postgres
```

CRUD

* Create

```
curl -X POST --json '{"color":"red","name":"My pen","type":"regular"}' localhost:8080/api/pens && echo -e 
```

* Retrieve

```
curl -X GET localhost:8080/api/pens/15 && echo -e
```


* Update

```
curl -X PUT --json '{"color":"red","name":"My pen","type":"regular"}' localhost:8080/api/pens/7 && echo -e
```


* Delete

```
curl -X DELETE localhost:8080/api/pens/15 && echo -e
```

* List

```
curl -X GET localhost:8080/api/pens
```
