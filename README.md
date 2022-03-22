## Desafio Leo - QA

Este é um repositório que contém Automação de um Teste WEB para acessar ao Moodle e adicionar um novo curso fake em Java. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas

Java
Intellij
JUnit
RestAssured
Maven
Selenium
ChromeDriver

## Testes Automatizados

Teste para validar o acesso ao Moodle e realizar a adição de um novo curso fake com sucesso, conforme História 2 do Desafio.

## Notas Gerais
Não foi possível adequar o ChromeDriver a biblioteca WebDriver do Chrome, e com isso o teste infelizmente é executado apenas na minha máquina.
Caso queira executar em sua máquina, será necessário baixar o ChromeDriver e corrigir o caminho de rede no código, por enquanto. Até adequação para a biblioteca WebDriver.

Qual linha do código deve ser corrigida: System.setProperty com o caminho correto da pasta que se encontrará o ChromeDriver baixado.

## Importante

Para a execução do código sempre com os mesmos dados para adicionar o novo curso, após executá-lo sempre é necessário excluir o curso dentro do Moodle para executar o código novamente sem erro. Ou mudar o nome do Curso, Nome Curto e Número de Identificação do mesmo dentro do Código.