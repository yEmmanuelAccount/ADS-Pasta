## Variáveis Globais (constantes)

Usadas para valores que não podem ser alterados durante o código.

É usada a palavra reservada **final** antes do seu tipo específico.

Obrigatoriamente tem que ser inicializada no _Construtor_. Se houver mais de um _Construtor_, ela terá que ser inicializada em todos eles.

Exemplo:

```(java)
private final int numeroConta;
```

## Atributo Static

Podemos adicionar atributos à classe ou objetos. Colocando referente a classe, cada objeto pode interagir com o valor da classe.

Exemplo

```(java)
// classe 
public class ContaCorrente {
    // definindo atributos
    private static int contContas;

    // administração da classe
    public static int getContContas() {
        return contContas;
    }
}

// Main_InterfaceAtividade
public static void main(String[] args) {
    ContaCorrente conta1 = new ContaCorrente("João");
    ContaCorrente conta2 = new ContaCorrente("Maria");
    ContaCorrente conta3 = new ContaCorrente("Pedro");

    System.out.println(ContaCorrente.getContContas()); // retornará 3 pois existem 3 contas
}
```
