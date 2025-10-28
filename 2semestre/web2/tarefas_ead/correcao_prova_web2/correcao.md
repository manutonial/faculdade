# Correção das questões Teoricas - Web

**Questão 3**  
Qual é a maneira correta de criar um novo objeto `Date` representando a data e hora atuais em JavaScript?

| Alternativa | Opção                         | Correta? |
|-------------|--------------------------------------------|----------|
| A           | `let today = new Date().now();`            | ❌       |
| B           | `let today = new Date();`                  | ✅       |
| C           | `let today = Date.now();`                  | ❌       |
| D           | `let today = Date.today();`                | ❌       |

**Questão 4**
Qual das opções a seguir é uma maneira válida de criar um objeto Date representando o dia  07 de novembro de 2024 em JavaScript?

| Alternativa | Opção                         | Correta? |
|-------------|--------------------------------------------|----------|
| A           | `new Date("2024-07-11")`                   | ✅       |
| B           | `new Date("2024-11-07")`                   | ❌       |
| C           |`new Date("07-11-2024")`                    | ❌       |
| D           |`new Date("07/11/2024")`                    | ❌       |

**Questão 5**
Qual é o mecanismo de propagação de eventos no DOM conhecido como Bubbling?

| Alternativa | Opção                          | Correta? |
|-------------|--------------------------------------------|----------|
| A           | `O evento é delegado a um elemento pai para manipular eventos de seus filhos.`                                   |   ❌     |
| B           | `O evento é manipulado primeiro pelo elemento mais interno (alvo) e propaga-se para cima (default).`                   | ✅       |
| C           |` O evento é manipulado primeiro pelo elemento ancestral mais externo e propaga-se para baixo até o elemento alvo `                    | ❌       |
| D           |`O evento é manipulado simultaneamente em todos os elementos da árvore DOM.`                    | ❌       |

**Questão 11**
Assinale a alternativa que apresenta a função correta para criar um elemento do tipo parágrafo em JS

| Alternativa | Opção                         | Correta? |
|-------------|--------------------------------------------|----------|
| A           | `document.createChildElement('p');`|                                      ❌       |
| B           | `document.appendElement('p');`                   | ❌ |
| C           |`document.createElement('p');`                    | ✅       |
| D           |`document.createElement('<p>');`                    |❌       |

**Questão 12**
Em uma arquitetura Web Cliente-Servidor, qual componente é primariamente responsável por manipular o DOM (Document Object Model) e fornecer a maior parte da interatividade na interface do usuário sem a necessidade de recarregar a página?

| Alternativa | Opção                         | Correta? |
|-------------|--------------------------------------------|----------|
| A           | `O protocolo HTTP.`                   | ❌       |
| B           | `O JavaScript (ou bibliotecas como jQuery) executado no Navegador (Cliente).`                   | ✅       |
| C           |`A linguagem de programação do lado do Servidor (ex: PHP, Java).`                    | ❌       |
| D           |`O banco de dados.`                    | ❌       |

**Questão 13**
Qual será a saída do código abaixo
let str = "   JavaScript ADS   ";
let result = str.trim();
console.log(result);

| Alternativa | Opção                         | Correta? |
|-------------|--------------------------------------------|----------|
| A           | `"JavaScript ADS"`                   | ❌       |
| B           | `"JavaScriptADS"`                   | ✅       |
| C           |`"JavaScript ADS   "`                    | ❌       |
| D           |`"   JavaScript ADS"`                    | ❌       |

**Questão 14**
Assinale a alternativa que apresenta o valor correto na variável result após a execução do código JS abaixo
email = 'paulo@gmail.com';
result= email.substr(0,email.indexOf('@'));

| Alternativa | Opção                         | Correta? |
|-------------|--------------------------------------------|----------|
| A           | `@`                   | ❌       |
| B           | `@gmail.com`                   | ❌       |
| C           |`gmail.com`                    | ❌       |
| D           |`paulo`                    | ✅       |
