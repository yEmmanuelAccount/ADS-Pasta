export function criarUsuario(nome, idade, email) {
    return {
        nome: nome,
        idade: idade,
        email: email,
    }
}

export function exibirUsuario(usuario) {
    console.log(`Nome: ${usuario.nome} - Idade: ${usuario.idade} - Email: ${usuario.email}`);
}