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