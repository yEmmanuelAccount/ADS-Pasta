import express from 'express';
const app = express();
const port = 3000;

app.get('/tarefas', (req, res) => {
  res.send('Retorna todas as tarefas');
});

app.get('/tarefas/:id', (req, res) => {
  res.send('Retorna todas as tarefas ' + req.params.id);
});

app.post('/tarefas', (req, res) => {
  res.send('Criando uma tarefa');
});

app.delete('/tarefas/:id', (req, res) => {
  res.send('Deletando a tarefa ' + req.params.id);
});

app.patch('/tarefas/:id', (req, res) => {
  res.send('Atualizando a tarefa' + req.params.id);
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}. Tudo certo!`);
});