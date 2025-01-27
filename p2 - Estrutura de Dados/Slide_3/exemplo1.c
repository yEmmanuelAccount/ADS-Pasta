// criando um STRUCT
struct ficha_de_aluno {
    char nome[50];
    char disciplina[50];
    float nota1;
    float nota2;
    float nota3;
    float media;
};

// STRUCT dentro de STRUCT 
struct ficha_de_aluno turma[30];
    /* dessa forma, cada turma[x] terá suas fichas de aluno */

// Operações
    // atribuição
        /* EXEMPLOS GENÉRICOS
            (1) sem vetor ---> registro.campo = valorAtribuido; 
            (2) com vetor ---> registro[índice].campo = valor;
        */

       /* EXEMPLO PRÁTICO
            (1)
            aluno.nome = "Carlos";
            aluno.idade = 28;

            (2)
            turma[1].nome = "José";
            turma[1].nota2 = 10;
       */
    
    // acesso
        /* EXEMPLOS GENÉRICOS
            (1) sem vetor ---> [tipo da variável] [nome da variável] = registro.campo;
            (2) com vetor ---> [tipo da variável] [nome da variável] = registro[índice].campo;
        */

       /* EXEMPLOS PRÁTICOS
            (1) float nota1 = aluno.nota1;
            (2) float nota1 = turma[3].nota1;
       */