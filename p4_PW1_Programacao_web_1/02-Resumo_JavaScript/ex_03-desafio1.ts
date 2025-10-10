export function criarUsuario(nome:string, idade:number, email:string) {
    return {
        nome: nome,
        idade: idade,
        email: email,
    };
}

type UserType = {
    nome: string;
    idade: number;
    email: string;
};

export function exibirUsuario(usuario:UserType) {
    console.log(`Nome: ${usuario.nome} | Idade: ${usuario.idade} anos | Email: ${usuario.email}`);
}