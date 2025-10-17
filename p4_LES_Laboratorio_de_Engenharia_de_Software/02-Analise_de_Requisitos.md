<!-- Link do CSS -->
<link rel="stylesheet" href="../estilos-markdown.css">

<h1 class="les"> Análise de Requisitos </h1>

<h2 class="les"> Roteiro </h2>

1. Sistemas
2. Requisitos de Software
3. Análise de Requisitos
4. Custo de Correção de Erros

<h2 class="les"> Sistemas </h2>

No contexto **geral**:
* **Grupo de elementos** interativos, inter-relacionados ou interdependentes que formam, ou parecem formar, uma entidade coletiva.

No contexto de **Desenvolvimento de Software**:
* **Procedimentos** para registrar e tornar disponível informação sobre parte da organização, **apoiando atividades da própria organização**.
* Componentes inter-relacionados utilizados para coletar, processar, armazenar e disseminar informações para apoiar processos operacionais e de tomada de decisão, coordenação, controle, análise e visualização em uma organização.

<h2 class="les"> Eventos e Resposta </h2>

* **Evento**: alguma mudança no ambiente onde o sistema está inserido.
* **Resposta**: conjunto de ações realizadas pelo sistema quando ocorre um determinado evento.

`Sistemas são seletivos`.

<h2 class="les"> Representação </h2>

Sistemas são representados através de linguagem formal (código).

As respostas podem ser executadas por qualquer entidade ativa que entenda qual linguagem.

Uma **definição mais completa** de Sistema seria:

<blockquote class="les">“Entidade ou coleção de entidades que executam ações previamente planejadas sempre que ocorre um evento e cujas respostas podem ser representadas em uma linguagem que possa ser adotada em outras entidades ativas”. </blockquote>

<h2 class="les"> Problemas e Causas </h2>

**Problemas**: qualidade, produtividade, manutenção, confiabilidade, segurança, etc.

**Causas**: muitos problemas ocorrem por falhas no
entendimento dos desejos e necessidades dos clientes e na relação entre os sistemas e a organização.

<h2 class="les"> Casos Clássicos de falhas de sistema </h2>

`Mariner (1962): 18,5 milhões de dólares.`
<div class="padrao">

Mariner era um foguete com uma sonda espacial com destino à Vênus, mas foi desviado do seu trajeto logo após o lançamento. O controle da missão destruiu o foguete 293 segundos após a decolagem.

**Causa**: Um programador, ao passar uma fórmula escrita para o sistema, esqueceu uma barra (/). Sem ela, o software tratava as variações normais de velocidade como se fossem sérios problemas, causando falhas nas tentativas de correção que acabaram por tirar o foguete do curso.

</div>