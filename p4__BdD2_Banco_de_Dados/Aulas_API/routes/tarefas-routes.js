import express from 'express';

const tarefasRouter = express.Router();

tarefasRouter.get('/tarefas', (req, res) => {
    res.send('Retorna todas as tarefas');
});

tarefasRouter.get('/tarefas/:id', (req, res) => { // pode ocultar "/tarefas" ou não em todas as funções abaixo
    res.send('Retorna todas as tarefas ' + req.params.id);
});

tarefasRouter.post('/tarefas', (req, res) => {
    res.send('Criando uma tarefa\n' + JSON.stringify(req.body));
});

tarefasRouter.delete('/tarefas/:id', (req, res) => {
    res.send('Deletando a tarefa ' + req.params.id);
});

tarefasRouter.patch('/tarefas/:id', (req, res) => {
    res.send('Atualizando a tarefa' + req.params.id);
});

export default tarefasRouter;