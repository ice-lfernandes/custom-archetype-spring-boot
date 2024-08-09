# Custom Maven Archetype Spring Boot 
Archetype Maven customizado que permite parametrizar dependencias e suas correspondentes implementação de código para criação de novos projetos

## Features

- [x] Parametrização de dependências para exposição de endpoints
    - [x] Dependência Spring Boot Web
    - [x] Dependência Spring Boot Actuator
    - [x] Dependência OpenAPI Documentation
    - [x] Dependência Spring Boot Web Test
- [x] Parametrização de dependências para conexão com Banco de dados PostgreSQL
    - [x] Dependência para conexão com Banco de dados PostgreSQL
    - [x] Dependência Spring Data JPA
    - [x] Criação de configs no application.yml para conexão com banco de dados
    - [x] Dependência Liquibase para controle de versão de banco de dados
- [x] Parametrização de lombok
  - [x] Dependência Lombok

## Getting Started

Rodar comando para criação de archetype: `mvn clean install`

Rodar comando de criação de projeto com archetype: `mvn archetype:generate -B -DarchetypeArtifactId=sample-project -DarchetypeVersion=1.0.0   -DarchetypeGroupId=br.com.ldf   -DgroupId=br.com.ldf   -DartifactId=customer-spring-boot-app -Dproject=customer-spring-boot-app
`

