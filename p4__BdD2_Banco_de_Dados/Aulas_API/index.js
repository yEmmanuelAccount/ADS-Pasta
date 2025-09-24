import express from 'express';

const app = express(); // declaração de aplicação
const port = 3000; // declaração da porta

app.get('/', (req, res) => { // requisição e resposta
  res.send('Hello World!');
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}. Tudo certo`);
});
