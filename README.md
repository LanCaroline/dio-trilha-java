# dio-trilha-java

Repositório de desafios e exercícios práticos da  **trilha JAVA** da [Digital Innovation One](https://www.dio.me/).

## Objetivo
Aprender a linguagem **JAVA** e lógica de programação.

## Ferramentas
[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)](https://docs.github.com/)
[![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)](https://git-scm.com/doc) 
![Intellij](https://img.shields.io/badge/Intellij-000000?style=for-the-badge&logo=intellij&logoColor=E94D5F)
![Java](https://img.shields.io/badge/java-%23ED8B0000.svg?style=for-the-badge&logo=openjdk&logoColor=white)


---
## Desafio do Projeto Conta Terminal
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:

2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.
Revise sobre regras de declaração de variáveis

<table>
 <thead>
    <tr align="left">
      <th>Atributo</th>
      <th>Tipo</th>
      <th>Exemplo</th>
    </tr>
  </thead>
   <tbody align="left">
    <tr>
      <td>Numero</td>
      <td>Inteiro</td>
      <td align="center">1021</td>
    </tr>
    <tr>
      <td>Agencia</td>
      <td>Texto</td>
      <td align="center">067-8</td>
    </tr>
    <tr>
      <td>Nome Cliente</td>
      <td>Texto</td>
      <td align="center">MARIO ANDRADE</td>
    </tr>
    <tr>
      <td>Saldo</td>
      <td>Decimal</td>
      <td align="center">237.48</td>
    </tr>
  </tbody>
  <tfoot></tfoot>
</table>
		
 Revise sobre terminal, main args e a classe Scanner

2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 (depois ENTER para o próximo campo)
Revise sobre concatenação e classe String com método concat
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
.
Desafio na plataforma [DIO](https://www.dio.me/).
