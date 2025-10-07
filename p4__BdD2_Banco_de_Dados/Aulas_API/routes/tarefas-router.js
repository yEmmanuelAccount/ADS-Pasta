import express from 'express';
import { listarTarefas, criarTarefa, buscarTarefa, deletarTarefa } from '../controller/tarefas-controller.js';
const tarefasRouter = express.Router();

tarefasRouter.get('', listarTarefas);

tarefasRouter.get('/:id', buscarTarefa);

tarefasRouter.post('', criarTarefa);

tarefasRouter.delete('/:id', deletarTarefa);

tarefasRouter.patch('/:id', (req, res) => {
    res.send('Atualizando a tarefa' + req.params.id);
});

export default tarefasRouter;