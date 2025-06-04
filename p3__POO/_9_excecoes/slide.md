# Exceções

## Introdução

$\quad$ Indicam que houve algum erro durante a execução do código.

$\quad$ É chamada assim porque foge da regra.

$\quad$ Elas são possíveis de ser tratadas e esse é nosso objetivo, para que o sistema nunca pare a execução devido a uma exceção.

## Rastreamento de Pilhas

$\quad$ No Java, na chamada de métodos, eles são colocados em uma pilha (**push**) e quando executados são retirados (**pop**).

$\quad$ Exemplificando:
```(Java)
public class App {
    public static void main(String[] args) {
        metodo();
    }

    private static void metodo () {
        metodo1();
    }

    private static void metodo1 () {
        System.out.println(10/0);
    }
}
```

## Tratamento de Exceções

$\quad$ Quando uma exceção acontece dizemos que ela foi _lançada_ e podemos usar o código para _capturá-la_ para tratamento.

$\quad$ Utilizamos 3 blocos para tratar as exceções:
* **try** - bloco que contém o código que lança a exceção.
* **catch** - bloco que captura a exceção.
* **finally** - bloco que sempre será executado.

$\quad$ Nem sempre haverá os 3 blocos para tratar a execução. Podemos ter as seguintes opções, já que não é possível inverter a ordem deles:
* (1) try - catch - finally
* (2) try - catch
* (3) try - finally

### Try

$\quad$ No **try**, é importante ter cuidado com o que é colocado no bloco, já que quando a exceção é lançada, a execução desse bloco é finalizada.

$\quad$ O uso do _try-catch-finally_ evita o uso de _IFs_.

### Catch

$\quad$ É interessante ter blocos _catch_ para cada tipo de exceção a ser tratada, de forma que comece primeiro das mais específicas e depois tenha as mais genéricas.

$\quad$ Utilizando _multicatch_ é possível tratar mais de um tipo de exceção em um mesmo bloco.

### Finally

$\quad$ O bloco _finally_ contém o código que será executado independentemente se houver ou não exceção.

$\quad$ Geralmente usado para guardar ações essenciais, como: fechar arquivo, encerrar uma conexão, etc.

### Estrutura

```(Java)
try {
    // código que lança exceções
} catch (NullPointerException ex) {
    // Esse trecho será executado se uma exceção do tipo especificado for lançada no bloco TRY
} finally {
    // Esse bloco sempre será executado
}
```

$\quad$ Aqui podemos ver um exemplo mais [concreto inicial](/ExemploInicial.java).

## Tipos de Exceção

$\quad$ 