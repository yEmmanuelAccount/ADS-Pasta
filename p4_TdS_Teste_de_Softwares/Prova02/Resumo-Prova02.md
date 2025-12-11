O conjunto de arquivos aborda de forma abrangente o **Teste de Software**, cobrindo desde seus conceitos fundamentais e a cadeia de defeitos, até técnicas específicas (caixa-preta, caixa-branca, caixa-cinza) e a prática de Teste de Unidade usando JUnit.

## I. Conceitos Fundamentais e Objetivos do Teste

O **Teste de Software** é o processo de execução de um programa ou sistema com o objetivo principal de **encontrar erros** ou defeitos. Ele envolve simular um artefato executável com entradas e pré-condições conhecidas e comparar a saída atual com a esperada para verificar a conformidade com os requisitos. O objetivo dos testes é **encontrar o maior número de erros com o mínimo de esforço**, nunca garantir que o sistema esteja livre de defeitos.

A **Cadeia Causal de Defeitos** explica que um **engano** (cometido por humanos) introduz um **defeito**, que, quando exercitado, **produz um erro** (resultado incoerente) e culmina em uma **falha** (a manifestação ou consequência, como o travamento da aplicação).

**Requisitos e Revisão:** Requisitos de software podem ser especificados em diversos artefatos (textos, diagramas, etc.). É crucial descobrir falhas cedo, como na fase de Requisitos ou Projeto, pois **o custo de correção aumenta drasticamente** em fases posteriores, como Testes e Manutenção. Requisitos não executáveis podem ser avaliados por meio de **Revisão Técnica** (inspeção), que envolve papéis como Moderador, Inspetor e Autor, e atividades como Detecção de defeitos usando *checklists* e Discriminação para decidir quais corrigir. Requisitos incompletos ou ambíguos resultam em **baixa testabilidade**.

## II. Tipos e Técnicas de Teste

Os testes podem ser categorizados com base no conhecimento da estrutura interna do software, seguindo as técnicas da norma ISO/IEC/IEEE 29119-4:

| Tipo de Teste | Conhecimento da Estrutura | Base dos Casos de Teste | Principais Técnicas |
| :--- | :--- | :--- | :--- |
| **Caixa-Preta** (Funcional) | Não se preocupa com a lógica interna. | Requisitos funcionais e especificações. | **Particionamento de Equivalência** (divisão de domínio de entrada em classes válidas/inválidas) e **Análise de Valor Limite** (focando em valores extremos). |
| **Caixa-Branca** (Estrutural) | Exame rigoroso do detalhe procedimental e código-fonte. | Estrutura interna e código-fonte. | Teste de fluxo de controle (ex: **Teste do Caminho Básico**) e Teste de fluxo de dados. Garante que todos os caminhos e decisões lógicas sejam exercitados. |
| **Caixa-Cinza** | Conhecimento limitado da estrutura interna (acesso a documentos de design e banco de dados). | Combinações de especificações e estrutura interna. | Utilizado principalmente para **Teste de Integração** e para identificar problemas de **fluxo de dados fim a fim**, sendo indicado para aplicações Web. |

## III. Casos de Teste e Automação

**Casos de Teste e Cenários:** Um **Cenário de Teste** é o caminho ou a situação a ser testada (ex: uma transferência bancária). Um **Caso de Teste** (CT) é um conjunto de entradas, condições de execução e resultado projetado para atingir um objetivo específico ou verificar um requisito.

Um caso de teste completo deve conter: **Identificador**, **Propósito/Objetivo**, **Precondições** (condições necessárias), **Ações do Passo/Entradas**, **Resultados Esperados**, **Pós-condições** e **Histórico de Execução**. Os casos de teste devem ser **Efetivos**, **Econômicos**, **Reutilizáveis**, **Rastreáveis** e **Autoexplicativos**. O **Oráculo** é a entidade capaz de determinar se o resultado da execução é o esperado.

**Teste de Unidade (JUnit):** O Teste Unitário concentra-se na verificação da **menor unidade** do software (método, classe ou objeto) e é baseado em Caixa Branca. O *framework* **JUnit** é uma API de código aberto utilizada para automação de testes unitários em Java.

Os resultados de um teste são baseados em veredito:
*   **Aprovado:** Funcionou conforme esperado.
*   **Falha:** O propósito foi atingido, mas o desempenho não foi o esperado.
*   **Erro:** O caso de teste não atingiu seu propósito devido a um evento inesperado ou falha de configuração.

O JUnit utiliza anotações como `@Test` (para marcar métodos de teste), `@BeforeAll` e `@AfterAll` (para configurar/liberar recursos antes/depois de todos os testes), e `@BeforeEach` e `@AfterEach` (para configurar/liberar recursos antes/depois de cada teste). A classe `Assertions` oferece métodos como `assertEquals`, `assertTrue` e `assertNull` para verificar se as condições esperadas correspondem aos resultados. O conceito de **Pilha** (estrutura de dados LIFO) é usado como exemplo prático de uma unidade a ser testada, com funcionalidades como *push* e *pop*.