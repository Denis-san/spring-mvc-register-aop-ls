# spring-mvc-register-aop-ls
Aplicação web no padrão MVC com Spring MVC + Thymeleaf. Objetivo: aplicação dos conceitos adquiridos sobre AOP (Programação Orientada a Aspectos). A aplicação consiste em um simples registro de usuários.

- O objetivo é apenas aplicar alguns advices, por meio deles são registrados alguns logs: 

<img src="/screenshots/logs.png" alt="screenshot log">


O advice @Before será executado antes de qualquer método de qualquer classe dos pacotes Controller, Service e repository.

<img src="/screenshots/before-advice.png" alt="screenshot log">

O advice @AfterReturning é "acionado" após a execução bem sucedida do método save de qualquer classe do pacote Service, registrando um log com o id do novo usuário.

<img src="/screenshots/afteReturn-advice.png" alt="screenshot log">
