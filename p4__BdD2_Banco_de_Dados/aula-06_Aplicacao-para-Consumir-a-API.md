<!-- Link do CSS -->
<link rel="stylesheet" href="./../estilos-markdown.css">

<h1 class="bdd2">  Aplicação </h1>

<h2 class="bdd2"> O que fizemos até a aula 5? </h2>

Até a [aula-05](aula-05_Adicao-de-Servicos.md) dessa cadeira, desenvolvemos uma API de exemplo, que servirá como backend da aplicação.

<h2 class="bdd2"> Cors </h2>

Para que nossa API possa ser consumida pela **Aplicação**, temos que baixar o `cors`.

No terminal, digite:
```
npm install cors
```

E no **index.js**, devemos importá-lo:
```
import cors from 'cors'
```

Além disso, temos que trocar o modo de uso, mudando `app.use(express.json());` para: 
```
app.user(cors());
```

<h2 class="bdd2"> HTML </h2>

Na raiz do projeto, crie um arquivo HTML para que seja possível consumir a API.

Nesse aquivo, criamos um simples **form**:
```(html)
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <div id="form">
        <input type="text" id="inputNome" placeholder="Nome">
        <input type="text" id="inputDescricao" placeholder="Descrição">
        <select id="selectCategoria">
            <option value="pessoal">Pessoal</option>
            <option value="profissional">Profissional</option>
            <option value="outros">Outros</option>
        </select>
        <button id="salvarButton">Salvar</button>
    </div>
</body>

<script src="JavaScript.js"></script>

</html>
```

O objetivo aqui é, ao clicar no botão de `salvar`, as informações do **forms** sejam coletadas e organizadas em um **JSON**. Após isso, usando o método **FETCH**, ela será adicionada ao Banco de Dados.

Usando um arquivo **JS** para coletar as informações do **forms** e exibir um **JSON** com elas no console:
```
document.getElementById('salvarButton')
    .addEventListener('click', async () => {
        const tarefa = {
            nome: document.getElementById('inputNome').value,
            descricao: document.getElementById('inputDescricao').value,
            categoria: document.getElementById('selectCategoria').value
        }
        console.log(tarefa);
});
```

O **console.log** está aí para vermos se está funcionando, mas antes dele, temos que colocar o método **FETCH**:
```
        fetch('http://localhost:3000/tarefas', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(tarefa)
        }).then(res => {
            console.log(res);
            alert('Tarefa salva com sucesso!');
        }).catch(err => {
            console.log(err);
            alert('Falha ao salvar');
        });
```