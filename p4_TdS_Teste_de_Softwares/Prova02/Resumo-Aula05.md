O arquivo está centrado na definição, estrutura e atributos de qualidade dos **Casos de Teste** e **Cenários de Teste** no contexto do Teste de Software.

**1. Conceitos Fundamentais**

*   **Cenário de Teste:** É o caminho ou a situação específica que deve ser testada dentro do sistema. Um cenário (como uma transferência bancária) pode englobar diversos casos de teste.
*   **Caso de Teste:** É um conjunto de dados de entrada, condições de execução do sistema e o resultado projetado para alcançar um objetivo específico, como exercitar um caminho em um programa ou verificar a conformidade com um requisito (conforme a norma IEEE 829-2008). Um caso de teste é uma sequência de passos com dados de entrada e saída esperada especificados.
*   **Oráculo:** É algo ou alguém capaz de determinar se o resultado da execução de um teste é o esperado ou não. O teste envolve estabelecer precondições, observar resultados, compará-los com o oráculo e garantir as pós-condições esperadas.

**2. Elementos de um Caso de Teste Completo**

Um caso de teste bem elaborado é a base para projetar e implementar os testes reais e deve ser desenvolvido para cada cenário de caso de uso. Um caso de teste completo possui os seguintes elementos principais:

*   **Identificador do Caso de Teste**.
*   **Propósito/Objetivo:** Uma breve descrição do que será executado, fornecendo uma visão geral da validação.
*   **Precondições:** Condições necessárias que precisam ser atendidas para que o teste possa ser executado (Ex: Usuário cadastrado e autenticado).
*   **Ações do Passo/Entradas:** Os passos detalhados que o analista deve seguir durante a execução (devem iniciar com verbos no infinitivo ou imperativo, como “Acessar”, “Clique” ou “Preencha”).
*   **Resultados Esperados:** O comportamento esperado do sistema após a execução dos passos, devendo-se usar verbos no presente (Ex: "Sistema apresenta a tela...").
*   **Pós-condições esperadas**.
*   **Histórico de Execução:** Inclui a data, a pessoa que executou, a versão do sistema e o resultado do teste.

**3. Critérios de Qualidade e Desenvolvimento**

Para serem eficazes, os casos de teste devem ter as seguintes características:

*   **Efetivo:** Testar o que se planejou testar.
*   **Econômico:** Não ter passos desnecessários.
*   **Reutilizável:** Poder ser repetido.
*   **Rastreável:** Permitir identificar o Requisito a ser testado.
*   **Autoexplicativo:** Poder ser executado por qualquer testador.

Um bom conjunto de casos de teste precisa ter **consistência** (elaborado em conformidade com a especificação do sistema) e ter **tamanho** proporcional ao orçamento. É importante que tenham alta probabilidade de revelar um erro ainda não descoberto. Especificações vagas (como "O programa deve retornar um valor") dificultam a criação de casos de teste claros e objetivos.