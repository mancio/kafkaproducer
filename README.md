### Docker
The Dockerfile in the main directory can be executed to build a container
that run the microservice.

To see all the images type
```docker images```

To see all the running containers type
```docker ps -a```

To build the container go in the Dockerfile directory and type 
```docker build -t ImageName:TagName dockerfile_dir```
example ```docker build -t kafkaproducer:0.1 .```

to execute a container in local type ```docker run -p 8081:8081 ImageName:TagName```
example ```docker run -p 9000:9000 kafkaproducer:0.1```

To run all the containers image under the same network
type ```docker-compose up```
