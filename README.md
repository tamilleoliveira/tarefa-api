# 📋 API de Tarefas - Trabalho de Desenvolvimento Web Back-end

Projeto desenvolvido como atividade prática da disciplina **Desenvolvimento Web Back-end**.  

👩‍💻 **Aluna:** Tamile de Oliveira Mendes  

---

## 🚀 Sobre o projeto
A aplicação é uma **API RESTful de gerenciamento de tarefas** construída em **Java com Spring Boot** e **MySQL**.  
Ela permite realizar as operações básicas de CRUD (Create, Read, Update, Delete) para tarefas.

Cada tarefa possui:
- **id** (gerado automaticamente)
- **nome** (nome da tarefa)
- **dataEntrega** (data de entrega no formato `yyyy-MM-dd`)
- **responsavel** (nome do responsável pela tarefa)

---

## 🛠 Tecnologias utilizadas
- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

## ⚙️ Configuração do banco de dados
No arquivo `src/main/resources/application.properties` configure o acesso ao MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tarefa_api
spring.datasource.username=root
spring.datasource.password=341920
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
