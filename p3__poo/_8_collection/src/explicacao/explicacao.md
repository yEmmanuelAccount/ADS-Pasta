# Collections <E\> (Coleções)

## LIST <E\>

$\quad$ Os elementos guardados em uma fila apresentam posições definidas.

$\quad$ _Collections_ e _List_ são interfaces, e por isso não são instanciadas.

$\quad$ Podemos usar junto com _ArrayList_, _Vector_ e _LinkedList_, como exemplificado no arquivo [Main](../Main.java), inicializados com o **List**.

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

## Queue <E\>

$\quad$ Está exemplificado na pasta do [Exemplo do Banco](../exemplo_banco_brasil/model/Ficha.java)

$\quad$ Também utiliza as [LinkedLists](#linkedlist), já falada anteriormente.

## SET

### HashSet

