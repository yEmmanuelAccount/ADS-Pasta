<!-- Link do CSS -->
<link rel="stylesheet" href="./../estilos-markdown.css">

<h1 class="bdd2"> Adição de Serviços </h1>

<h2 class="bdd2"> GET </h2>

Na raiz do projeto, crie uma pasta chamada **controller**, e dentro dela um arquivo **tarefas-controller.js**.

Nesse o arquivo, importe o arquivo **tarefas.js**, da pasta **models**, e em seguida coloque a função equivalente para retornar todas as tarefas:

```
import Tarefa from "../models/tarefa.js"

export async function listarTarefas(req, res) {
    const tarefas = await Tarefas.findAll();
    res.json(tarefas);
}
```

Em **tarefas-controller.js**, importe a função `listarTarefas`.

```
import (listarTarefas) from '../controllers/tarefas-controller.js';
```

E troque o antigo método de **retornar todas as tarefas** pelo código abaixo:
```
tarefasRouter.get('', listarTarefas);
```

<h2 class="bdd2"> POST </h2>

Vou receber uma requisição no **body** e criar um novo objeto (tarefa). É equivalente ao **insert**.

Ainda no arquivo **tarefas-controller.js**, vamos criar o método equivalente.

```
export async function criarTarefa (req, res) {
    const tarefa = await Tarefa.create(req.body);
    res.status(201).json(tarefa);
}
```

Agora, no **tarefas-router**, temos que importar a função na parte superior do arquivo e substituir o método de criação de tarefas antigo pela chamada da nova função.

* **Importação**
```
import { listarTarefas, criarTarefa } from '../controller/tarefas-controller.js';
```

* **Substituição**
```
tarefasRouter.post('', criarTarefa);
```

Depois, no Insomnia, devemos criar uma tarefa para testar. Para isso, devemos selecionar a opção **POST**, colocar no campo **Body**, e colocar os parâmetros necessários:
```
{
    "nome": "Estudar NodeJS",
    "descricao": "Estudar express e sequelize",
    "tipo": "profissional"
}
```

Para evitar que a inserção aceite erros, devemos tratar as exceções:
```
export async function criarTarefa(req, res){
    try{
        const tarefa = await Tarefa.create(req.body);
        res.status(201).json(tarefa);
    } catch (error) {
        res.status(400).json({ error: error.message });
    }
}
```

<h2 class="bdd2"> Busca por ID </h2>

Assim como nos outros, devemos criar a função no **tarefas-controller.js**:
```
export async function buscarTarefa(req, res) {
    const tarefa = await Tarefa.findByPk(req.params.id);
    if (tarefa) {
        res.json(tarefa);
    } else {
        res.status(404).json({ error: 'Tarefa não encontrada.' });
    }
}
```

Depois, importamos a nova função no **tarefas-router.js**:
```
import { listarTarefas, criarTarefa, buscarTarefa } from '../controller/tarefas-controller.js';
```

E substituímos a função antiga pelo link com a nova:
```
tarefasRouter.get('/:id', buscarTarefa);
```

<h2 class="bdd2"> Deletar </h2>

Nova função no **tarefas-controller**:

```
export async function deletarTarefa(req, res) {
    const tarefa = await Tarefa.findByPk(req.params.id);
    if (tarefa) {
        await tarefa.destroy();
        res.json(tarefa);
    } else {
        res.status(404).json({ error: 'Tarefa não encontrada.' });
    }
}
```

Importação da função no **tarefas-router.js**:

```
import { listarTarefas, criarTarefa, buscarTarefa, deletarTarefa } from '../controller/tarefas-controller.js';
```

Substituição do método antigo no **tarefas-router.js** pela link com a nova função:

```
tarefasRouter.delete('/:id', deletarTarefa);
```

<h2 class="bdd2"> Atualizar </h2>

Para fazer a atualização, devemos chamar o `set` para buscar o objeto e `save` para salvar a mudança.

* Criação da nova função no arquivo **tarefas-controller.js**:
```
export async function deletarTarefa(req, res) {
    const tarefa = await Tarefa.findByPk(req.params.id);
    if (tarefa) {
        await tarefa.destroy();
        res.json(tarefa);
    } else {
        res.status(404).json({ error: 'Tarefa não encontrada.' });
    }
}
```

* Importação da função no arquivo **tarefas-router.js**:
```
import { listarTarefas, criarTarefa, buscarTarefa, deletarTarefa, atualizarTarefa } from '../controller/tarefas-controller.js';
```

* Substituição do método de atualização antigo pelo link para a função nova:
```
tarefasRouter.patch('/:id', atualizarTarefa);
```