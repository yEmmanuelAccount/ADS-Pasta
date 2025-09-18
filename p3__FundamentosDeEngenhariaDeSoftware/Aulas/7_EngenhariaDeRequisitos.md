# Engenharia de Requisitos

$\quad$ A parte mais difícil na construção de software é decidir por onde começar.

$\quad$ Tem início na atividade de _comunicação_ e continua na _modelagem_.

$\quad$ Envolve 7 tarefas: concepção, levantamento, elaboração, negociação, especificação, validação e gestão.

## 1 - Concepção

$\quad$ A maioria dos projetos começa quando se tem uma **demanda** ou **necessidade** de negócio ou novo serviço.

$\quad$ Essa etapa pode ser feita de várias formas, desde uma conversa até ações mais complexas.

## 2 - Levantamento

$\quad$ Identificar, junto ao cliente, usuários e demais partes interessadas.

* objetivos do sistema
* como o sistema atenderá as necessidades levantadas
* como o sistema será usado no dia-a-dia

$\quad$ Não é uma tarefa simples.

$\quad$ Devem ser estabelecidas **metas de negócio**.

$\quad$ É uma etapa passível de muitos problemas:

* de escopo: limites mal definidos
* de entendimento: o cliente ainda não sabe muito bem o que quer
* volatilidade: requisitos podem mudar

## 3 - Elaboração

$\quad$ Construção de um modelo de requisitos refinado.

$\quad$ Identificação de aspectos da função, comportamento e informações.

$\quad$ Podem ser utilizados cenários (casos de uso, histórias do usuário) para refinamento de cenários.

$\quad$ Podem ser construídos alguns **artefatos**: modelo de domínio, diagrama de casos de uso, entre outros. Exemplo: um artefato pertence a um museu, mas não existe a obrigatoriedade de ser _desse_ museu. Outro fato é que o museu existiria sem o artefato.

## 4 - Negociação

$\quad$ Resolver conflitos que possam surgir.

* clientes podem pedir mais que o possível
* necessidades conflitantes

$\quad$ Devemos priorizar alguns requisitos, avaliar custos e riscos, tratar conflitos internos.

$\quad$ Ocorre a modificação, eliminação ou combinados de forma a proporcionar certo nível de satisfação.

## 5 - Especificação

$\quad$ Pode ocorrer de várias formas (documentos, diagramas, modelos matemáticos, cenários, etc).

$\quad$ Vai depender da natureza do produto, mas geralmente gerando um protótipo.

$\quad$ Pode ser iniciado de forma sucinta e refinado durante o desenvolvimento.

## 6 - Validação

$\quad$ Avaliação dos artefatos criados na fase de _Especificação_.

$\quad$ Verificação de ambiguidade, inconsistências, omissões, erros.

$\quad$ A principal forma de fazer é com a **revisão técnica**.

$\quad$ Todas essas falhas devem ser removidas.

$\quad$ Se uma pessoa quer um botão em uma posição e outra pessoa em outra, isso é resolvido nessa fase.

## 7 - Gestão

$\quad$ Os requisitos mudam, e o desejo de mudar os requisitos persiste ao longo da vida de um sistema.

$\quad$ Ajuda a identificar, controlar e acompanhar as necessidades e suas mudanças à medida que o projeto prossegue.

$\quad$ Está alinhado com a Gestão de Configuração e Mudança (acho, olhar no slide).

## Exemplo

$\quad$ Identificar possíveis problemas nas seguintes necessidades.

* o software deve ser amigável
  * vago de mais
* a probabilidade de invasão não autorizada e bem sucedida ao banco de dados deve ser menor que 0.0001
  * grande custo de validação (em relação a tempo e processamento)

# <>

$\quad$ Os requisitos **não podem ser vagos** demais. É importante haver elementos **quantitativos ou qualitativos** para que ele possa ser avaliado.

$\quad$ Elementos mais críticos devem ser descritos de forma _quantitativa_ e os menos críticos podem ser descritos em termos gerais, podendo ser validado por alguma técnica _qualitativa_ (uma pesquisa, por exemplo).

$\quad$ Os requisitos são mutáveis e é importante ser gerenciados.

$\quad$ É necessário registar as mudanças nos requisitos ao longo do desenvolvimento.

$\quad$ Ferramentas computacionais podem ser usadas para ajudar na Gerência de Configuração e Mudanças (GitHub, por exemplo).

## Identificando Stakeholders

$\quad$ São os envolvidos e interessados. Qualquer pessoa que se beneficie com o sistema, direta ou indiretamente.

$\quad$ Cada interessado tem uma visão diferente do sistema, é sempre bom **identificar todos**.

$\quad$ Devemos sempre perguntar: "_com quem mais devo falar?_"

## Reconhecendo diversos Pontos de Vista

$\quad$ Cada interessado tem **necessidades específicas**.

$\quad$ Todas as partes devem contribuir com os requisitos, mesmo que seja com informações ainda incompletas.

$\quad$ .

## Questões Iniciais: identificar os envolvidos

* quem está por trás da solicitação deste projeto?
* quem vai utilizar o sistema?
* qual o benefício econômico?
* há outra pessoa interessada na solução?
* quais problemas o software vai resolver?
* .
* .
* .

## Questões Iniciais: identificar a eficiência da comunicação

* você é a pessoa certa para responder essa pergunta?
* minhas perguntas estão sendo relevantes?
* estou perguntando demais?
* .
* .
* .

# <>

$\quad$ Após identificados, os requisitos devem ser documentados...

$\quad$ .

$\quad$ Após a especificação, os requisitos são verificados e validados. Eles devem ser:

* **Corretos**: não podem haver erros, em especial em cálculos.
* **Precisos**: não podem haver ambiguidades, porém, devido ao uso de linguagem natural, são muito comuns.
* **Completos**: não podemos esquecer requisitos.
* **Consistentes**: deve haver coerência no que foi levantado.
* **Verificáveis**: deve ser possível testar se os requisitos estão sendo atendidos.

## Desafios

$\quad$ O survey indicou os principais problemas enfrentados no levantamento de requisitos:

## Requisitos

$\quad$ **Funcionais**: diz o que um sistema deve fazer, suas funcionalidades

$\quad$ **Não-Funcionais**: sob que restrições? desempenho, segurança

$\quad$ Exemplos de Requisitos Não-Funcionais

| Nome                                         | Descrição |
| :------------------------------------------- | :-------- |
| Desempenho                                   |           |
| Espaço                                       |           |
| Confiabilidade                               |           |
| Robustez                                     |           |
| Usabilidade                                  |           |
| Portabilidade                                |           |
| O software deve ter usabilidade              |           |
| O software deve ser confiável                |           |
| O software deve ter um bom tempo de resposta |           |

### Requisitos Funcionais x Não-Funcionais

$\quad$ O primeiro

## Características de boas histórias (**INVEST**)

* Independentes
* Abertas a Negociação
* Agregar Valor
* Estimáveis (em relação a prazo)
* Sucintas (curtas, direto ao ponto)
* Testáveis

## Requisitos não funcionais (RNF)
