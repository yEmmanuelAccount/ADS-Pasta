# 07.04.2025 - segunda-feita - 2ª aula

## Baixar Java

Entrar no site da [Oracle](https://www.oracle.com/br/java/technologies/downloads/#java21) e escolher a versão JDK 21 para o sistema operacional desejado e baixar uma das 2 últimas opções.

## Primeiro código

Fazendo um "Hello World" nesse [arquivo](HelloWorld.java).

Para compilar:
``` javac HelloWorld.java ```

Para executar:
``` java HelloWorld.java ```

Para funcionar, ele deve criar automaticamente um arquivo [.class](HelloWorld.class).

## Funções - Classes - Comandos

A documentação da linguagem está no mesmo site que se baixa a versão.

O caminho para chegar no arquivo da documentação é:
[página de download de versão](https://www.oracle.com/br/java/technologies/downloads/#java21) -> [Online Documentation](https://docs.oracle.com/en/java/javase/21/) -> [API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/index.html).

Ou, simplesmente [aqui](https://docs.oracle.com/en/java/javase/21/docs/api/index.html).

## Programa simples de soma

Para fazer uma soma, precisamos criar um novo arquivo para a função e dentro dela receber valores, o que implica que precisamos de um **scanner**.

A primeira coisa a fazer, depois de criar o arquivo, é importar a biblioteca _scanner_.
Depois é necessário criar a **Classe** (sempre com letra inicial maiúscula) pública e dentro dela desenvolver o código.
As **variáveis** devem ser criadas com letras minúsculas.

Podemos copiar o mesmo arquivo para [Soma](Soma.java) e trocar apenas pontos chave, por exemplo:
* nome da função de _Soma_ para _Divisao_.
* declaração de variáveis de _int_ para _float_.
* uma variável tipo _double_ para guardar um possível resultado grande da divisão.
* uso de _print_ final para _printf_ para que seja possível aceitar formatação.

Aqui está o [arquivo](Soma.java) referente ao passo a passo.

## Diferentes _prints_

1. println -> imprime com uma quebra de linha depois do que está escrito.
2. print -> imprime do jeito que está dentro das aspas.
3. printf -> imprime o texto aceitando formatação.

# 09.04.2025 - quarta-feira

## Formas de comentar no código
| Número | O que comenta | Símbolos | Como ler | Onde colocar |
| ------ | ------------ | -------- | -------- | ------------ |
| 1 | Uma linha | // | barra-barra | no início da linha |
| 2 | Várias linhas | /* */ | barra-asterisco | no início e no final do que quer comentar |
| 3 | Várias linhas. Possibilita fazer a documentação do arquivo. | /** * */ | barra-asterisco-asterisco | no início e no final do que quer comentar |

### Exemplos Documentação

```(java)
// comentário comum
```

```(java)
/** 
* A classe Main representa a classe principal do projeto
*/
```

```(java)
/**
     * Esse é o método principal da classe
     * @param args representa a lista de argumentos
*/
```

## Como guardar variáveis

| Tipo | Bits | Valores |
| ---- | ---- | ------- |
| bolean |  | _true_ ou _false_ = _1_ ou _0_ |
| char | 16 | 0 a 65.535 |
| byte | 8 | -128 a 127 |
| short | 16 | -32.768 a 32.767 |
| int | 32 |  |
| long | 64 |  |
| float | 32 |  |
| double | 64 |  |

### Exemplos de Variáveis

```(java)
// tipo primitivo = começam com letras minúsculas
    boolean a = false;
    boolean b = true;
    char c = 'a'; // aspas simples
    char d = 250;
    int e = 5;
    float f = 5.55f;
    double g = 5.55;

// tipo referência = apontam para a memória = começam com letra maiúscula
    String h = "José Bonifácio"; // aspas duplas
    nome = "João, o diferente"; // posso trocar o que ela aponta no meio do código
```

## Variáveis Locais

Não têm um tipo específico em sua declaração, mas após ser atribuído valor, só aceitará mudanças do mesmo tipo de variável adicionado anteriormente.

Exemplo:
```(java)
var = 10;

var = 5; // funciona
var = 'b'; // não funciona, pois 'b' não é do mesmo tipo de '10' (inteiro)
```
### Restrições
1. Ela não pode ser atribuída _NULL_.
2. 
3. 
4. 
5. 

## Sequências de Escape

| Símbolo | Função |
| ------- | ------ |
| \n | quebra a linha |
| \t | adiciona tabulação de parágrafo (tab) |
| \r | retorna para o início da linha |
| Qualquer símbolo especial | coloca \ (contra-barra) antes |

* OBS: só funciona dentro do _println_, o único tipo que aceita formatação na impressão.

## Símbolos Operacionais

| Símbolo | Função |
| ------- | ------ |
| + | Adição |
| - | Subtração |
| * | Multiplicação |
| / | Divisão |
| ++ | Incremento |
| -- | Decremento |

### Diferença entre Adição e Subtração Automática (++ e --)

```(java)
int numero = 5;
while(++numero < 10){
    System.out.println(numero);
}
```
Nesse caso, primeiro ocorre a incrementação e depois a comparação.

Se estivesse **numero++**, a incrementação só ocorreria no final, quando a execução passa a próxima linha.

## Operadores Relacionais

## Operadores Lógicos
| Símbolo | Função |
| ------- | ------ |
| && | e |
| \|\| | ou |
| ! | não |

## Operadores de Atribuição

## Condicionais

| Símbolo | Função |
| ------- | ------ |
| if | Se |
| else if | senão |
| switch | caso for igual a |

* Atualmente, o mais recomendado é não usar **else if**, fazendo com que todas as condições estejam explícitas.

## Atribuição

| a | b | c |
| - | - | - |
| x=(condicional) | valor se for verdadeiro | valor se for falso |

## Laços de Repetição

### FOR

**Estrutura base**: for(inicialização da variável; condição; incremento ou decremento)

Observações
1. **Inicialização da Variável**: essa variável só existe dentro.
2. **Condição**: Verifica se a condição proposta é _verdadeira_ ou _falsa_. Caso seja _verdadeira_, a próxima ação vai ser o que estiver dentro do _FOR_. Caso seja _falso_, ocorre o _incremento_ ou _decremento_.
3. **Incremento** ou **Decremento**: A variável de inicialização é atualizada.

### WHILE

### DO WHILE