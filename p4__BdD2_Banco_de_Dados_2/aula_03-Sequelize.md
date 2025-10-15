<!-- Link do CSS -->
<link rel="stylesheet" href="../estilos-markdown.css">

<h1 class="bdd2"> Criação de Novas Funcionalidades </h1>

<h2 class="bdd2"> Adição de Rotas </h2>

<div class="bdd2"> Forma desorganizada </div>

Vá no arquivo [index.js] presente no repositório e coloque o seguinte texto:

```(JavaScript)
app.post('/tarefas', (req, res) => {
  res.send('Criando uma tarefa');
})

app.delete('/tarefas/:id', (req, res) => {
  res.send('Criando a tarefa' + req.params.id);
})

app.patch('/tarefas/:id', (req, res) => {
  res.send('Atualizando uma tarefa' + req.params.id);
})
```

Em seguida, vá no Insomnia, coloque o IP [localhost:3000/tarefas] e [localhost:3000/tarefas/1] para testar se o texto referente a cada uma está aparecendo.

Uma opção para evitar ficar parando o Node e começar de novo a rodas depois de fazer uma alteração, podemos rodar o comando abaixo. Ele fará com que, toda vez que uma alteração for salva, o Node seja executado de novo.

```
node --watch index.js
```

Ainda assim, para evitar ficar rodando o mesmo comando toda vez, podemos colocar o comando abaixo no [package.json] (dentro de **scripts** e depois de **test**). Dessa forma, toda vez que o programa for iniciado com **npm start** já seja dado o comando.

```
"start": "node --watch index.js"
```

Essa é a `forma errada` de fazer o código, pois está desorganizado e irá 

<div class="bdd2"> Forma Organizada </div>

O objetivo é criar uma espécie de Roteador para todas as rodas que iremos ter.

Crie uma pasta chamada **routes** e dentro dela um arquivo **tarefas-routes.js**. Pegaremos todas as funções que começam com `app` (com exceção de `listen`) e as colocaremos no arquivo `.js` criado agora.

Ainda no arquivo:
1. importe **express**
2. crie uma constante para ser o **roteador**
3. troque todas as `app.` pelo nome da constante
4. exporte o **roteador**

No arquivo **index.js**:
1. importe o **roteador** do arquivo de rotas
2. faça com que a função `app.` use a constante importada

Uma parte importante da aplicação é fazer com que ela aceite arquivos `.json`. Para isso, usamos o comando a seguir no **index.js**:

```
app.use(express.json());
```

E no arquivo **tarefas-routes.js** adicionamos em qualquer função: 
```
+ JSON.stringify(req.body)
```

Para testar, vamos no Insomnia e, usando o método `post` no IP [localhost:3000/tarefas], em `body`, o seguinte código:

```
{
    "mensagem": "teste"
}
```

<h2 class=bdd2> Sequelize </h2>

No terminal, vamos fazer a instalação do `Sequelize` (17 packages):

```
npm i sequelize
```
A biblioteca que vamos usar é a `Dotenv` (18 packages). Para instalar:

```
npm i dotenv
```

Como vamos usar o Postgres, precisamos baixar seu drive:
```
npm install --save pg
```

<div class="bdd2"> Conexão </div>

Vamos criar uma nova pasta, chamada **databases**. Dentro dela, um arquivo **sequelize.js**.

Dentro do arquivo `.js`:
```
import sequelize from 'sequelize';
import dotenv from 'dotenv';

dotenv.config();

const sequelize = new Sequelize('database', 'username', 'password', {
    host: 'localhost',
    dialect: 'postgres'
});
```

Na raiz do projeto, crie um arquivo `.env`. Este é um arquivo de configuração e não deve ser upado no GitHub. Dentro dele, colocaremos informações sobre o **postgres**:
```
PG_HOST=localhost
PG_DATABASE=aula
PG_USERNAME=postgres
PG_PASSWORD=postgres
```

Após isso, trocamos as informações da constante `sequelize` do arquivo **sequelize.js** pelas informações do arquivo **.env**:
```
const sequelize = new Sequelize('process.env.PG_DATABASE', 'process.env.PG_USERNAME', 'process.env.PG_PASSWORD', {
    host: 'process.env.PG_HOST',
    dialect: 'postgres'
});
```

E, ao final desse mesmo arquivo, exportamos a constante:
```
export default sequelize;
```