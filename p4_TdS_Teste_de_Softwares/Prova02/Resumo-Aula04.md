O arquivo mais recente foca nas abordagens e técnicas de **Teste de Software**, especificamente os conceitos de teste de caixa-preta, caixa-branca e caixa-cinza.

**1. Teste de Software (Geral)**

O teste de qualquer produto de engenharia, incluindo software, pode ser realizado de duas formas principais:
*   **Conhecendo a função especificada** do produto, para realizar testes que demonstrem que cada função é operacional e, ao mesmo tempo, busquem erros.
*   **Conhecendo o funcionamento interno** do produto, para garantir que as operações internas estão de acordo com as especificações e que todos os componentes internos foram exercitados adequadamente.

**2. Teste de Caixa-Preta (Baseado em Especificação/Funcional)**

O teste de caixa-preta (ou teste comportamental) foca nos **requisitos funcionais do software** e é realizado na **interface do sistema**.

*   **Conceito:** Examina aspectos fundamentais do sistema **sem preocupação com a estrutura lógica interna do software**. A informação sobre a estrutura interna está indisponível ou não é necessária.
*   **Derivação de Casos de Teste:** Os casos de teste são derivados da **especificação do objeto de teste**, focando em testar o sistema do ponto de vista das suas funcionalidades. O comportamento é observado "de fora", e a sequência de operações é influenciada apenas pela escolha apropriada dos dados de entrada.
*   **Objetivos:** Encontrar erros como funções incorretas ou faltantes, erros de interface, erros em estruturas de dados ou acesso a bases externas, erros de desempenho ou comportamento, e erros de inicialização e término.
*   **Limitações:** Por ser projetado com base na especificação, não detecta especificações erradas, nem revela funcionalidades extras que excedam a especificação.
*   **Técnicas Comuns (para Teste de Caixa-Preta):**
    *   **Particionamento de Equivalência:** Divide o domínio de entrada em classes de dados (válidas e inválidas) a partir das quais os casos de teste são criados. Qualquer valor dentro de um dado intervalo (partição) tem a mesma importância.
    *   **Análise de Valor Limite:** É complementar ao particionamento por equivalência. Consiste em selecionar casos de teste que utilizam **valores limites** das classes de equivalência. O objetivo é identificar fontes favoráveis a defeitos. Valores como 0, -1, ou limites máximos contextuais (ex: 744 horas, que é o máximo possível em um mês) podem ser usados como limites, especialmente quando a especificação não é clara.
    *   Outras técnicas mencionadas incluem Teste de matriz ortogonal e Teste baseado em modelos (como UML).

**3. Teste de Caixa-Branca (Baseado em Estrutura/Estrutural)**

O teste de caixa-branca (ou teste da caixa-de-vidro) fundamenta-se em um exame rigoroso do **detalhe procedimental**.

*   **Conceito:** Os dados de entrada e saída são baseados no **código-fonte**. É utilizado para testar caminhos lógicos do software e colaborações entre componentes, exercitando conjuntos específicos de condições e/ou ciclos.
*   **Objetivos:** Garantir que todos os caminhos foram exercitados pelo menos uma vez, exercitar todas as decisões lógicas nos seus estados verdadeiro e falso, executar todos os ciclos em seus limites e fronteiras operacionais, e exercitar estruturas de dados internas para assegurar sua validade.
*   **Aplicação:** Costuma ser aplicado em testes de componentes e de integração. Ter acesso ao código-fonte permite a criação de casos de teste que consideram os tipos de dados (inteiro, real, etc.).
*   **Importante:** Embora o teste se baseie no código, os resultados esperados devem ser determinados usando os **requisitos ou especificações**, e não o próprio código, para decidir se houve falha na execução.
*   **Categorias:** As categorias principais são Teste de fluxo de controle e Teste de fluxo de dados, que se baseiam no conceito de grafo de programa. Técnicas incluem Teste do caminho básico (exercita todas as instruções ao menos uma vez), Teste de condição (exercita as condições lógicas) e Teste de ciclo.

**4. Teste de Caixa-Cinza**

O teste de caixa-cinza combina características dos testes caixa-branca e caixa-preta.

*   **Conceito:** É uma técnica que permite testar programas com **conhecimento limitado do funcionamento interno** (estrutura do software). O testador tem acesso a documentos de *design* e ao banco de dados.
*   **Aplicação:** É usado principalmente para **teste de integração** e é indicado para aplicações Web, pois considera o desenvolvimento em alto nível, ambiente de operação e condições de compatibilidade.
*   **Vantagem:** Ambas as abordagens (caixa preta e branca) não conseguem identificar problemas relacionados ao **fluxo de dados fim a fim**, o que é um foco do teste caixa-cinza.