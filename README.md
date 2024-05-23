# dio-trilha-java

Repositório de desafios e exercícios práticos da  **trilha JAVA** da [Digital Innovation One](https://www.dio.me/).

## Objetivo
Aprendizagem da linguagem **Java** partindo da sintaxe básica até a implementação de uma API utilizando Spring.

Grade completa:

* Princípios de Desenvolvimento de Software Colaborativo;
* Dominando a Linguagem de Programação Java;
* Programação Orientada a Objetos com Java;
* Testes e Gerenciamento de Dependências em Projetos Java;
* Banco de Dados SQL e NoSQL Para Desenvolvedores Back-end;
* Ganhando Produtividade com Spring Framework e Java;
* Soft Skills na Era Ágil: Conectando Pessoas e Oportunidades.


## Ferramentas
[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)](https://docs.github.com/)
[![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)](https://git-scm.com/doc) 
![Intellij](https://img.shields.io/badge/Intellij-000000?style=for-the-badge&logo=intellij&logoColor=E94D5F)
![Java](https://img.shields.io/badge/java-%23ED8B0000.svg?style=for-the-badge&logo=openjdk&logoColor=white)



## Projetos DIO Tilha JAVA


### Desafio Projeto Conta Terminal
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
		
 ###### Revise sobre terminal, main args e a classe Scanner

2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 (_depois ENTER para o próximo campo_)
  
###### Revise sobre concatenação e classe String com método concat

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
  
"_Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque_".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
.
Desafio na plataforma [DIO](https://www.dio.me/).

#### Autores
* [Gleyson Sampaio](https://github.com/glysns)


  
---
### Desafio Projeto Controle de Fluxo

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

  * Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo:
    `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
  * Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem:
    "O segundo parâmetro deve ser maior que o primeiro"

    1. Crie o projeto `DesafioControleFluxo`
    2. Dentro do projeto, crie a classe `Contador.java para realizar` toda a codificação do nosso programa.
    3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema.

Abaixo temos um trecho de código no qual você poderá seguir alterando as partes que contenham `??`

	public class Contador {
		public static void main(String[] args) {
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.??;
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.??;
			
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			
			}catch (? exception) {
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			}
			
		}
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
		}
	}


Desafio na plataforma [DIO](https://www.dio.me/).

#### Autores
* [Gleyson Sampaio](https://github.com/glysns)
  
---

### Desafio Modelagem e Diagramação de um Componente iPhone
Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

##### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

* Minutos relevantes: 00:15 até 00:55
#### Funcionalidades a Modelar
##### Reprodutor Musical
 * Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
##### Aparelho Telefônico
 * Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
##### Navegador na Internet
 * Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`
#### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).
   
#### Exemplo de Diagrama UML (Mermaid)

[![](https://mermaid.ink/img/pako:eNq1UrFqAzEM_ZVDU0KToRlvKBSydEgpTUcvwlbuTG3r0NkhJdy_15e6IWAyRovs9x56lqwzaDYELWiH47i12Al6FZocF6T5pEHYpMiyS6PV6JrzHz3HE53ID453FNnw82J5j9os9lFs6JqCFuF06_Q6oJDr-YscHThYzQ-zescjdWhY3kIkCRQf5mQ_eg70X75QBVyvX-rxVop6LJWkagdW4Ek8WpN_9uKtIPbkSUGbjwblW4EKU9Zh9t7_BA1tlEQrEE5dD-0B3ZhvaTAYqazFFSVj5weXxZnT9AvZLr9T?type=png)](https://mermaid.live/edit#pako:eNq1UrFqAzEM_ZVDU0KToRlvKBSydEgpTUcvwlbuTG3r0NkhJdy_15e6IWAyRovs9x56lqwzaDYELWiH47i12Al6FZocF6T5pEHYpMiyS6PV6JrzHz3HE53ID453FNnw82J5j9os9lFs6JqCFuF06_Q6oJDr-YscHThYzQ-zescjdWhY3kIkCRQf5mQ_eg70X75QBVyvX-rxVop6LJWkagdW4Ek8WpN_9uKtIPbkSUGbjwblW4EKU9Zh9t7_BA1tlEQrEE5dD-0B3ZhvaTAYqazFFSVj5weXxZnT9AvZLr9T)

#### Instruções
1. Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
2. Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o modelo acima (criado na sintaxe Mermaid), uma alternativa open-source e compatível com arquivos Markdown como este.
3. Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.
4. Submeta seu repositório GitHub conforme as orientações da plataforma DIO. Por exemplo:
   
		https://github.com/glysns/trilha-java-basico/desafios/poo/README.md


Modelagem e Diagramação:

[![](https://mermaid.ink/img/pako:eNp1UrtuwzAM_BVBU4vEYxej6FB0yRDAQAJ00cJItC1Ulgw9GgR5fHtlxw85SLWIPPJ4OIJnyo1AmlOuwLkvCZWFhmnCNPMkvk1bG40kyy4fZBuc5IWCE9qxnEDk_ZJlsd-IZ9w9KuzTsTgBd16R1lLiRnu0Gv2nNUc3Cz_A9yHfeOjqY09vaRh26wklcLydyeSue2N8HYMlPXF4TmmrnbdSV8QZXc145qIt7ncRfHmd4VUbBywBCA5n5LoUnZazlJTaEx2aw7yGCHJQKh2d_RrJcQtS_Tv-YXlPfQWrEhEhXWchLthJjws5jcc9HBZQ-VZAlbqja9qgbUCKeGlRLi6Z-hobZDSPoQD7wyjTXR8Eb3YnzWnubcA1tSZUNc1LUC5moRXgcTjTCUUhvbHb4ZC77_oHIMnneg?type=png)](https://mermaid.live/edit#pako:eNp1UrtuwzAM_BVBU4vEYxej6FB0yRDAQAJ00cJItC1Ulgw9GgR5fHtlxw85SLWIPPJ4OIJnyo1AmlOuwLkvCZWFhmnCNPMkvk1bG40kyy4fZBuc5IWCE9qxnEDk_ZJlsd-IZ9w9KuzTsTgBd16R1lLiRnu0Gv2nNUc3Cz_A9yHfeOjqY09vaRh26wklcLydyeSue2N8HYMlPXF4TmmrnbdSV8QZXc145qIt7ncRfHmd4VUbBywBCA5n5LoUnZazlJTaEx2aw7yGCHJQKh2d_RrJcQtS_Tv-YXlPfQWrEhEhXWchLthJjws5jcc9HBZQ-VZAlbqja9qgbUCKeGlRLi6Z-hobZDSPoQD7wyjTXR8Eb3YnzWnubcA1tSZUNc1LUC5moRXgcTjTCUUhvbHb4ZC77_oHIMnneg)
