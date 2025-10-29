<link rel="stylesheet" href="../../estilos-markdown.css">

<h1 class="tds"> Aula 00 - Apresentação da Disciplina </h1>

*   **Consequências de Falhas de Software:** Um erro no sistema impediu 20 mil estudantes de se inscreverem em qualquer curso. Falhas em sistemas podem causar grandes transtornos, como engarrafamentos, onde 78,1 km de vias foram congestionadas, muito acima da média de 23,4 km.
*   **Exemplos de Problemas em Aplicativos:** Falhas comuns estão ligadas ao *login*; ao tentar acessar via biometria, o serviço pode solicitar uma senha e apresentar uma tela de erro. Mesmo usando a senha correta ou reconfigurando-a, o login pode não ser realizado, ou o aplicativo pode ficar travado na tela de acesso.
*   **Causa de Falhas (Google):** Em um caso, o Google informou que o problema foi causado por uma **“atualização de software”**. Esse problema fez com que o aplicativo exibisse a mensagem "No network connection", mesmo com o celular conectado perfeitamente à rede.
*   **O Desafio e o Papel do Teste:** O grande desafio das empresas é produzir software com qualidade, em um curto espaço de tempo, com baixo custo e atendendo aos requisitos impostos pelo cliente.
*   **Benefício do Teste:** Com os testes, é possível **antecipar a descoberta de falhas** e incompatibilidades, o que, por sua vez, resulta na redução do custo do projeto. O objetivo é reduzir os defeitos do software no ambiente de produção.

<h1 class="tds"> Aula 01 - Conceitos Iniciais </h1>

*   **Processo de Software:** É o conjunto de atividades que leva à produção de um produto de software. As atividades incluem: 1. Especificação de software, 2. Projeto e Implementação, 3. Validação de software, 4. Evolução de software.
*   **Especificação de Software (Engenharia de Requisitos):** É o processo de compreender e definir quais serviços são necessários e identificar as restrições. Erros neste estágio são **críticos** e levam a problemas posteriores.
*   **Artefatos e Fases de Requisitos:** O processo de especificação produz um **documento de requisitos**, passando por fases como Estudo de viabilidade, Elicitação e análise, Especificação de requisitos e Validação de requisitos. A validação verifica se o documento está consistente e se o sistema pode ser produzido com os recursos disponíveis.
*   **Tipos de Requisitos:**
    *   **Requisitos do Usuário:** Descrição facilmente interpretada pelo usuário, geralmente em linguagem natural com diagramas.
    *   **Requisitos de Sistema:** Descrição detalhada da funcionalidade, podendo fazer parte do contrato entre comprador e desenvolvedores.
    *   **Funcionais:** Descrevem **o que** o sistema deve fazer (funções, entradas, saídas, exceções).
    *   **Não Funcionais:** Requisitos que não estão diretamente ligados aos serviços, mas sim às propriedades do sistema, como confiabilidade, tempo de resposta e ocupação de área. Especificam ou restringem o comportamento do software.
*   **Características de Qualidade (Não Funcionais):**
    *   **Usabilidade:** Facilidade de aprender (esforço mínimo) e facilidade de uso (velocidade de execução de tarefas e redução de erros).
    *   **Manutenibilidade:** Facilidade de fazer alterações, reparos, evoluções ou adição de novas funcionalidades, e está relacionada à arquitetura.
    *   **Confiabilidade:** Probabilidade de o software não causar uma falha durante um período. Inclui Disponibilidade e Tempo Médio Até a Ocorrência de Falha (MTTF).
    *   **Desempenho:** Rapidez com que o sistema executa uma função.
    *   **Portabilidade:** Facilidade na qual o software pode ser transferido de um sistema computacional/ambiente para outro.
    *   **Segurança:** Garante que acessos não autorizados ao sistema e dados não serão permitidos.
*   **Validação e Verificação (V&V):** O processo de V&V busca responder duas perguntas principais: "Estamos construindo o produto correto?" (atendendo expectativas do cliente) e "Estamos construindo o produto corretamente?" (de acordo com as especificações).
*   **Técnicas de V&V:**
    *   **Inspeções ou revisões por pares:** Análise estática, baseada no exame visual de documentos.
    *   **Testes de software:** Análise dinâmica, técnica principal de V&V que envolve a execução do programa simulando dados reais para descobrir defeitos.
*   **Conceitos Chave de Teste:**
    *   **Caso de teste:** Conjunto de valores de entrada, pré-condições de execução e resultados esperados.
    *   **Critério de aceite:** Critérios de saída que um componente ou sistema deve satisfazer para ser aceito por uma entidade autorizada.
    *   **Plano de teste:** Documento que descreve o escopo, a abordagem, os recursos e o cronograma das atividades de teste.
    *   **Rastreabilidade:** Habilidade de identificar itens relacionados em documentos e softwares, como requisitos e testes associados.
    *   **Não conformidade:** Trata-se do não atendimento a um requisito especificado.


<h1 class="tds"> Aula 02 - Qualidade de Software </h1>

*   **Visões de Qualidade:**
    *   **Visão Popular:** Qualidade é vista como algo abstrato, perfeição, luxo ou questão de opinião pessoal.
    *   **Visão Profissional:** Qualidade é a **conformidade aos requisitos funcionais e não funcionais** e a **adequação ao uso** (Usuário feliz).
*   **Definições Profissionais:** Qualidade de software é o grau de satisfação das necessidades dos clientes sob todos os aspectos do produto. Também é a conformidade a requisitos explicitamente declarados, padrões de desenvolvimento documentados e características implícitas esperadas.
*   **Falta de Qualidade:** A falta de conformidade com os requisitos (explícitos) significa falta de qualidade. Além disso, se o software falhar em cumprir requisitos implícitos (como manutenibilidade), a qualidade pode ser comprometida.
*   **Consequências da Má Qualidade:** Perda de horas de trabalho, dados perdidos ou corrompidos, custos de suporte e manutenção elevados, baixa satisfação do cliente, e a imagem da empresa é afetada no mercado.
*   **Papéis e Perspectivas de Qualidade:**
    *   **Usuário:** Avalia o software sem conhecer seus aspectos internos, focando na facilidade de uso, desempenho e confiabilidade dos resultados.
    *   **Desenvolvedor:** Avalia aspectos de conformidade com os requisitos e aspectos internos do software.
    *   **Gerente:** Avalia conformidade com requisitos e também aspectos de custo e cronograma.
    *   **Stakeholders:** Avaliam aspectos do usuário, lucro de patrocinados e adequação com regras e leis.
*   **Tipos de Sistemas:**
    *   **Sistema Crítico:** Sistemas com riscos inerentes a danos físicos, pessoais e financeiros (ex: navegação de aeronave). A qualidade focada inclui precisão, facilidade de uso, bom desempenho em hardware e facilidade de alteração.
    *   **Sistema de Tempo Real:** Responsável pelo processamento de informações com componentes que executam funções em tempo real (ex: Monitor de paciente em UTI).
*   **Normas e Guias de Qualidade:** Incluem ISO/IEC 15504 (Melhoria do Processo de Desenvolvimento), ISO/IEC 12207 (Melhoria de atividades), CMMI e MPS-BR.
*   **Fatores de Qualidade (Métricas):** Incluem Confiabilidade, Eficiência, Integridade, Usabilidade, Facilidade de Manutenção, Testabilidade, Portabilidade e Interoperabilidade.
*   **Custo da Qualidade (COQ):**
    *   Inclui custos de **Prevenção** (planejamento), **Avaliação** (revisões, testes e depuração) e **Falhas** (custos de falhas internas e retrabalhos).
    *   Quanto mais cedo as falhas forem descobertas, menor será o custo para corrigi-las.
*   **Teste e Medição:** O Teste de software contribui para a melhoria da qualidade. Embora a qualidade possa ser medida diretamente em alguns aspectos, alguns fatores não são passíveis de medição (ex: probabilidade de operação sem falhas em um dado ambiente).
*   **Dilema da Perfeição:** O profissional busca um "meio-termo mágico" para que o produto seja bom o suficiente para não ser rejeitado, mas sem gastar tempo e recursos em excesso para alcançar a perfeição absoluta, o que levaria a custos muito altos ou à falência.
