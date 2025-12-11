O arquivo trata principalmente do conceito, objetivos e processos do **Teste de Software** e da gestão de defeitos.

**Conceitos e Objetivos do Teste de Software**

O Teste de Software é o processo de executar um programa ou sistema com o propósito de **encontrar erros**. Envolve a simulação de um artefato executável com entradas e pré-condições conhecidas, comparando a saída atual com a esperada para verificar a conformidade com os requisitos. O principal objetivo dos testes é **encontrar defeitos**, nunca garantir que um sistema esteja livre deles. O foco deve ser encontrar o maior número de erros com o mínimo de esforço (custo/tempo). Os testes devem ser elaborados com uma finalidade específica (não sendo redundantes) e não devem ser excessivamente simples ou complexos.

**A Cadeira Causal dos Defeitos**

Problemas em software, comumente chamados de *bug*, resultam de uma cadeia causal: um **engano** (cometido por seres humanos) introduz um **defeito**. Quando o defeito é exercitado, ele **produz um erro** (um resultado incoerente), o que, por sua vez, leva a uma **falha** (a manifestação ou consequência do defeito, como uma saída incorreta ou o travamento da aplicação).

**Caso de Teste e Requisitos**

Um **Caso de Teste** é um conjunto de dados de entradas, condições de execução do sistema e o resultado projetado para atingir um objetivo específico, como exercitar um caminho no programa ou verificar o cumprimento de um requisito. Um caso de teste é composto por sete elementos detalhados: Identificador, Objetivo, Entradas, Saídas esperadas, Ambientes Necessários, Procedimentos Especiais e Dependência com Outros Casos de Teste.

Os **requisitos de software** podem ser especificados em diversos documentos (textuais, diagramas, etc.). Para garantir a qualidade e identificar problemas cedo, os requisitos não executáveis podem ser avaliados por meio de **revisão técnica**. A descoberta precoce de falhas (como na fase de Requisitos ou Projeto) é crucial, pois o custo de correção aumenta drasticamente nas fases posteriores, como Testes ou Manutenção.

**Gestão e Ferramentas**

O gerenciamento de projetos e atividades de teste utiliza ferramentas como Jira, Bugzilla ou testLink. O relato de defeitos deve ser detalhado, incluindo o identificador, descrição, versão do produto, passos detalhados para reprodução (com *screenshots*), data, responsável, status (novo, resolvido, etc.), severidade e prioridade.

A qualidade e a facilidade de testar um sistema são chamadas de **testabilidade**. Requisitos incompletos, ambíguos ou desatualizados resultam em baixa testabilidade.

**Técnicas de Teste (ISO/IEC/IEEE 29119-4):**
1. Técnica baseada em especificação (caixa preta ou funcional).
2. Técnica baseada em estrutura (caixa branca ou estrutural).
3. Técnica baseada em experiência (baseada em erros).

O processo de **Revisão Técnica** (inspeção) envolve papéis como Moderador, Inspetor e Autor e atividades como Apresentação, Detecção (busca por enganos e defeitos com *checklist*), Coleta, Discriminação (decisão sobre quais defeitos corrigir), Retrabalho (correção pelo autor) e Acompanhamento.