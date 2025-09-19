# Revisão Prova 01

## Introduão ao Java

$\quad$ Não precisa se importar muito com ele, pois não vai cair a parte histórica.

## Classe e Objeto

### Primitivo x Referência

$\quad$ **Primitivo** são tipos primitivos que guardam valores, nativos da linguagem, como: int, float, boolean, char, longe, short, etc.

$\quad$ **Referência** são tipos que podemos criar (objetos) com base em outros usando LocalDate, etc. Exemplo: escola, aluno, professor, etc.

### Classe

$\quad$ É composta por:

* atributos: propriedades - TER/TEM
* construtor: toda classe tem, nem que seja vazio (padrão). Se você criar um construtor específico, o padrão para de funcionar. É possível ter mais de um construtor na mesma classe, com parâmetros e comportamentos diferentes (sobrecarga de operador)
* métodos: servições, funções - FAZ

### Os 4 pilares da Orientação a Objetos

$\quad$ São eles: abstração, encapsulamento, herança e polimorfismo.

$\quad$ **Abstração** é a parte mais simples de se entender. Pegamos nossa realidade e abstraímos em forma de objetos, no mini-mundo, com os elementos/atributos importante para sua construção.

$\quad$ **Encapsulamento** é o ato de isolar. Quanto menos uma classe conhece a outra, melhor é. Se uma classe saber da outra, o que for alterado em uma pode interferir na outra. Existem 4 formas de fazer isso: public, protected, package (default), private.

$\qquad$ Ao definir um atributo como _público_, qualquer classe pode alterar o valor diretamente, sem fatores de validação, e todos tem conhecimento dele.

$\qquad$ Usando _private_, você protege o atributo e só é possível alterar usando _getters_ e _setters_. Externamente, é como se as outras classes não soubessem da existência deles.

$\qquad$ _Package_ é o padrão para quando não é definido um tipo de encapsulamento. Classes que estão no mesmo pacote (pasta) têm acesso direto ao atributo em questão.

$\qquad$ _Protected_ apesar do nome, é quase um _public_. Ao dizer que um atributo é protegido, criando uma classe dentro do mesmo pacote, ainda é possível ter acesso direto ao atributo (por estar no mesmo pacote). Uma classe de outro pacote, herdando de outra, continua sendo possível a alteração direta. Permite a visibilidade além do pacote e de subclasses.

$\qquad$ A ordem de restrições ficaria private, protected, package, public.

$\quad$ **Herança** é a criação de uma classe a partir de uma já existente, pegando tudo que a outra classe tem (todos os atributos, métodos e construtor). É dito como um relacionamento muito forte, pois a partir dele uma classe sabe tudo da outra, o que bate de frente com o conceito de "quando menos souber malhor", por isso temos que ter muito cuidado. Para fazer isso, usamos _extends_ na classe B em relação a classe A.

* Extensão: classe B herda tudo da classe A
* Generalização: a classe A é uma forma mais geral da classe B
* Especialização: a classe B é uma especialização da classe A

$\quad$ **Polimorfismo** é a sobrescrição de serviços. Já como uma coisa por ser feita de maneira diferente em diferentes classes, usamos polimorfismo (_Override_).

## Interface

$\quad$ É onde estão um conjunto de serviços, mas todos são abstratos, ou seja, não está definido a forma **como** é feito. Essa parte específica fica com a classe responsável por implementar esse serviço.

```(Java)
public interface Autenticavel {
    boolean autenticar (String login, String senha);
    int teste = 10;
}
```

$\quad$ Só é possível adicionar constantes e métodos abstratos (sem corpo).

$\quad$ É visto como um contrato. Se eu tenho a interface I, tenho que fazer tudo que tem nela.

```(Java)
public interface Autenticavel {
    final boolean autenticar (String login, String senha);
    final int teste = 10;
}
```

$\quad$ Não é possível adicionar **final** ou **private** dentro de uma interface. Isso acontece pois tudo é estático, público e final por padrão.

$\quad$ É mais interessante e preferível usar interface do que herança. Isso porque a segunda acaba quebrando o encapsulamento e como queremos o maior acoplamento possível, usamos _interface_., para que seja possível modificações em uma classe sem interferência em outra.

## Coleções

$\quad$ Podemos usar códigos prontos nos nossos projetos usando _Coleções_. Isso faz com que ganhemos tempo e diminui a possibilidade de erros.

$\quad$ Todo _framework collection_ é genérico.

$\qquad$ A primeira interface é a **Collection\<E>**. Com ela é possível usar métodos prontos como: add, remove, clear

$\qquad$ Após ela há várias sub-interfaces como:

$\qquad$ **Set\<E>**: permite a criação de elementos de um conjunto, mas sem repetição de elementos. É verificado se o elemento está presente ou não no conjunto.

* HashSet: organiza os elementos com base na tabela Hash
* TreeSet: organiza os elementos tem uma árvore, usando como base em um comparador

$\qquad$ **List\<E>**: é uma sequência com posição (índice) e pode ter repetição. É possível recuperá-los pela ordem de inserção.

* ArrayList:
* Stack (pilha)
* LinkedList (lista linkada):

$\qquad$ **Queue\<E>**: É uma fila, então o primeiro elemento a entrar é o primeiro a sair (FiFo - first in, first of).

* Deque: com prioridade
* .

## Exceções

$\quad$ São "erros" esperados.

$\quad$ Erros mesmo são catastróficos (vermelhos) e exceções são esperados, tratados (cinzas) e verificados para caso seja algo impossível de ser resolvido, não aconteça (verdes).

```(Java)
public static void main(String[] args) {
    metodo();

    // opção dois
    try {
        metodo();
    } catch (IOException ex) {
        System.out.println(ex.getMensage());
    }
}

private static void metodo() {
    throw new IOException("Exceção");
}

// opção um
private static void metodo() {
    try {
        throw new IOException("Exceção");
    } catch (IOExpected ex) {
        ...
    }
}

// opção dois
private static void metodo() th {
    throw new IOException("Exceção");
}
```

$\quad$ É possível criar suas próprias exceções.

```(Java)
public class TesteException extends RuntimeException {
    ...
}
```

## Labda e Streams

$\quad$ Mais para projeto, mas se quiser usar na prova pode.