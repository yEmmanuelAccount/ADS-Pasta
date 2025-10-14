<link rel="stylesheet" href="../../estilos-markdown.css">

<h1 class="pw1"> Resumo Introdutório de JavaScript (ECMAScript 6+) e TypeScript </h1>

<h2 class="pw1"> 1. Introdução e Terminologia (ECMAScript vs. JavaScript) </h2>

O termo **JavaScript** que conhecemos das antigas é, oficialmente, chamado de **ECMAScript**. Eles são considerados a mesma coisa.

Entre 2009 e 2015, muitas **novas *features*** foram adicionadas à linguagem. É importante notar que essas novas funcionalidades **não invalidam as anteriores**.

**Observação:** Quando novas *features* são implementadas, os *browsers* podem ainda não oferecer suporte. Ferramentas de compatibilidade como o Babel (discutido abaixo) ajudam a resolver isso.

<h2 class="pw1"> 2. Conceitos Fundamentais do ECMA6+ </h2>

O JavaScript moderno trouxe mudanças significativas na forma como declaramos variáveis, criamos estruturas de dados e definimos funções.

<h2 class="pw1">  2.1. Declaração de Variáveis: LET e CONST </h3>

Esta é uma das mudanças mais importantes em relação ao `var` antigo:

| Palavra-chave | Descrição Conceitual (Exemplo de Regra) | `var` | `let` | `const` |
| :---- | :---- | :---: | :---: | :---: |
| **Compatibilidade** | Funciona em todos os *browsers* | ✔ | | |
| **Declaração com mesmo nome** | Permite recriar a variável no mesmo escopo | ✔ | ✗ | ✗ |
| **Declaração sem valor inicial** | Permite declarar sem atribuir valor (inicializa como `undefined`) | ✔ | ✔ | ✗ |
| **Reatribuição de valor** | Permite mudar o valor após a atribuição inicial | ✔ | ✔ | ✗ |
| **Mutação de Propriedades** | **Exceção:** Em objetos e arrays, você **pode** alterar suas propriedades, mesmo que o container tenha sido declarado com `const`. | | | ✔ |

<h3 class="pw1">  2.2. Classes e Herança </h3>

Classes (`Classes`) provêm uma maneira mais simples e clara de **criar objetos e lidar com herança**.

*   Você pode declarar classes e usar **Expressões de Classe**.
*   O corpo da classe inclui a definição de métodos, construtores, e usa os operadores `new` e `this`.
*   A herança é implementada usando a palavra-chave **`extends`**.

<h3 class="pw1">  2.3. Estruturas e Operações em Arrays </h3>

O ECMA6+ adicionou novos tipos de dados (`Map`, `WeakMap`, `Set`, `WeakSet`) e métodos utilitários para arrays:

*   **Iteração:** `for..of`.
*   **Manipulação:** `map()`, `forEach()`, `reduce()`, `filter()`, `find()`.
*   **Busca:** `indexOf()`, `includes()`.
*   **Transformação:** `Slice()`, `Splice()`, `Join()`.

<h3 class="pw1">  2.4. Funções e Sintaxe Simplificada </h3>

*   **Arrow Functions:** Oferecem uma sintaxe mais concisa para escrever funções.
*   **Valores Padrões:** Os parâmetros predefinidos de uma função (se não forem passados) são, por padrão, `undefined`.
*   **Desestruturação (`Destructuring`):** É uma expressão que permite **extrair dados de arrays ou objetos em variáveis distintas** de maneira fácil.
*   **Operador Rest:** Permite **representar um número indefinido de argumentos como um array**.
*   **Operador Spread:** Permite que um objeto, uma expressão de array ou uma *string* seja **propagado** (expandido em elementos individuais).
*   **Template Literals:** São *strings* que permitem **expressões embutidas**. Conceitualmente, isso permite usar *strings* multi-linhas e **interpolação de *string*** com expressões (e.g., `${variavel}`).
*   **Sintaxe Curta de Objeto (*Shorthand*):** Quando o nome da variável é igual ao nome da propriedade do objeto, você não precisa atribuir explicitamente a variável na propriedade.

<h2 class="pw1">  3. Ferramentas de Compilação e Módulos </h2>

Para que os navegadores entendam as novas funcionalidades do ECMA6+, usamos ferramentas de transpilação e empacotamento.

<h3 class="pw1"> 3.1. Babel e Webpack </h3>

*   **Babel:** É usado para transformar o código `main.js` (com *features* ECMA6+) em um arquivo `bundle.js` que é compatível com *browsers* mais antigos. A configuração envolve a instalação de dependências como `@babel/cli`, `@babel/preset-env` e `@babel/core`.
*   **Webpack Server:** É um serviço que permite trabalhar com vários arquivos, convertendo-os em um único arquivo `bundle.js`. Ele também permite que o recurso de módulos funcione no *front-end*.

<h3 class="pw1">  3.2. Módulos: import vs require() </h3>

Módulos são usados para importar e exportar funcionalidades entre arquivos.

| Característica | `import` (ECMA6+) | `require()` (Node.js/CommonJS) |
| :--- | :--- | :--- |
| **Padrão** | ECMA+ | CommonJS |
| **Carregamento** | Assíncrono | Síncrono |
| **Sintaxe de Exportação (Antiga)** | Pode usar `module.exports` | Usa `module.exports` |
| **O que importa** | Importa partes específicas do que foi exportado. | |

Para usar `import`/`export` no Node.js sem o Babel, você pode adicionar `"type": "module"` ao `package.json` ou instalar a biblioteca `esm`.

<h2 class="pw1"> 4. Funções Assíncronas (Async/Await) e Requisições </h2>

Funções normais são executadas sequencialmente: a função B só inicia após a função A terminar.

**Funções Assíncronas**, por outro lado, permitem que a função B execute mesmo que a função A ainda não tenha terminado.

*   `async function`: Define uma função assíncrona. Ela sempre retorna uma `Promise`.
*   `await function`: É usado **para esperar por uma Promise**. Ele retorna o valor final da *promise*.

<h3 class="pw1">  4.1. Biblioteca Axios </h3>

Axios é um **cliente HTTP** que funciona tanto no *browser* quanto no Node.js, e fornece uma API para trabalhar com requisições assíncronas.

*   Todas as funções do Axios **retornam *promises***.
*   Ele realiza requisições HTTP (como `get()`, `post()`, `put()`, `delete()` e `all()`).
*   Automaticamente, transforma respostas em **JSON**.

<h2 class="pw1"> 5. TypeScript (TS) </h2>

TypeScript é um superset do JavaScript. Sua principal característica é ser uma linguagem **fortemente tipada**.

<h3 class="pw1">  5.1. Vantagens do TypeScript </h3>

O TypeScript estende o JavaScript adicionando tipos. Isso é crucial porque:

*   **Economiza tempo** ao detectar erros.
*   Fornece correções **antes** de você executar o código.

<h3 class="pw1">  5.2. Conceitos de Tipagem </h3>

*   **Tipagem Explícita:** Você especifica qual será o tipo de cada variável (ex: `let nome: string = "Fabio";`).
*   **Inferência de Tipos:** O TypeScript pode reconhecer automaticamente o tipo da variável quando você atribui um valor a ela.
*   **Tipo `Any`:** É o tipo padrão se você não especificar um tipo, mas **não é recomendado**, pois perde-se a utilidade da tipagem, já que aceita qualquer dado.
*   **Union (`|`):** Permite adicionar mais de um tipo a uma variável (ex: `let valor: string | number;`).
*   **Propriedades Opcionais:** Usamos o sinal de **`?`** para informar que uma propriedade dentro de um objeto é opcional.
*   **Generics (`<T>`):** Permitem **reutilizar uma determinada implementação de código de forma tipada**. A letra `<T>` representa um *Type* genérico, mas convenções como `<K>` (Key) ou `<E>` (Element) também existem.

<h3 class="pw1"> 5.3. Type vs. Interface </h3>

Ambos são usados para definir tipagens no TypeScript.

*   `Type`: É mais simples e flexível, e **mais recomendado** para lidar com tipos primitivos.
*   `Interface`: É utilizada normalmente na criação de *libraries* ou por aqueles que preferem a **programação orientada a objetos**.

<h3 class="pw1"> 5.4. Tipos Utilitários (Exemplos de Uso) </h3>

O TypeScript oferece tipos utilitários para manipular tipos existentes:

*   `Partial<T>`: Torna todas as propriedades de um tipo **opcionais** (útil, por exemplo, para edição parcial de um objeto).

```
type Usuario = {
    id: number;
    nome: string;
    senha: string;
};

type UsuarioParcial = Parcial<Usuario>; // saída: { nome?: string; email?: string; idade?: number; }

const dadosAtualizados: UsuarioParcial = {
    email: "novo@email.com"
};
```

*   `Omit<T, k>`: **Remove** uma ou mais propriedades específicas de um tipo (útil para ocultar dados sensíveis).

```
type Usuario = {
    id: number;
    nome: string;
    senha: string;
};

type UsuarioSemSenha = Omit<Usuario, "senha">; // saída: {id: number; nome: string }

const u: UsuarioSemSenha = { id: 1, nome: "Ana" };
```
*   `Pick<T, k>`: **Seleciona somente algumas propriedades** de um tipo.

```
type Produto = {
    id: number;
    nome: string;
    preco: number;
};

type ProdutoResumo = Pick<Produto, "id" | "nome">; // saída: { id: number; nome: string }
```

*   `Required<T>`: Torna todas as propriedades de um tipo **obrigatórias**.

```
type ConfigOpcional = {
    tema?: string;
    modoEscuro?: boolean;
};

type ConfigObrigatoria = Required<ConfigOpcional>; // saída: { tema: string; modoEscuro: boolean }
```

<h2 class="pw1"> 6. Fluxo de Desenvolvimento (TS) </h2>

Para desenvolver em TypeScript, você tipa os arquivos com a extensão `.ts`. O compilador (`tsc`) então encontra esses arquivos `.ts` e os **converte em arquivos `.js`** (JavaScript). Você executa o código final com `node /arquivo.js`.