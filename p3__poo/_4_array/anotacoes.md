# Array

## Aula 28/04/2025

    1. Definição

Assim como C, tem tamanho fixo de espaços e pode guardar diferentes valores.

```(java)
public class Main_InterfaceAtividade {
    public static void main(String[] args) {
        int array[] = {10, 8, 7, 3, 6, 4};

        System.out.println(array[2]); // imprime o valor que está na posição 2
    }
}
```

Podemos também inicializar um _array_ vazio, mas ele ainda terá tamanho previamente definido.

```(java)
int array[] = new int[5];
```

Se você tentar acessar uma posição fora do intervalo de **numPosicoes - 1**, retornará um erro.

Para imprimir um array, podemos usar o bom e velho _for_.

```(java)
public class Main_InterfaceAtividade {
    public static void main(String[] args) {
        int array[] = {10, 8, 7, 3, 6, 4};

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            array[i]++;
        }
    }
}
```

Outra forma de usar _for_, é:

```(java)
for(int i: array) {
    System.out.println(i);
    i++;
}
```

O _array_ pode guardar referência de outros _arrays_. Podemos ver isso no seguinte exemplo: [turma](exemplo2/exemplo01.view/Main_InterfaceAtividade.java).

Uma das primeiras coisas que são pensadas, principalmente para aqueles que já paragam as cadeiras de Algoritmo e Estrutura, são Matrizes. Aqui em Java nós não temos Matrizes, mas temos _arrays_ de _arrays_.

Na prática, temos um _array_ com _x_ posições e cada um deles guarda outro _array_ de _y_ colunas.

Como não é uma Matriz propriamente dita, não há formalidades para sua criação, assim como acontece em C. Podemos, por exemplo, tem uma "Matriz" com 3 linhas e cada linha com um número de colunas específico.

```(java)
public class Main_InterfaceAtividade {
    public static void main(String[] args) {
        // forma 1
        int arrayForma1[][] = new int[3][];
        array[0] = new int[5];
        array[1] = new int[6];
        array[2] = new int[3];

        // forma 2
        int arrayForma2[][] = new int[3][4];

        // forma 3
        int arrayForma3{{3,4,5}, {4,5,7,8}, {4,1,0,7}}
    }
}
```

E imprimimos assim:

```(java)
for(int i=0; i<array.length; i++){

 

            for(int j=0; j<array[i].length;j++){
 

                System.out.print(array[i][j]+" ");
 

            }
 

            System.out.println();
```
