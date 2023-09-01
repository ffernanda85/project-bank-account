### Bootcamp Santander - DIO Java backened - 2023

# 🪙 Projeto - ContaBanco

É um projeto que visa por em prática, os conceitos que aprendemos neste primeiro momento do curso.

## 📌 Temas Abordados:

- [x] Anatomia das classes;
- [x] Padrão de nomenclatura de: classes, métodos e variáveis;
- [x] Tipos e variáveis;
- [x] Operadores;
- [x] Métodos;
- [x] Escopo;
- [x] Palavras reservadas;
- [x] Documentação.


## 🤔 Idealizador do projeto
* [Gleyson Sampaio](https://www.linkedin.com/in/glysns/)

## 📚 Sintaxe do desafio Desafio
link: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe

## Projeto

### ✏️ Nome das Classes

Para estruturar as nomenclaturas das classes, métodos e variáveis utilizei o padrão em inglês. Para me aproximar ao máximo do padrão atual.

### 🧱 Estrutura do Projeto

* Criei o projeto `BankAccount` que receberá dados via terminal contendo as características de conta em banco conforme atributos definidos e solicitados no projeto.

* Dentro do projeto, criei a classe `TerminalAccount.java` para realizar toda a codificação do programa.

#### Criando Instância da Classe Scanner

* Revisando a criação de instância da classe Scanner.

```Java
//Criando nossa instância do Scanner para fazer a leitura dos dados inseridos pelo usuário
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
```

#### Variáveis Criadas

* Revisando sobre regras de declaração de variáveis

```Java
    int account = scanner.nextInt();
    String agency = scanner.next();
    String firstName = scanner.next();
    String lastName = scanner.next();
    double balance = scanner.nextDouble();
```

#### Solicitando Dados do Usuário e Atribuindo a Variável

* Revisando sobre terminal, main args, regras de declaração de variáveis e classe Scanner.

```Java
//solicitando dado do usuário
System.out.println("Enter your account number, please: ");
//atribuindo a variável o dado inserido pelo usuário
int account = scanner.nextInt();
```

#### Imprimindo os Dados Recebidos

* Revisando sobre a classe String com o método `.concat()`
```Java
//concatenando nomes usando o método .concat()
String fullName = firstName.concat(" ").concat(lastName);
```

* Revisando sobre concatenação

```Java 
//concatenando strings e imprimindo a mensagem
System.out.println("Olá " +  fullName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account + " e seu saldo de " + balance + " já está disponível para saque.");
```

## 👩🏽‍💻Pessoas Autoras:

<img style='width:130px'  src='https://avatars.githubusercontent.com/u/114631584?v=4' alt='pessoa desenvolvedora'>

<h4>Flávia Santos</h4>

Linkedin: https://www.linkedin.com/in/flavia-santos-dev/
