# MicrosService

This project is developed to learn and implement the Spring Microservices architecture. Throughout the project, various modern technologies and tools are used to detail how to create, communicate, and manage microservices. The main technologies and steps used are as follows:

	1.	Maven:
	•	The project is structured and managed using Maven.
	•	Dependency management is provided with the Maven Parent Module.
	2.	Spring Cloud:
	•	The first microservice is created with model, controller, and service layers.
	•	PostgreSQL and PGAdmin are configured using Docker for database connection.
	3.	Fraud Microservice:
	•	The fraud microservice is created, including database setup and necessary controller, service, and repository layers.
	•	Microservice communication is tested using RestTemplate.
	4.	Service Discovery:
	•	Eureka Server is set up and configured.
	•	Service discovery is provided with Eureka Clients.
	•	The @LoadBalanced annotation is used.
	5.	Open Feign:
	•	Microservice communication is facilitated using Feign Client.
	6.	Distributed Tracing:
	•	Distributed tracing and debugging are performed using Sleuth and Zipkin.
	•	Zipkin Container and Dashboard are configured.
	7.	Load Balancers:
	•	Load balancers, their algorithms, and health checks are explained.
	•	An API Gateway is created and configured using Spring Cloud Gateway.
	8.	Message Queue:
	•	Message queue setup is done using AMQP & RabbitMQ.
	•	Kafka, RabbitMQ, and SQS are utilized.
	•	Message producers and listeners are configured.
	9.	Docker:
	•	Microservices are containerized using Docker.
	•	Multi-container management is done using Docker Compose.
	•	Docker images are built and pushed using Jib Maven Plugin.
	10.	Kubernetes:
	•	Microservices are orchestrated using Kubernetes.
	•	A local Kubernetes cluster is set up using Minikube.
	•	Pod, Deployment, and Service configurations are performed.
	11.	Kafka:
	•	A messaging infrastructure is set up using Kafka.
	•	Kafka Producer and Consumer are configured, and integration with microservices is achieved.

Throughout the project, exercises and solutions are provided to cover both theoretical and practical aspects of microservices. This project serves as a comprehensive guide on microservices and related technologies.
 
