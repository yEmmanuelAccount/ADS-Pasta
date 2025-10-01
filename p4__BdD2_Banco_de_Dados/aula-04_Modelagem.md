<!-- Link do CSS -->
<link rel="stylesheet" href="../estilos-markdown.css">

<h1 class="bdd2"> a </h2>

Primeiramente devemos inicializar os containers docker no Terminal que estão os repositórios [Aulas_API]

```
docker start postgres
docker start pgadmin4
```

Depois inicie o Node 
```
Node index.js
```

Acesse no navegador no endereço abaixo e faça login.
```
localhost:15432
```

Dentro de **Databases** crie um chamado `Aula`.

Para testar, crie um arquivo **teste.js**:
```
import sequelize from 'databases/sequelize.js';

async function testar(){
    try {
        await sequelize.authenticate();
        console.log('Conexão com o banco de dados foi bem sucedida.');
    } catch (error) {
        console.error('Não foi possível conectar ao banco de dados:', error);
    }
}

testar();
```

E no terminal, coloque:
```
node teste.jd
```

Agora pegamos o conteúdo do arquivo **teste.js** e colocamos no **sequelize.js**, para que ele verifique a conexão sempre. Pode excluir o arquivo **teste.js** depois disso.
```
testar();

async function testar() {
    try {
        await sequelize.authenticate();
        console.log('Connection has been established successfully.');
    } catch (error) {
        console.error('Unable to connect to the database:', error);
    }
}
```

<h2 class="bdd2"> Adicionando Models </h2>

Crie uma nova pasta chamada **models** na `root` do projeto e dentro um arquivo **tarefas.js**, onde iremos realmente fazer a conexão.
```
import sequelize from '../databases/sequelize.js';
import { DataTypes } from 'sequelize';

const Tarefa = sequelize.define('Tarefa', {
    Id: {
        type: DataTypes.INTEGER,
        primaryKey: true,
        autoIncrement: true
    },
    nome: {
        type: DataTypes.STRING,
        allowNull: false // não pode ser nulo
    },
    descricao: {
        type: DataTypes.STRING,
        allowNull: true // pode ser nulo
    },
    tipo: {
        type: DataTypes.ENUM('pessoal', 'profissional', 'outros'),
        allowNull: false
    }
});
```

Isso é o equivalente a criar tabelas e campos no Postgres, mas isso será feito com `JS` e interpretado automaticamente.

Depois da modelagem, vamos criar a tabela. Existem 3 formas de criar:
1. User.syne()
2. User.syne((force:true))
3. User.syne

Usaremos esse:
```
Tarefa.sync({force:true});
```

No **index.js**, adicionamos:
```
import Tarefas from './models/tarefas.js';
```

Para testar:
```
node index.js
```
ou 
```
npm start
```