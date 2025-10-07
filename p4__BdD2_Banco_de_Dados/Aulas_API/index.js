import express from 'express';
const app = express();
const port = 3000;

import tarefasRouter from './routes/tarefas-router.js';

app.use(express.json());

app.use('/tarefas', tarefasRouter);

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});