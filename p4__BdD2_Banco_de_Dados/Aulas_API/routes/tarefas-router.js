import express from 'express';
import { listarTarefas, criarTarefa, buscarTarefa, deletarTarefa, atualizarTarefa } from '../controller/tarefas-controller.js';
const tarefasRouter = express.Router();

tarefasRouter.get('', listarTarefas);

tarefasRouter.get('/:id', buscarTarefa);

tarefasRouter.post('', criarTarefa);

tarefasRouter.delete('/:id', deletarTarefa);

tarefasRouter.patch('/:id', atualizarTarefa);

export default tarefasRouter;