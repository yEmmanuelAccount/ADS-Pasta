// páginas 6 à 11
/*
    pág 6 = cria um elemento, dividido em 2 campos: 1) informação e 2) campo apontando para a próxima estutura original.
    pág 10 = alocação de memória para armazenar elemento; encadeia o elemento na lista já existente.
    pág 11 = cria uma lista vazia e insere novos elementos.
    pág 12 = imprimir valores da lista.
    pág 13 = verifica se a lista está vazia
    pág 14 = busca elementos da lista
    pág 15 = destrói a lista
*/

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

// definindo estrutura
struct elemento {
    int informacao;
    struct elemento* prox;
};
typedef struct elemento Elemento;

// função para CRIAR LISTA VAZIA
Elemento* criarLista() {
    return NULL;
}

// função para ADICIONAR ELEMENTOS à uma lista já existente
Elemento* inserirElemento (Elemento* lista, int valor){
    Elemento* novo = (Elemento*) malloc(sizeof(Elemento)); // cria um vetor apontando para um elemeto/"caixa"
    novo->informacao = valor;
    novo->prox = lista;

    return novo;
}

// função para IMPRIMIR LISTA
Elemento* imprimirLista (Elemento* lista) {
    Elemento* p;

    if(p == NULL){
        printf("ERRO: lista vazia.\n");
    }

    for(p = lista; p != NULL; p = p->prox){
        printf(" >Informacao: %d. \n", p->informacao);
    }
}

// função para VERIFICAR SE A LISTA ESTÁ VAZIA
int listaVazia (Elemento* lista){
    return (lista == NULL); // se for verdadeiro = 1; se falso = 0
}

// função para BUSCAR ELEMENTO
int buscarElemento (Elemento* lista, int valor){
    Elemento* p;

    for(p = lista; p != NULL; p = p->prox){
        if(p->informacao == valor){
            return p->informacao; // retorna o resultado SE ENCONTRAR
        }
    }
    return NULL; // retorna vazio SE NÃO ENCONTRAR
}

// função para DESTRUIR LISTA
void destruirLista (Elemento* lista){
    Elemento* p;
    
    while(p != NULL){
        Elemento* t = p->prox; // guarda caminho para o próximo elemento
        free(p); // libera o elemento
        p = t; // vai para o próximo elemento
    }
}

void main() {
    // criando elementos
    Elemento* lista; // vetor principal = lista | inicia a lista
    lista = criarLista(); // cria a lista como vazia 

    // adicionando elementos à lista
    lista = inserirElemento(lista, 23);
    lista = inserirElemento(lista, 45);

    // imprimindo elementos da lista
    printf("Elementos da lista: ");
    imprimirLista(lista);

    // verificando se a lista está vazia
    int vazio = listaVazia(lista);
    if(vazio == 1){
        printf("A lista esta vazia.\n\n");
    }
    else {
        printf("A lista nao esta vazia.\n\n");
    }

    // busca um elemento na lista
    int buscar = 23;
    Elemento* resultado = buscarElemento(lista, buscar);
    if(resultado != NULL){
        printf("Elemento buscado: \n %d\n", resultado->informacao);
    }
    else {
        printf("Elemento não encontrado. Tente novamente.\n");
    }

    // excluir a lista
    destruirLista(lista);
    printf("Lista excluida");
}