# Spring Boot Projects

A collection of Java and Spring Boot projects covering REST APIs, persistence, microservices, Docker, and distributed application fundamentals.

This repository is a practical companion to my senior Java / Spring Boot interview preparation. Each project is kept in its own directory so it can be explored independently.

## Project index

| Project | Focus | Start here |
|---|---|---|
| **SpringBoot-CRUD-JPA** | Spring Boot REST application with Spring Data JPA, validation, Spring Security, and H2 | [Project folder](./SpringBoot-CRUD-JPA/) |
| **currency-exchange-service** | Currency exchange microservice learning project | [Project folder](./currency-exchange-service/) |
| **docker-containerization-microservices-tracingserver** | Containerized microservices and tracing/discovery concepts | [Project folder](./docker-containerization-microservices-tracingserver/) |
| **docker-hello-world-java** | Java application packaging and Docker image examples, including multi-stage build patterns | [Project folder](./docker-hello-world-java/) |
| **learn-jpa-hibernate** | JPA and Hibernate persistence fundamentals | [Project folder](./learn-jpa-hibernate/) |

## Suggested learning path

1. Start with **SpringBoot-CRUD-JPA** to review REST endpoints, validation, persistence, and security dependencies.
2. Explore **learn-jpa-hibernate** for ORM and persistence concepts.
3. Review **currency-exchange-service** and the containerized microservices project for service boundaries and distributed-system patterns.
4. Finish with **docker-hello-world-java** to understand packaging and container image construction.

## Technology areas

- Java and Spring Boot
- Spring Web / REST APIs
- Spring Data JPA and Hibernate
- Bean Validation and Spring Security
- H2 database
- Microservices concepts
- Docker and containerization

The exact dependencies and implementation details are defined in each project's build file and source code. Check the individual project before assuming a particular Java or Spring Boot version.

## Running a project

Requirements vary by project. For Maven-based projects:

```bash
cd <project-directory>
mvn clean test
mvn spring-boot:run
```

Use the project's own `pom.xml`, configuration files, and README (where present) as the source of truth. Some folders are learning exercises and may require configuration or maintenance before they run in a current environment.

## Repository hygiene

Generated output such as Maven `target/` directories, IDE metadata, local environment files, and secrets should not be committed. The root `.gitignore` documents common exclusions for future work. Previously committed generated files are not removed automatically by adding ignore rules.

## Related work

- [Java, Spring Boot, and AI engineering preparation](https://github.com/NeelimaBarji/preparation_material)
- [Agentic AI capstone — DevLoop](https://github.com/NeelimaBarji/Google_5days_agentic_ai/tree/main/CapstoneProject)

---

*Maintained as a hands-on engineering portfolio and learning repository.*