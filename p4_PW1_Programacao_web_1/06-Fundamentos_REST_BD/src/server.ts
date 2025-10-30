import express from "express";
import { v4 } from "uuid";
import { routes } from "./routes/index.ts";

const server = express();
server.use(express.json());

server.use(routes);

type BookEntity = {
  id: string;
  title: string;
  author: string;
};

type UserEntity = {
  id?: string;
  name: string;
  cpf: string;
  books?: BookEntity[];
};

const users: UserEntity[] = [];
/// server chama as rotas
server.get("/users", (request, response) => {
  response.status(200).json({ users });
});

server.get("/users/:id", (request, response) => {
  const { id } = request.params;
  const user = users.find((user) => user.id === id);
  if (!user) {
    response.status(404).json({ error: "user not found" });
  }
  response.status(200).json({ user });
});

server.post("/users", (request, response) => {
  const { cpf, name } = request.body as UserEntity;
  // regras de negócio. Não posso cadastrar um usuário com o mesmo cpf
  const userExists = users.find((user) => user.cpf === cpf);
  if (userExists) {
    response.status(400).json({ error: "user already exists" });
    return;
  }
  const user = {
    id: v4(),
    name,
    cpf,
    books: [],
  };
  users.push(user);
  response.status(201).json({ user });
});

server.put("/users/:id", (request, response) => {
  const { id } = request.params;
  const { cpf, name } = request.body as UserEntity;

  const user = users.find((user) => user.id === id);
  if (!user) {
    response.status(404).json({ error: "user not found" });
    return;
  }
  user.name = name;
  user.cpf = cpf;
  response.status(200).json({ user });
});

server.delete("/users/:id", (request, response) => {
  const { id } = request.params;
  const userIndice = users.findIndex((user) => user.id === id);
  if (userIndice === -1) {
    response.status(404).json({ error: "user not found" });
    return;
  }
  users.splice(userIndice, 1);
  response.status(200).json({ message: "user deleted" });
});
// deixo o server online no ip:localhost e porta:3333
server.listen(3333, () => {
  console.log("o server esta online na porta 3333");
});