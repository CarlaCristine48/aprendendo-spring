# 📚 Projeto de Aprendizado Spring Boot

Este projeto tem como objetivo documentar, de forma **didática e prática**, o uso das principais ferramentas do ecossistema **Spring**, apresentando o passo a passo de cada recurso aplicado durante o processo de aprendizagem.

A ideia é servir como material de estudo e referência para quem está iniciando ou consolidando conhecimentos em desenvolvimento backend com Java e Spring Boot.

---

## 🚀 Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Framework**
  - Spring Web
  - Spring Data JPA
  - Spring Security
- **Lombok**
- **Maven**
- **API REST**
- **Postman**
- **Programação Orientada a Objetos (POO)**

---

## 🏗 Arquitetura do Projeto

O projeto segue a **arquitetura em camadas**, amplamente utilizada em aplicações Spring:

- **Controller**
  - Responsável por receber as requisições HTTP e retornar as respostas.
- **Business**
  - Contém a regra de negócio da aplicação.
- **Infrastructure**
  - Camada responsável pelos aspectos técnicos da aplicação, incluindo:
  
  - **Entity**
    - Representa as entidades do domínio e o mapeamento para o banco de dados.

  - **Repository**
    - Responsável pelo acesso e manipulação dos dados no banco.

  - **Exceptions**
    - Centraliza o tratamento de exceções da aplicação, garantindo respostas padronizadas e melhor controle de erros.

Essa separação facilita a manutenção, a escalabilidade e a organização do código.

---

## 📌 Funcionalidades Desenvolvidas

- Criação de APIs REST
- Organização do projeto seguindo boas práticas
- Persistência de dados com Spring Data JPA
- Uso de DTOs (quando aplicável)
- Testes de endpoints com Postman
- Configurações básicas de segurança com Spring Security

---

## 🧠 Objetivo do Projeto

- Consolidar conceitos fundamentais do Spring Boot
- Aplicar boas práticas de arquitetura de software
- Desenvolver APIs REST organizadas e escaláveis
- Servir como base para projetos futuros
