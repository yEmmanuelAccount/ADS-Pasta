# Collections <E\> (Coleções)

## LIST <E\>

$\quad$ Os elementos guardados em uma fila apresentam posições definidas.

$\quad$ _Collections_ e _List_ são interfaces, e por isso não são instanciadas.

$\quad$ Podemos usar junto com _ArrayList_, _Vector_ e _LinkedList_, como exemplificado no arquivo [Main_InterfaceAtividade](../Main_InterfaceAtividade.java), inicializados com o **List**.

### ArrayList

$\quad$ Assíncrona

### Vector

$\quad$ Síncrona.

$\quad$ Foi criada antes do método _List_, por isso há várias funções duplicadas que não foram retiradas para não quebrar códigos já existentes.

### LinkedList

$\quad$ Lista duplamente encadeada, reconhecendo seu sucessor e antecessor.

$\quad$ Pensando no CRUD (creat) em uma lista de 1000 itens, para adicionar um elemento na posição 0, teria que mover elemento por elemento para a liberação de espaço para o novo elemento. Aqui, há somente a modificação nos ponteiros que identificam os _antecessores_ e _sucessores_.

$\quad$ Como desvantagem, temos a maior quantidade de informações que precisam ser guardadas, tendo que guardar mais dados e usando mais processamento, se tornando mais pesado.

### Stack

$\quad$ Temos também uma "subclasse", que herda de _Vector_. É uma pilha em seu conceito.

$\quad$ São usados os métodos _push_ (adicionar elemento -- no topo) e _pop_ (retirar um elemento -- do topo)

### List.of

$\quad$ Usada para criar uma lista que não pode ser modificada posteriormente.

```Java
List<String> lista1 = List.of("João", "Maria", "Pedro", "Maria");
List<String> lista2 = List.of("José", "Ana", "Pedro");

// verifica se há algum elemento presente nas 2 listas, retornando true ou false
System.out.println(Collections.disjoint(lista1, lista2));

// retorna a frequência que um elemento aparece na lista
System.out.println(Collections.frequency());

// 


//


// 


// ordenar
Collections.sort

// embaralhar
Collections.shuffle

// troca a ordem de forma "3D"
Collections.rotate

// inverte a ordem da lista
Collections.reverse

// preenche a lista com 1 objeto
Collections.fill

// troca todo objetoX por um objetoY - onde tiver X ele substitui por Y
Collections.reclaceAll
```

## Queue <E\>

$\quad$ Está exemplificado na pasta do [Exemplo do Banco](../exemplo_banco_brasil/model/Ficha.java)

$\quad$ Também utiliza as [LinkedLists](#linkedlist), já falada anteriormente.

## SET

### HashSet

$\quad$ Sua utilização está [nessa pasta](../exemplo_aluno_hashset/model/Aluno.java).

### TreeSet

$\quad$ Exemplo na pasta [TreeSet](./../exemplo_tree_set/model/Aluno.java).

## Map

### HashMap

$\quad$ É uma interface que permite mapear valores para evitar percorrer todo um conjunto de dados, salvando tempo e capacidade de processamento.

## Streams

* acho que isso é um novo assunto

$\quad$ Invés de dizer "como fazer", vamos dizer "o que fazer". Toda vez que fazemos essa transformação, evitamos as possibilidades de cometer erros.

### forEach

```Java
List<String> nomes1 = List.of("João", "Maria", "Pedro", "José", "Ana", "Paulo");

List<String> nomes2 = 

nomes1.stream()
    .filter(n -> n.startWith("P"))
    .forEach(n -> System.out.println(n));

for(String nome : nomes1) {
    if (nome.startWith("P")) {
        System.out.println(nome);
    }
}
```
