  # Teste API The Movie Database com Rest Assured

1. [Instalação e Configuração](https://github.com/luanlinares/apimoviedb_RestAssured/blob/master/README.md#instalacao-e-configuracao)  

2. [Execução dos testes](https://github.com/luanlinares/apimoviedb_RestAssured/blob/master/README.md#execucao-dos-testes)  

3. [Estrutura do Projeto](https://github.com/luanlinares/apimoviedb_RestAssured/blob/master/README.md#estrutura-do-projeto)

4. [Considerações Gerais](https://github.com/luanlinares/apimoviedb_RestAssured/blob/master/README.md#consideracoes-gerais)  


> # Instalação e Configuração

**Java**

Esse projeto foi realizado utilizando Java como linguagem e o JDK Kit 8.

1. Accesse https://www.oracle.com/java/technologies/javase-jdk8-downloads.html.

2. Faça o download do "devkit" Java SE Development Kit 8u251 de acordo com o seu sistema operacional

3. Instalação. 
    
    a. Ative a instalação padrão.
    b. Não esqueça de setar as variáveis de ambiente. 

4.  Accesse o terminal e verifique se a instalação foi realizada corretamente
    
   Execute o comando

    `java -version`

    Se a sua instalação foi realizada corretamente, você deve visualizar algo parecido com:
        java version "1.8.0_251"
        Java(TM) SE Runtime Environment (build 1.8.0_251-b08)
        Java HotSpot(TM) 64-Bit Server VM (build 25.251-b08, mixed mode)
    
5. On Consoler, execute:

*Importante:*
Caso tenha alguma versão do java ja instalada, desinstale antes de instalar a versão 8.
Feche todos os terminais abertos antes de executar o comando 'java -version'



**IDE - Eclipse**
Nesse projeto, utilizamos a IDE Eclipse para escrever nossos testes. Para instalar basta acessar o link abaixo para fazer o download do Eclipse IDE:

https://www.eclipse.org/downloads/


**Dependências**
As dependências utilizadas no projeto estão no arquivo 'pom.xml', são elas: 
RestAssured;
Google gson;
jUnit.


**Clone o projeto**

1. Clone o project:
    
    * Usando SSH:
        
        `git@github.com:luanlinares/apimoviedb_RestAssured.git`

    * Usando https:
        
        `https://github.com/luanlinares/apimoviedb_RestAssured.git`


    # Execução dos Testes

**Eclipse IDE/**

*Classe única* → Clicar com o botão direito no nome da classe de @test que deseja executar >> Opção Run As >> 1 JUnit Test 
*Classe com todos os testes* → Clicar na seta do botão Run localizado na barra de ferramentas >> Opção Run As >> 1 JUnit Test 



>  # Estrutura do Projeto

**POM**

*pom.xml* → Arquivo de configuração dos testes, onde se concentram todas as dependências que serão utilizadas para rodar os testes. 


**Pacote core**
Possui arquivos e classes que serão utilizados em todas as classes de teste. 

*BaseTest* → Essa classe será extendida nas classes de teste e ativa os itens inseridos no arquivo de constantes. 


*Constantes* → Neste arquivo constam todos os dados fixos que serão utilizados nos testes, como a URL de Base, api_key, regras de timeout, etc.


**Maven Dependencies**
Local onde são instaladas as dependências solicitadas no pom.xml, além de demais recursos do projeto. 


**Pacote tests**
Pacote onde constam as ckasses de teste. 


>  # Considerações Gerais


**Quais testes foram realizados?**
 
1. Listagem de filmes mais bem avaliados.
2. Busca de um filme por título.
3. Busca de um filme por título inválido (cenário negativo)


**Site The Movie database**
https://www.themoviedb.org/


**Como obter uma api_key?**
1. Faça o cadastro no site;
2. Faça o login;
3. Clique na sua imagem de perfil e acesse as configurações;
4. No menu lateral, acesse a opção API;
5. Nessa tela serão exibidos o token, api-key e exemplos de uso.


**Documentação da API**

https://developers.themoviedb.org/3/getting-started

