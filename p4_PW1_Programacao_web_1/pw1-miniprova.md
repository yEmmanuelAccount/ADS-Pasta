Com base nos documentos fornecidos (as fontes), aqui estão as respostas para as questões da miniprova:

### **1. Explicação sobre o padrão REST e projeto de APIs**
O **REST (Representational State Transfer)** é um estilo arquitetural concebido para a criação de aplicações distribuídas. Sua importância no desenvolvimento de APIs Web reside na capacidade de permitir a comunicação entre plataformas diferentes através de padrões e protocolos comuns (como o HTTP), desacoplando o cliente do servidor.

Para que uma API REST seja bem projetada, ela deve seguir restrições fundamentais:
*   **Organização de Recursos e URLs:** Cada recurso deve possuir uma **URI individual** (ex: `/usuarios/1`).
*   **Métodos HTTP (Verbos):** Devem ser usados corretamente para operações CRUD: **GET** para leitura, **POST** para criação, **PUT** para substituição/atualização integral, **PATCH** para modificação parcial e **DELETE** para exclusão.
*   **Comunicação Stateless:** O servidor não deve armazenar o estado do cliente; cada requisição deve conter toda a informação necessária para ser processada.
*   **Status HTTP:** Devem ser usados para padronizar respostas (ex: **200 OK**, **201 Created** para POST, **404 Not Found**).
*   **Segurança:** Recomenda-se o uso de **JWT (JSON Web Tokens)** para autenticação sem estado (*stateless*).

---

### **2. Questão de Verdadeiro (V) ou Falso (F)**
*   **a) (F)** A Web 3.0 (Web Semântica) foca em tornar a informação legível por máquinas e estruturada, não necessariamente em centralização; na verdade, tecnologias como blockchain visam a descentralização.
*   **b) (F)** No modelo cliente/servidor, o **servidor** armazena e disponibiliza documentos/dados sob demanda, enquanto o **cliente** faz a requisição.
*   **c) (V)** No SSR, o conteúdo HTML é gerado no servidor antes de ser enviado.
*   **d) (F)** No CSR, a aplicação roda na **máquina do usuário** (cliente).
*   **e) (V)** O **Model** cuida da lógica e dados, a **View** da exibição e o **Controller** interpreta as entradas.
*   **f) (F)** Embora as camadas diminuam a dependência, mudanças em uma (como no Domínio) podem impactar outras (Apresentação), pois os dados percorrem as camadas.
*   **g) (F)** O trecho `?turno=manha` é um **Query Param** (usado para filtragem), não um fragmento (que usaria `#`).
*   **h) (V)** O GET é **idempotente** e seguro, pois não causa efeitos colaterais no servidor.
*   **i) (F)** O POST **não é idempotente**; chamadas repetidas podem criar múltiplos recursos.
*   **j) (V)** Middlewares podem ser aplicados a rotas específicas para processar aspectos como autenticação ou validação antes de chegar à lógica final.
*   **k) (F)** O parâmetro `:id` em uma rota é um **Route Param**, acessado via `req.params.id`, não `req.query`.
*   **l) (F)** Elas tratam a mesma URI, mas métodos diferentes (GET busca, POST cria), logo não são equivalentes.
*   **m) (V)** Middlewares de autenticação frequentemente adicionam o `user_id` ao objeto `request` para uso posterior pelas rotas.

---

### **3. Questões sobre Banco de Dados e Docker**
*   **d) (F)** Drivers nativos geralmente oferecem **melhor performance** por não terem a camada de abstração (mapeamento) dos ORMs, embora sejam mais complexos de codificar.
*   **e) (F)** O **Docker Compose** serve para executar múltiplos contêineres simultaneamente, não apenas criar imagens.
*   **f) (V)** O arquivo `docker-compose.yml` orquestra múltiplos serviços como banco de dados e aplicação.
*   **g) (F)** Contêineres **compartilham o kernel** do sistema operacional host, ao contrário das VMs que possuem kernels independentes.
*   **h) (F)** O Docker padroniza o ambiente, mas ainda requer o uso de **variáveis de ambiente** (`.env`) e configurações específicas para conectar os serviços.

---

### **4. Questões sobre MVC e Middlewares**
*   **a) (F)** Um middleware de erro deve possuir **quatro parâmetros**: `(error, req, res, next)`.
*   **b) (F)** O middleware de erro deve ser registrado **após as rotas** para capturar exceções lançadas durante o ciclo de requisição.
*   **c) (F)** O middleware de autenticação verifica a **identidade** do usuário.
*   **d) (V)** Ele garante que apenas usuários autenticados acessem rotas protegidas.
*   **e) (F)** O JWT é **assinado digitalmente**, mas o payload é apenas codificado (Base64), podendo ser lido no cliente; por isso, não se deve salvar dados sensíveis nele.
*   **f) (F)** É composto por: **Header, Payload** e **Signature**.
*   **g) (F)** O uso de **Cookies httpOnly** é considerado mais seguro contra ataques XSS do que o localStorage.
*   **h) (V)** É o padrão comum: `Authorization: Bearer <token>`.
*   **i) (V)** Centralizar erros em um middleware padroniza as mensagens enviadas ao cliente.
*   **j) (V)** O middleware deve bloquear o acesso se o token for inválido, retornando um erro de autenticação (ex: 401 Unauthorized).

---

### **5. Análise de código Zod**
*   **a) (V)** O `safeParse` retorna um objeto de resultado em vez de lançar um erro que trava a aplicação.
*   **b) (F)** O campo `age` está marcado como `.optional()`, portanto a validação não falha se ele estiver ausente.
*   **c) (V)** O esquema define `min(3)`, e o `if (!result.success)` retorna status 400.
*   **d) (F)** Middlewares de validação devem ser registrados **antes** da função da rota para garantir que os dados estejam limpos antes do processamento.
*   **e) (V)** O método `.email()` valida o formato da string.
*   **f) (V)** O código atribui `req.body = result.data`, limpando campos extras não definidos no esquema.
*   **g) (F)** O método `parse()` lança exceções, exigindo um `try/catch` para não derrubar o servidor.
*   **h) (V)** A validação no backend impede que lixo chegue ao banco de dados ou lógica de negócio.

---

### **6. Erros no padrão REST no código Express**
1.  **Rota de exclusão:** `app.get('/users/delete/:id', ...)`
    *   **Erro:** Usa o verbo GET para deletar e inclui uma ação ("delete") na URL.
    *   **Correção:** Usar `app.delete('/users/:id', ...)`.
2.  **Status Code na Criação:** No `app.post('/users', ...)`, o retorno é apenas o objeto.
    *   **Erro:** Não informa o status de sucesso na criação.
    *   **Correção:** Usar `res.status(201).json(newUser)`.
3.  **Lógica do PUT:** O código faz um `push` se o usuário não for encontrado.
    *   **Erro:** PUT deve atualizar um recurso existente; se o objetivo for criar, deve haver clareza. Além disso, REST recomenda retornar o recurso atualizado ou status 204.
4.  **Resposta de "Não encontrado":** No `app.get('/users', ...)`.
    *   **Erro:** Retornar uma mensagem de texto com sucesso (padrão 200) para uma lista vazia pode ser confuso.
    *   **Correção:** Retornar um array vazio `[]` com status 200, ou se um ID específico não existir em rotas de detalhe, usar **404 Not Found**.