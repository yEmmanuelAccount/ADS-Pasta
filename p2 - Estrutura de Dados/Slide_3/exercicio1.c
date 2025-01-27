#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_FUNCIONARIOS 15

// Definindo FUNCIONÁRIO
typedef struct {
    int id;
    char nome[50];
    float salario;
} Funcionario;

// Definindo o vetor
typedef struct {
    Funcionario funcionarios[MAX_FUNCIONARIOS];
    int contador;
} VetorFuncionarios;

// Criar vetor
VetorFuncionarios cria_vetor() {
    VetorFuncionarios vetor;
    vetor.contador = 0;
    return vetor;
}

// Adicionar funcionário
void adicionaFuncionario(VetorFuncionarios *vetor, int id, const char *nome, float salario) {
    if (vetor->contador < MAX_FUNCIONARIOS) {
        Funcionario f;
        f.id = id;
        strncpy(f.nome, nome, sizeof(f.nome) - 1);
        f.nome[sizeof(f.nome) - 1] = '\0';
        f.salario = salario;

        vetor->funcionarios[vetor->contador++] = f;
    } else {
        printf("Número máximo de funcionários alcançado [%d].\n", MAX_FUNCIONARIOS);
    }
}

// Remover funcionário pelo ID
void removeFuncionario(VetorFuncionarios *vetor, int id) {
    int encontrado = 0;
    for (int i = 0; i < vetor->contador; i++) {
        if (vetor->funcionarios[i].id == id) {
            encontrado = 1;
            for (int j = i; j < vetor->contador - 1; j++) {
                vetor->funcionarios[j] = vetor->funcionarios[j + 1];
            }
            vetor->contador--;
            break;
        }
    }
    if (!encontrado) {
        printf("Funcionário com ID %d não encontrado.\n", id);
    }
}

// Imprimir funcionários
void imprimeFuncionarios(const VetorFuncionarios *vetor) {
    for (int i = 0; i < vetor->contador; i++) {
        printf("ID: %d\n  Nome: %s\n  Salário: R$ %.2f\n\n", vetor->funcionarios[i].id, vetor->funcionarios[i].nome, vetor->funcionarios[i].salario);
    }
}

// Função principal
int main() {
    // Criar vetor
    VetorFuncionarios vetor = cria_vetor();

    // Adicionar funcionários
    adicionaFuncionario(&vetor, 1, "Roberto", 1500);
    adicionaFuncionario(&vetor, 2, "Camila", 10000);
    adicionaFuncionario(&vetor, 3, "Jobson", 1500);

    // Imprimir lista de funcionários
    printf("Lista de Funcionários:\n\n");
    imprimeFuncionarios(&vetor);

    // Remover um funcionário
    removeFuncionario(&vetor, 2);

    // Imprimir lista de funcionários atualizada
    printf("Lista de Funcionários Atualizada:\n\n");
    imprime_funcionarios(&vetor);

    return 0;
}
