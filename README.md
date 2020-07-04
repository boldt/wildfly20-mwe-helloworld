# README

## Docker

The `Dockerfile` depends on the official `jboss/wildfly` image.

* it openes the management port 9990
* it adds the management user `admin:admin`

## Build and run Docker container

```bash
docker-compose up -d --build
```

Open:
* http://localhost:8080/
* http://localhost:9990/ (`admin:admin`)

## (Un)Deploy Hello World WAR

```bash
cd helloworld/
```

Deploy (`admin:admin`):

```bash
mvn install wildfly:deploy
```

Undeploy (`admin:admin`):

```bash
mvn install wildfly:undeploy
```

