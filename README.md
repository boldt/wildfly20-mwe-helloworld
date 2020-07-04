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

## Use RESTful enpoint

```bash
curl -H "Accept: application/json" http://localhost:8080/helloworld/rest/hello/
curl -H "Accept: application/xml" http://localhost:8080/helloworld/rest/hello/
```

## Ecplise

### Install

```bash
sudo snap install eclipse
```

### Import maven project

*File* -> *Import* -> *Existing Maven Projects*

# Sources

* wildfly-maven-plugin
	* https://docs.jboss.org/wildfly/plugins/maven/latest/examples/deployment-example.html
* wildfly-jakartaee-webapp-archetype
	* https://mvnrepository.com/artifact/org.wildfly.archetype/wildfly-jakartaee-webapp-archetype
	* https://github.com/wildfly/wildfly-archetypes/tree/master/wildfly-jakartaee-webapp-archetype
* jakarta.xml.bind-api
	* https://mvnrepository.com/artifact/jakarta.xml.bind/jakarta.xml.bind-api
	* http://www.mastertheboss.com/other/java-stuff/how-to-find-out-which-jaxb-implementation-is-used-in-your-code

