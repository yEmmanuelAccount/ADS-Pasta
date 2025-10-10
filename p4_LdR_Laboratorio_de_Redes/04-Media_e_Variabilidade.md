<!-- Link do CSS -->
<link rel="stylesheet" href="../estilos-markdown.css">

<h1 class="ldr"> Média e Variabilidade </h1>

<h2 class="ldr"> Introdução </h2>

Os humanos comumente tentam **resumir a performance de tudo que é avaliado em dados numéricos**. Reduzir o conjunto de
aplicações a um único número leva a conclusões enganosas
sobre os dados, pois perde-se a essência do comportamento dos
dados em torno das medições.

Portanto, o objetivo principal desta
aula é mostrar como introduzir vários tipos de médias, bem como
mostrar algumas ferramentas gráficas para quantificar a variabilidade.

<h2 class="ldr"> Natureza Humana </h2>

Pessoas continuam um caminho fácil para avaliar diferentes sistemas de computadores.

Há uma forte demanda para reduzir o desempenho de um sistema computacional a um único número.

Pontos importantes:
1. Valores médios podem ser usados para realizar comparações aproximadas.
2. O **analista de desempenho** verá outros usando valores médios para justificar alguns resultados.
3. Existe algum `design de experimentos`? Não.
4. A média pode conter outliers (pontos fora da curva).

<h2 class="ldr"> Mais sobre Médias </h2>

É importante:
1) calcular corretamente um valor médio/média
2) reconhecer quando uma média foi calculada
incorretamente
3) entender quando uma média está sendo usada
de forma errada

Aprenderemos tudo isso nessa disciplina.

<h2 class="ldr"> Índices de Tendência Central </h2>

<h3 class="ldr"> Média aritmética </h3>

<div class="ldr"> Média amostral </div>

Refere-se à média dos valores que são usados para calcular a média da “amostra” dos valores que poderiam ter sido medidos a partir do
processo experimental de uma população inteira.

Dadas `n` medições diferentes que devemos calcular em conjunto, normalmente assumimos que as probabilidades de obter qualquer um dos n valores são todas igualmente prováveis. Assim, a estimativa da média amostral, comumente relacionada como a média aritmética, é


$$ 
[
\bar{x}_A = \frac{1}{n} \sum_{i=1}^{n} x_i
]
$$ 

<div class="ldr"> Exemplo </div>

| Medida | Tempo de Execução (segundos) |
| :----: | :--------------------------: |
| x1 | 10 |
| x2 | 20 |
| x3 | 15 |
| x4 | 18 |
| x5 | 16 |

$$
\bar{x}_a = \frac{(10 + 20 + 15 + 18 + 16)}{5} = 15,8
$$

<h3 class="ldr"> Mediana </h3>

É um índice que atribui pesos iguais a todas as medições, diminuindo o **efeito de inclinação** dos valores atípicos no valor do índice. É um valor que separa a metade inferior da metade superior de uma amostra, ou seja, é um valor médio de um conjunto (valor do meio de um conjunto).

O valor do meio é então definido como a mediana do conjunto de edições. Se `n` for **par**, a mediana é definida de uma forma, e se `n` for **ímpar** é de outra forma.

* **Ímpar**
$$
{x}_n = \frac{x_{n+1}}{2}
$$

* **Par**
$$
{x}_n = \frac
    {
        {\frac{{x}_n}{2}}
        +
        {\frac{{x}_{n+2}}{2}}
    }
    {2}
$$

<h3 class="ldr"> Moda </h3>

Se refere ao valor **mais comum (mais repetido)** dentro de um conjunto de dados. Se nenhum valor for repetido, não há moda.

<h2 class="ldr"> Selecionando entre Média, Mediana e Moda </h2>

Uma boa propriedade da `média aritmética` é que ela dá **peso igual a todos os valores medidos**. Assim, ela incorpora informações de toda a amostra de dados no valor final, incluindo valores atípicos.

A `moda` é o índice apropriado a ser usado neste caso para **resumir o tipo mais comum de computador que a organização possui**.

Se a amostra contiver **dados que não estão agrupados com os outros**, a `mediana` pode dar uma indicação da **tendência central dos dados melhor do que a média**.

<h2 class="ldr"> Outros Tipos de Medidas </h2>

Depois de decidirmos que a média é o índice de tendência central apropriado para usar na situação atual, devemos decidir que tipo de média usar! Até agora, discutimos a média aritmética, mas, na verdade, existem duas outras médias que são comumente usadas para resumir o desempenho dos sistemas de computador: a `média harmônica` e a `média geométrica`.

Portanto, `dependendo do significado físico desses valores medidos`, **o valor médio resultante calculado pode não fazer sentido**.

Se os valores de tempo forem calculados em média, o
valor médio resultante deve ser diretamente proporcional ao tempo total ponderado. 

Assim, se o tempo total de execução dobrar, o
valor da média correspondente também dobrará, conforme desejado. Por outro lado, como uma métrica de taxa é calculada dividindo-se o número de operações executadas pelo tempo total de execução, um valor médio
calculado com taxas deve ser inversamente proporcional ao
tempo total ponderado. 

Ou seja, se o tempo total de execução dobrar, o valor da média correspondente das taxas deve ser reduzido para metade do seu valor inicial. Dadas essas premissas básicas, agora podemos determinar se a média aritmética, a média geométrica e a média harmônica produzem valores que resumem corretamente os tempos de execução e as taxas.