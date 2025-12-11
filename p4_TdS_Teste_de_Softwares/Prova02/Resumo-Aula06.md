O arquivo trata do **Teste de Unidade** (*Unit Test*), suas práticas, e a utilização do *framework* **JUnit** para testes automatizados em Java.

**Teste de Unidade (Teste Unitário)**

O Teste de Unidade concentra-se na verificação da **menor unidade do projeto de *software***, como um método, classe ou objeto. É também conhecido como Teste Unitário e resulta de práticas de XP (*Extreme Programming*), incluindo código coletivo, refatoração e integração contínua. Esse tipo de teste é baseado em **Caixa Branca** (código-fonte), onde tanto os dados de entrada quanto os de saída são baseados no código-fonte. O teste unitário permite que alterações no código sejam feitas com mais segurança e testa tanto situações de sucesso quanto de falha.

**JUnit 5**

**JUnit** é uma API de código aberto para a criação de testes unitários automáticos em Java, utilizando anotações e declarações para facilitar a escrita e execução de testes.

**Vereditos de Teste:** Os testes são baseados em veredito e podem ter três resultados principais:

1.  **Aprovado:** O teste atingiu o objetivo e o *software* funcionou conforme o esperado.
2.  **Falha:** O teste atingiu o objetivo, mas o *software* não teve o desempenho esperado.
3.  **Erro:** O caso de teste não atingiu seu propósito, devido a um evento inesperado ou porque o caso de teste não pôde ser configurado corretamente.

**Anotações e Estrutura de Teste no JUnit:**

O JUnit utiliza anotações para definir o comportamento dos métodos de teste:

*   **`@Test`:** Indica que o método deve ser executado pelo *framework* como um teste. A remoção desta anotação impede a execução do método.
*   **`@BeforeAll` (ou `setUpBeforeClass()`):** Usado para códigos que precisam ser executados **antes da criação** do objeto da classe de teste ou antes de todos os métodos de teste, como a criação de uma conexão com banco de dados.
*   **`@AfterAll` (ou `tearDownAfterClass()`):** Usado para códigos que devem ser executados **após todos os casos de teste** terem sido finalizados, geralmente para liberação de recursos adquiridos no `setUpBeforeClass()`.
*   **`@BeforeEach` (ou `setUp()`):** Utilizado para a **inicialização de recursos** antes da execução de **cada método de teste**.
*   **`@AfterEach` (ou `tearDown()`):** Utilizado para a **liberação de recursos** (geralmente obtidos no `setUp()`) ao final de **cada método de teste**.

**Assertions (Afirmações):**

A classe `Assertions` fornece métodos para verificar se certas condições esperadas correspondem ao resultado do teste, fazendo o teste falhar se a condição não for satisfeita.

*   **Verificação de Valores e Objetos:** `assertEquals` (verifica a igualdade entre parâmetros), `assertSame` (requer que os parâmetros se refiram ao mesmo objeto), e `assertNotSame` (requer que se refiram a objetos diferentes).
*   **Verificação Booleana e Nulidade:** `assertTrue` (o teste falha se a condição booleana for falsa), `assertFalse` (o teste falha se a condição booleana for verdadeira), `assertNull` (o teste falha se o valor não for nulo), e `assertNotNull` (o teste falha se o valor for nulo).

**Exemplo de Aplicação (Pilhas):**

O arquivo ilustra o conceito de Pilha, uma estrutura de dados **LIFO (*last-in first-out*)**, na qual o último elemento inserido é o primeiro a ser retirado. As funcionalidades básicas de uma pilha incluem `criação`, `push` (inserir elemento), `pop` (remover), `top` (acessar o último item), `isEmpty` e `isFull`. Um exemplo de classe Java para `PilhaDeInteiros` é fornecido, implementando métodos como `top()`, `push()` e `pop()` usando um `ArrayList`.