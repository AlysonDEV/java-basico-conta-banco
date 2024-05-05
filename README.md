# Java Básico - Conta Banco
## Getting Started

Projeto criado para exercícios de sintaxe na linguagem java.

## Objetivos

- [x] Criar um projeto com o nome ContaBanco
- [x] Receber informações via terminal
- [x] Exibir as informações recebedas em uma mensagem de retorno no terminal

## Desafios

Trabalhando com importações de pacotes e entendo que a própria linguagem ou frameworks podem trazer soluções que deixem o nosso projeto mais produtivo. Nesse caso trabalhei com a bibliotéca Scanner que fazer a integração do que é digitado no teclado utilizando o NextLine para pegar a próxima linha digitada, o NextInt para converter a linha digitada em numero inteiro, o NextDouble para converter a próximo linha digitada em um numero com "ponto flutuante" e também o Next para pegar um texto (e notei que o texto é de apenas uma única palavra).

## DESAFIO DIO - Trilha Java Básico
www.dio.me

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Sintaxe - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Revise sobre regras de declaração de variáveis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


###### Revise sobre terminal, main args e a classe Scanner
2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)* 

###### Revise sobre concatenação e classe String com método concat

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.