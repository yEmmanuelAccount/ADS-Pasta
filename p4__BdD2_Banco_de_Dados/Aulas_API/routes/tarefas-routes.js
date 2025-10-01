import express from 'express';

const tarefasRouter = express.Router();

tarefasRouter.get('', (req, res) => {
    res.send('Retorna todas as tarefas');
});

tarefasRouter.get('/:id', (req, res) => {
    res.send('Retorna a tarefa' + req.params.id);
});

tarefasRouter.post('', (req, res) => {
    res.send('Criando uma tarefa\n' + JSON.stringify(req.body));
});

tarefasRouter.delete('/:id', (req, res) => {
    res.send('Deletando a tarefa ' + req.params.id);
});

tarefasRouter.patch('/:id', (req, res) => {
    res.send('Atualizando a tarefa' + req.params.id);
});

export default tarefasRouter;