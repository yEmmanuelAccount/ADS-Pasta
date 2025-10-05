<!-- Link do CSS -->
<link rel="stylesheet" href="../../estilos-markdown.css">

<!-- Início do Documento -->
<h1 class="pw1">ECMA6+ / TypeScript</h1>

<h2 class="pw1"> Backend </h2>

* Regras de negócio
* Conexão com **Banco de Dados**
* Envio de email
* COmunicação com web-services
* Autenticação do usuário
* Criptografia e segurança

<h2 class="pw1"> Introdução </h2>

**JavaScript** e ECMAScript são a mesma coisa.

Conhecemos por `.js` das antigas que patentearam, mas seu nome oficial é **ECMAScript**.

<div class="pw1"> Versões do JavaScript </div>
<table>
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

<h3 class="pw1"> ECMAScript </h3>

Usando o **ECMAScript**, é possível:
* criação de novos tipos de dados (exemplos: **Map**, **WeakMap**, **Set**, **WearSet**)
* declaração de variáveis como `let` (recebe qualquer coisa) e `const` (constante).

<h1 class="pw1"> BabelJS </h1>

Usado para converter ESNext para ES5.

Link: [https://babeljs.io/](https://babeljs.io/)

<h2 class="pw1"> Configurando o Babel </h2>

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

<h2 class="pw1"> Conceitos ECMA6+ </h2>

<h3 class="pw1"> Classes </h3>

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

<h3 class="pw1"> Corpo de Classes: Definições de Métodos, Construtores e Operadores NEW e THIS </h3>

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

<h3 class="pw1"> Herança de Classes (extends) </h3>

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

<h2 class="pw1"> Variáveis: VAR, LET e CONST </h2>

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
