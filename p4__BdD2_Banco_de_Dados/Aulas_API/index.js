import express from 'express';
const app = express();
const port = 3000;

import Tarefa from './models/tarefa.js';

import tarefasRouter from './routes/tarefas-routes.js';

app.use(express.json());

app.use('/tarefa', tarefasRouter);

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});