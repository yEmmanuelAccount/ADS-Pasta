<!-- Link do CSS -->
<link rel="stylesheet" href="../../estilos-markdown.css">

<!-- Início do Documento -->
<h1 class="pw1">ECMA6+ / TypeScript</h1>

<h1 class="pw1"> Backend </h1>

* Regras de negócio
* Conexão com **Banco de Dados**
* Envio de email
* COmunicação com web-services
* Autenticação do usuário
* Criptografia e segurança

<h1 class="pw1"> Introdução </h1>

**JavaScript** e ECMAScript são a mesma coisa.

Conhecemos por `.js` das antigas que patentearam, mas seu nome oficial é **ECMAScript**.

<div class="pw1"> Versões do JavaScript </div>
<table class="tabela-resumo">
    <title> Versões do JS </title>
    <thead>
        <tr>
            <th scope="col"> Nome </th>
            <th scope="col"> Ano </th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th scope="row"> ECMA-262 v5 </th>
            <td> 2009 </td>
        </tr>
        <tr>
            <th scope="row"> ECMA-262 v6 ou ES6 / ES2015 </th>
            <td> 2015 </td>
        </tr>
        <tr>
            <th scope="row"> ES2016 </th>
            <td> 2016 </td>
        </tr>
        <tr>
            <th scope="row"> ES2017 </th>
            <td> 2017 </td>
        </tr>
    </tbody>
</table>

* De 2009 a 2015 foram acrescentadas muitas `features`.
* As novas features acrescentadas não invalidam as anteriores.
* Quando essas features são implementadas, os browsers (navegadores) ainda não dão suporte.

<h2 class="pw1"> ECMAScript </h2>

Usando o **ECMAScript**, é possível:
* criação de novos tipos de dados (exemplos: **Map**, **WeakMap**, **Set**, **WearSet**)
* declaração de variáveis como `let` (recebe qualquer coisa) e `const` (constante).

<h1 class="pw1"> BabelJS </h1>

Usado para converter ESNext para ES5.

Link: [https://babeljs.io/](https://babeljs.io/)

<h1 class="pw1"> Configurando o Babel </h1>

<div class="pw1"> Inicializando o Projeto </div>

Cria arquivo `package.json`. Este será o "manifesto" do projeto, onde todas as dependências e scripts personalizados serão registrados.

É o ponto de partida de qualquer projeto **Node** ou **JS**.

**Node**
```
npm init
```

**Yarn**
```
yarn init
```

<div class="pw1"> Instalar a dependência Babel - Interface </div>

Esse passo da instalação usa comando de instalação de pacotes.

A **Interface de Linha de Comando** é a ferramenta que permite a execução do Babel no terminal. Ele transforma comandos no terminal (como "compile este arquivo") em ações que o `core` do Babel pode entender.

**Node**
```
npm install @babel/cli
```

**Yarn**
```
yarn add @babel/cli
```

<div class="pw1"> Conjunto de Regras </div

Com o Conjunto de **Plugins Inteligente (Preset)**, o Babel não transforma nada por conta própria, ele precisa de plugins. 

O `@babel/preset-env` é um **preset** que agrupa todos os plugins necessários para converter códigos JavaScript moderno (ES6, ES7, etc) em código JS compatível com os navegadores que você deseja suportar. Ele faz o trabalho "pesado" de determinar quais transformações são necessárias.

**Node**
```
npm install @babel/preset-env
```

**Yarn**
```
yarn add @babel/preset-env
```

<div class="pw1"> Motor </div>

Com o **Motor de Transformação** é o pacote principal que contém a **lógica central** do Babel.

Ele é o responsável por receber o código, aplicar os `presets` e, plugins e finalmente, gerar o código transformado (transpilado). Ele é o "coração" da operação. 

**Node**
```
npm install @babel/core
```

**Yarn**
```
yarn add @babel/core
```

<div class="pw1"> Filtragem </div>

Crie um arquivo `.gitignore` para colocar o arquivo **node_modules** dentro e assim evitar que ele seja salvo no repositório virtual.

<div class="pw1"> Arquivo de Configuração </div>

Crie um arquivo `.babelrc` ou `babel.config.js` para que seja possível configurar o Babel.

Esse arquivo será um mapa de instruções que diz ao motor do Babel (o **@babel/core**) o que ele deve fazer e quais regras deve seguir ao processar seu código.

Dentro dele, coloque:
```
{
    "presets": ["babel/preset-env"]
}
```

<div class="pw1"> Transpilação Automática </div>

Colocando o código a seguir no arquivo `package.json`, é criado um script personalizado que automatiza o processo de transpilação (conversão) do seu código usando o Babel.

```
"scripts": {
    "dev": "babel .main.js -o ./bundle.js -w"
}
```

<div class="pw1"> Inicialização </div>

Use um dos comandos abaixo para iniciar o desenvolvimento do seu projeto. No geral, eles fazem exatamente a mesma coisa: executam o script que você acabou de configurar no `package.json`.

**Node**
```
npm run dev
```

**Yarn**
```
yarn dev
```

<h1 class="pw1"> Conceitos ECMA6+ </h1>

<h2 class="pw1"> Classes </h2>

A utilização de **classes** provêm uma maneira mais simples e claras de criar objetos e lidar com herança.

Declaração (forma 01):
```(TypeScript)
class Retangulo {
    constructor (altura, largura) {
        this.altura = altura;
        this.largura = largura;
    }
}
```

Declaração (forma 02 - sem nome):
```(TypeScript)
let Retangulo = class {
    constructor (altura, largura) {
        this.altura = altura;
        this.largura = largura;
    }
}
```

Declaração (forma 03 - com nome):
```(TypeScript)
let Retangulo = class Retangulo {
    constructor (altura, largura) {
        this.altura = altura;
        this.largura = largura;
    }
}
```

<h2 class="pw1"> Corpo de Classes: Definições de Métodos, Construtores e Operadores NEW e THIS </h2>

```(TypeScript)
class Retangulo {
    constructor(altura, largura) {
        this.altura = altura;
        this.largura = largura;
    }

    calcularArea() {
        return this.altura * this.largura;
    }
}

const quadrado = new Retangulo(10, 10);

console.log(quadrado.calcularArea());
```

<h2 class="pw1"> Herança de Classes (extends) </h2>

```
class Gato {
    constructor(nome) {
        this.nome = nome;
    }

    falar() {
        console.log(this.nome + 'faça barulho.');
    }
}

class Leao extends Gato {
    falar() {
        super.falar();
        console.log(this.nome + 'rosne');
    }
}

let leao = new Leao('Leonidas');
leao.falar();
```

<h2 class="pw1"> Variáveis: VAR, LET e CONST </h1>

<div class="pw1"> VAR </div>

* funciona em todos browsers cross-browser.
* **é possível** criar variáveis com o mesmo nome.
* **é possível** declarar sem atribuir valor.

<div class="pw1"> LET </div>

* **NÃO é possível** criar variáveis com o mesmo nome.
* **é possível** declarar sem atribuir valor.

<div class="pw1"> CONST </div>

* **NÃO é possível** declarar sem atribuir valor.
* **NÃO é possível** atribuir outro valor caso já tenha sido atribuído anteriormente.
  * em `objetos` e `arrays`, é possível atribuir em suas propriedades **(mutação)**.

``` (JavaScript)
const usuario = { nome: 'Diego' }; // declaração

usuario.nome = 'Cleiton'; // mutação

console.log(usuario); // saída: 'Cleiton'
```

<h2 class="pw1"> Escopo </h1>

<div class="pw1"> VAR x LET </div>

Usando **let** na declaração, dentro de um bloco, será visível e acessível somente dentro do bloco.

```
if (true) {
    let y = 5;
}

console.log(y); // retorno: "ERRO"
```

Se a declaração for feita com **var**, dentro de um bloco, será visível globalmente.

```
if (true) {
    var x = 5;
}

console.log(x); // retorno: "5"
```

<div class="pw1"> Operações com Arrays </div>

Essa função foi adicionada no ECMA6+ com uma sintaxe mais simples

<div class="pw1"> Sintaxe Básica </div>

```
(parametro1, parametro2, ..., parametroN) => { statement }

(parametro1, parametro2, ..., parametroN) => expression
```

<div class="pw1"> Exemplos </div>

```
let hello = () => { return "Hello World!"; }

let hello = (val) => "Hello " + val;

let hello = val => "Hello " + val;
```

<div class="pw1"> Funções de Array </div>

```
// criação do Array
let elements = [
    'Hydrogen',
    'Helium',
    'Lithium',
    'Beryllium'
];

// form1
let lengthsWords1 = elements.map(function(element) {
    return element.length;
});

// form2
let lengthsWords2 = elements.map((element) => {
    return element.length;
});
```

<div class="pw1"> Valores Padrões </div>

**Os parâmetros predefinidos de uma função** são todos `undefined`.

```
// definição da função
function multiply (a, b = 1) {
    return a * b;
}

multiply(5, 2);
multiply(5, 1);
multiply(5);

console.log(multiply());
```

<h2 class="pw1"> Desestruturação </h2>

São expressões que **possibilitam extrair dados de arrays ou objetos** e atribuí-los diretamente em variáveis.

* **Arrays**

```
let x = [1, 2, 3, 4, 5]; // criação do array
let [y, z] = x;

console.log(y); // saída: "1"
console.log(z); // saída: "2"

let [a, ...b] = [1, 2, 3];

console.log(a); // saída: "1"
console.log(b); // saída: "2" e "3"
```

Na segunda linha, `let [y, z] = x`, ocorre uma desestruturação pegando os **dois primeiros elementos** de `x` e atribua para `y` (que receberá "1") e `z` (que receberá "2"). Os demais elementos são ignorados na operação.

Na quinta linha, `let [a, ...b] = [1, 2, 3]`, é criado um novo array e o desestrutura imediatamente. A variável `a` recebe o **primeiro** elemento e o `b` recebe o **restante** do elementos com o uso do operador **REST**.

* **Objetos Literais**

```
let o = {p: 42, q: true};
let {p2, q2} = o;

console.log(p2); // saída: "42"
console.log(q2); // saída: "true"

let {a = 10, b = 5} = {a: 3};

console.log(a);
console.log(b);
```

Nesses código, na linha 1, é criado um Objeto Literal `o` com duas propriedades: p = 42 e q = true.

Já na segunda linha, `let {p, q} = o`, ocorre a desestruturação. Ao usar as chaves **{}** do lado esquerdo da atribuição, o JavaScript busca a propriedade `p` do objeto `o` e atribui seu valor (42) a uma nova variável `p2`. A mesma coisa ocorre com a nova variável `q2`, que recebe o valor da propriedade `q` do objeto `o`.

Na sétima linha, `let {a = 10, b = 5} = {a: 3}`, é mostrado como definir um **valor padrão** caso uma propriedade não exista no objeto original (undefined). O objeto, que só tem a propriedade `a`, também é desestruturado.

Para `a`:
* o objeto de origem tem `a: 3`.
* o valor `3` é atribuído à variável `a`.
* o valor padrão (10) é **ignorado** porque a propriedade `a` existia.

Para `b`:
* o objeto de origem **não tem** a propriedade `b`.
* o valor `5` é usado e atribuído à variável `b`.

<h2 class="pw1"> Operador REST </h2>

Permite representar um número indefinido de argumento como **array**.

Só pode ser usado no **último parâmetro** de uma função.

<div class="pw1"> Como instalar </div>

* No terminal:
```
npm install @babel/plugin-proposal-object-rest-spread
```

* No arquivo de configurações (`.babelrc`):
```
"plugins": ["@babel/plugin-proposal-object-rest-spread"]
```

<div class="pw1"> Exemplo </div>

```
function multiply(multiplier, ...theArgs) {
    let arr = theArgs.map(element => multiplier * element);
    return arr;
}

let arr = multiply(2, 1, 2, 3);
console.log(arr);
```

Na função `multiply`, o argumento **multiplier** recebe o primeiro argumento passado (2). O operador `rest` coleta os argumentos restante dos elementos passados na chamada da função e os agrupa em um array chamado **theArgs**.

Dentro da função `multiply`, o método **map()** itera sobre o array **theArgs** ([1, 2, 3]) e aplica a função de multiplicação a cada elemento passado como argumentos. 

Assim, _multiplier_ * elementos:

$$
2 * 1 = 2
$$
$$
2 * 2 = 4
$$
$$
2 * 4 = 8
$$

<h2 class="pw1"> Operador Spread (Espalhamento) </h1>

Esse operador permite que um objeto, uma expressão, um array ou uma string seja propagado.

```
function sum(x, y, z) {
    return x + y + z;
}

const numbers = [1, 2, 3];

console.log(sum(...numbers));
```

```
let obj1 = { foo: 'bar', x: 42};
let obj2 = { foo: 'baz', x: 13};

let clonedObj = { ...obj1 };
let mergedObj = { ...obj1, ...obj2};
```

```
let parts = ['shoulders', 'kness'];
let lyrics = ['head', ...parts, 'and', 'toes'];

// ["head", "shoulders", "kness", "and", "toes"]
```

<h2 class="pw1"> Template Literals </h1>

1\. **Interpolação de Expressões**

`O que é`: Permite que você insira o resultado de qualquer expressão JavaScript/TypeScript diretamente dentro da string, usando a sintaxe **${expressão}**.

`Benefício`: Evita a concatenação de strings com o operador +, que pode ser confuso e difícil de ler.

```
var a = 5;
var b = 10;

console.log(`Quinze é ${a + b} e não ${2 * a + b}.`); // Quinze é 15 e não 20.
```

2\. **Strings Multi-linhas** - ponto chave

`O que é`: Ao usar a crase ( ` ), você pode quebrar a linha da sua string no código sem precisar do caractere de nova linha (\n).

`Benefício`: Isso é especialmente útil para criar blocos de código (como HTML ou SQL) ou mensagens longas, melhorando muito a legibilidade do seu código.

```
// Usando Template Literal (com crase `)
let htmlTemplate = `
  <h1>Título da Página</h1>
  <p>Este parágrafo ocupa duas linhas,
  e ainda posso usar a variável ${a}.</p>
`;

// Forma antiga (com aspas " ou ') - Note a necessidade do \n
let oldString = "Linha 1\n" +
                "Linha 2"
```

<h2 class="pw1"> Sintaxe curta de Objetos </h2>

Quando temos o nome da variável igual o nome da propriedade do objeto **não precisa atribuir a variável nas propriedades**.

```
// propriedades
const nomeX = "jean";
const empresaIsis = "ISIS LTDA"

// formação do objeto
const usuario4 = {
    nomeX,
    empresa: empresaIsis,
    cpf: "444.444.444-44"
}

// print do objeto
console.log(usuario4);
```

<h1 class="pw1"> Webpack Server ECMA6+ </h1>

Serviço que vai permitir trabalhar com vários arquivo, convertendo em um único arquivo **bundle.js**.

<h3 class="pw1"> Fazendo o recurso de módulos funcionando no front-end </h3>

<div class="pw1"> Configurando Webpack </div>

```
npm install webpack webpack-cli –D
npm install babel-loader@8.0.0-beta.0 -D
```

<div class="pw1"> Depois de Instalar a Dependência </div>

```
npm install webpack-dev-server -D
```

Criar e Configurar os arquivos abaixo:

1. **package.json**

```
"scripts": {
    "dev": "webpack-dev-server --mode=development",
    "build": "webpack --mode=production"
}
```
Depois: `npm run dev`

2. **webpack.config.js**

```
module.exports = {
    entry: './src/main.js',
    output: {
        path: __dirname + '/public',
        filename: 'bundle.js',
    },
    devServer: {
        contentBase: __dirname + '/public',
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                use: {
                    loader: 'babel-loader',
                }
            }
        ],
    },
};
```

<div class="pw1"> Import </div>

Usada para importar vínculos que são exportados por um outro módulo.

Sintaxe:
```
import defaulExport from "module-name";

import * as name from "module-name";

import { export } from "module-name";

import { export as alias } from "module-name";

import { export1, export2 } from "module-name";

import { foo, bar } from "module-name/path/to/specific/un-exported/file";
```