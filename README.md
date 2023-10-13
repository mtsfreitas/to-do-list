# to-do-list


## Configurando o ambiente 

* [Java 17](https://download.oracle.com/java/17/archive/jdk-17.0.3.1_macos-x64_bin.dmg)
* [Maven](https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.tar.gz) ou [acesse essa página](https://maven.apache.org/download.cgi) e realize o download da versão mais recente do `Binary tar.gz archive`.

## Configuração Java no VS Code

Para utilizar o Java no VSCode, é necessário instalar as extensões abaixo

- **vscjava.vscode-java-pack**
    - vscjava.vscode-java-debug
    - vscjava.vscode-java-test
    - vscjava.vscode-java-dependency
    - vscjava.vscode-maven
    - redhat.java
- **vscjava.vscode-spring-initializr**
- **vmware.vscode-spring-boot**
- **vscjava.vscode-spring-boot-dashboard**

## Rest Client
Algumas opções de ferramentas para requisições REST:

* [API Dog](https://apidog.com/download/)

* [Insomnia](https://insomnia.rest/download)

* [Postman](https://www.postman.com/downloads/)

## Dependências do projeto
O arquivo POM (Project Object Model) do Maven (pom.xml), é utilizado para gerenciar projetos Java. Ele descreve o projeto e suas dependências.

1. **[spring-boot-devtools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html):** 
   - Descrição: Fornece ferramentas de desenvolvimento que são úteis durante o desenvolvimento. Ele permite que o aplicativo reinicie automaticamente quando os arquivos no classpath mudam.
   - `optional: true`: Isso indica que a dependência é opcional.

2. **bcrypt:**
   - Descrição: É uma biblioteca de criptografia de senha que implementa o algoritmo bcrypt para hashing de senhas.
   - `version: 0.10.2`: Indica a versão específica da dependência a ser utilizada.

3. **[spring-boot-starter-data-jpa](https://spring.io/projects/spring-data-jpa):**
   - Descrição: Fornece suporte para a camada de persistência, facilitando o acesso e a manipulação de dados utilizando o Java Persistence API (JPA) em aplicativos Spring Boot.
   
4. **[h2](http://h2database.com/html/main.html):**
   - Descrição: É um banco de dados SQL em memória escrito em Java. É frequentemente utilizado para desenvolvimento, testes e prototipagem.

5. **[lombok](https://projectlombok.org/setup/maven):**
   - Descrição: É uma biblioteca do Java que ajuda a reduzir a verbosidade do código Java, fornecendo anotações para gerar automaticamente código repetitivo, como getters, setters, construtores, etc.

6. **spring-boot-starter-actuator:**
   - Descrição: Fornece endpoints que permitem monitorar e interagir com um aplicativo Spring Boot.

7. **spring-boot-starter-web:**
   - Descrição: Fornece suporte para aplicativos da web, incluindo bibliotecas para criar APIs RESTful usando o Spring MVC.

8. **spring-boot-starter-test:**
   - Descrição: Fornece suporte para testes, incluindo bibliotecas para escrever e executar testes automatizados em aplicativos Spring Boot.

Além disso, a seção `build` contém a configuração do plugin Maven que permite a execução do aplicativo Spring Boot por meio do Maven. O `spring-boot-maven-plugin` é responsável por empacotar e executar o aplicativo Spring Boot.

# Banco de dados

* No arquivo `application.properties` insira:

```tsx
spring.datasource.url=jdbc:h2:mem:todolist
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=admin
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

OBS: É necessário executar a aplicação para acessar o banco de dados por meio da url: http://localhost:8080/h2-console ou https://todolist-0ntd.onrender.com/h2-console

# Deploy 
Foi utilizado a plataforma [Render](https://dashboard.render.com) para realizar o deploy da aplicação

![Screenshot 2023-10-13 at 14 15 07](https://github.com/mtsfreitas/to-do-list/assets/21324690/b12c5bac-8512-4100-875d-4d7776bf5e90)

Exemplo de utilização da plataforma após executar o deploy:
* Utilizar https://todolist-0ntd.onrender.com/users/ ao invés de: http://localhost:8080/users/

# Estruturando o projeto com Spring Boot

1 - https://start.spring.io (mais intuitivo)

![Screenshot 2023-10-13 at 14 32 44](https://github.com/mtsfreitas/to-do-list/assets/21324690/1b3d9d57-8c98-4a48-bd0f-c329a0376f9e)

Adicionar dependência "Spring Web"

![Screenshot 2023-10-13 at 14 36 55](https://github.com/mtsfreitas/to-do-list/assets/21324690/ea934738-8fa2-4e20-8f4c-e88ec6d3c702)

* Clicar em generate

![Screenshot 2023-10-13 at 14 44 32](https://github.com/mtsfreitas/to-do-list/assets/21324690/0dd49839-3bfe-40f0-9c87-5a0852058b98)

* Descompactar o todolist.zip gerado
* Abrir a pasta todolist no VSCode

Ou...

2 - Utilizar o terminal com comandos Maven Archetypes (https://maven.apache.org/archetypes/index.html)

3 - Utilizar o Spring Initializr: Create a Maven Project no VSCode


