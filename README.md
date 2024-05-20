# Projeto Spring Boot com Arquitetura Hexagonal e Kafka

 Este repositório contém uma aplicação desenvolvida com Spring Boot, utilizando a arquitetura hexagonal (Ports and Adapters) e integrando com Apache Kafka para envio de mensagens.

## Descrição

Este projeto é um exemplo de aplicação que segue os princípios da arquitetura hexagonal, também conhecida como Ports and Adapters, para promover uma separação clara entre a lógica de negócios e a infraestrutura. A aplicação inclui um componente de envio de mensagens para o Apache Kafka.

## Arquitetura Hexagonal

A arquitetura hexagonal é um estilo arquitetural que enfatiza a separação de preocupações e a independência de frameworks. Os principais componentes da arquitetura hexagonal são:

- **Domínio (Core)**: Contém a lógica de negócios pura e as regras de negócio.
- **Portas (Ports)**: Interfaces que definem as entradas e saídas do sistema.
- **Adaptadores (Adapters)**: Implementações concretas das interfaces definidas pelas portas, responsáveis por interagir com tecnologias específicas (bancos de dados, sistemas externos, interfaces de usuário).

### Benefícios da Arquitetura Hexagonal

- **Testabilidade**: Facilita a criação de testes unitários, isolando a lógica de negócios das dependências externas.
- **Manutenibilidade**: Promove uma estrutura de código mais limpa e modular, facilitando a manutenção e evolução do sistema.
- **Flexibilidade**: Permite a substituição de componentes tecnológicos sem impactar a lógica de negócios.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Apache Kafka**
- **Spring Kafka**
- **Gradle**

## Estrutura do Projeto

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/example/hexagonal/
│   │       ├── application/   # Serviços e casos de uso (Application Services)
│   │       ├── domain/        # Entidades e Regras de Negócio
│   │       ├── infrastructure/ # Adaptadores de Infraestrutura (Ex: Kafka, Banco de Dados)
│   │       └── web/           # Adaptadores de Interface (Ex: Controllers REST)
│   └── resources/
│       ├── application.properties # Configurações da aplicação
│       └── logback.xml             # Configurações de logging
