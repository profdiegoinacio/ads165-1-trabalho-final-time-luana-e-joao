# Template de Projeto Fullstack com Spring Boot e Next.js

Este projeto representa um template para o desenvolvimento de aplicações web fullstack modernas utilizando **Spring Boot** no backend e **Next.js** no frontend. Ele foi criado como base para aplicações que utilizam boas práticas de engenharia de software, escalabilidade e integração entre Java e TypeScript.

## **Visão Geral**

A aplicação é dividida em dois componentes principais:

1. **Backend (API RESTful)**:
    - Construído com **Spring Boot**, um framework amplamente utilizado na comunidade Java para o desenvolvimento de aplicações robustas e performáticas.
    - Implementa uma arquitetura RESTful para expor endpoints que servirão como interface de comunicação com o frontend.
    - Inclui configurações para persistência de dados, segurança, e boas práticas de design de API.

2. **Frontend (Interface de Usuário)**:
    - Desenvolvido em **Next.js**, um framework React para renderização híbrida (client-side e server-side) de aplicações web.
    - Integra totalmente com o backend, consumindo as APIs REST disponibilizadas pelo Spring Boot.
    - Utiliza **Tailwind CSS** como ferramenta para estilização baseada em classes utilitárias.

## **Pré-requisitos**
Antes de começar, é fundamental garantir que todas as ferramentas requeridas estejam instaladas. Abaixo, a lista de tecnologias necessárias:
### Ferramentas Necessárias
- **Java 21 ou superior** (JDK)
- **Gradle** (Gerenciador de dependências para o backend)
- **Node.js** (versão 22 ou superior)
- **npm** (gerenciador de pacotes Node.js)
- **IDE**: IntelliJ IDEA ou VS Code

## **Configuração do Ambiente de Desenvolvimento**

### Passo 1: Clonando o Repositório

``` bash
git clone <url_do_repositorio>
cd <nome_do_projeto>
```

### Passo 2: Configurando o Backend (Spring Boot)
1. **Abra a pasta `backend` no IntelliJ IDEA ou na sua IDE favorita.**
2. Certifique-se de que o arquivo `application.properties` contenha informações atualizadas sobre banco de dados, portas, etc. Será necessário configurar:
    - **Hibernate** para a persistência de dados.
    - **JPA** para operações no banco de dados.
    - Uma biblioteca de segurança como **Spring Security**, se aplicável.

3. Execute o seguinte comando para assegurar que todas as dependências sejam baixadas:
``` bash
   ./gradlew build
```
1. Inicie o servidor backend com:
``` bash
   ./gradlew bootRun
```
Por padrão, a API será exposta na porta `http://localhost:8080`.

### Passo 3: Configurando o Frontend (Next.js)
1. 
2. **Abra a pasta `frontend` no seu editor de texto favorito, como VS Code.**
2. Instale as dependências necessárias:
``` bash
   npm install
```
1. Execute o servidor frontend:
``` bash
   npm run dev
```
O frontend estará disponível em `http://localhost:3000` por padrão.

## **Referências**
- [Documentação Oficial do Spring Boot](https://spring.io/projects/spring-boot)
- [Documentação do Next.js](https://nextjs.org/docs)

Com isso, o modelo está pronto para sua evolução. 🚀 Se houver dúvidas, consulte a documentação ou entre em contato com seu instrutor, ou a equipe!


## **Sobre o projeto**

A ideia é que seja de uma agenda referente a serviços de pet shop, que possa fazer todas as operações (incluir, excluir e atualizar) nessa agenda dos serviços do pet shop.