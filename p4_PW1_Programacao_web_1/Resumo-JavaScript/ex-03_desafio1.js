import { criarUsuario, exibirUsuario } from './ex-03_desafio1.js';

const usuarios = {
    criarUsuario("Alice", 25, "alice@gmail.com"),
    criarUsuario("Bob", 30, "bob@gmail.com"),
};

usuarios.forEach(user => exibirUsuario(user));