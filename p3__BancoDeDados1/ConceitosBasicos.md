# Conceitos

[[TOC]]

## Introdução

$\quad$ Diariamente, realizamos tarefas que envolvem algumas interações com Banco de Dados. Para pessoas que não sabem o que é, nem percebem que estão interagindo com um.

$\quad$ Exemplos:
* transações bancárias
* reservas em hotéis ou uma passagem
* acessando o catálogo de uma loja

## Conceitos Básicos

### Definição Genérica

$\quad$ É uma coleção de dados relacionados e armazenados em algum dispositivo.

### Características de um Banco de Dados

$\quad$ Podemos definir melhor um Banco de Dados com base em suas características.

* Representa algum aspecto de mundo real.
  * também chamado de _mini mundo_ ou _universo_ de discurso.
* Mudanças no _mini mundo_ precisam ser refletidas para o Banco de Dados.
* É uma coleção de dados logicamente coerente.
* Os dados dessa coleção possuem um significado inerente e representam fatos ocorridos no _mini mundo_ representado no Banco de Dados.
* Existem sempre um grupo definido de usuários interessados em seu conteúdo.
* Ele é projetado, construído e populado com dados para uma finalidade específica.
* Os atuais normalmente precisam gerenciar uma grande quantidade de dados.
* Antigamente, era implementado como um conjunto de arquivos e tudo ficava como responsabilidade do programador.

### Desvantagens dos Sistemas de Arquivos

* Toda a estrutura dos dados era feita dentro da aplicação.
* Muito trabalhoso de aplicar mudanças na estrutura.
* O programador perdia muito tempo para implementar rotinas de acesso aos dados.
* Desperdício de espaço e problemas de consistências devido as várias versões dos mesmos dados em arquivos diferentes.
* O programador tinha que se preocupar de mais com a implementação de vários _softwares_ complexos.

### Solução para as Desvantagens

$\quad$ Foram desenvolvidos Sistemas Gerenciadores de Banco de Dados (SGBD).

$\quad$ O SGBD é uma coleção de programas que permitem a criação e gerenciamento do Banco de Dados.

## Vantagens de uso de SGBDs

### Natureza auto-descritiva

$\quad$ É fornecido um catálogo descritivo contendo uma série de metadados acerca da estrutura do Banco de Dados e suas restrições.

$\quad$ Exemplos de metadados: as tabelas, as colunas de cada tabela com os seus respectivos tipos, os índices, os procedimentos armazenados, as restrições de integridade, etc.

### Isolamento entre _Aplicação_ e _Banco de Dados_

$\quad$ As tarefas relativas ao _Gerenciamento de Dados_ ficam como responsabilidade do SGBD. Assim, o programador pode se concentrar no desenvolvimento da aplicação.

$\quad$ Mudanças na estrutura e na organização dos dados tem menos impacto na Aplicação e vice-versa.

$\quad$ Maior facilidade para o compartilhamento de dados, pois a estrutura do SGBD pode ser reutilizada em várias Aplicações.

### Melhor abstração dos dados

$\quad$ O SGBD fica responsável por detalhes do armazenamento, indexação e recuperação dos dados.

$\quad$ O programador só precisa conhecer e se preocupar com informações de alto nível (realmente importantes) sobre a organização dos dados.

### Suporte a múltiplas visões dos dados

$\quad$ Visões (visualização) podem ser usadas para controlar quais dados poderão ser acessados por cada grupo de usuários e como esses dados serão visualizados.

### Controle de Concorrência

$\quad$ O SGBD gerencia o acesso concorrente quando múltiplos  usuários tentam utilizar o Banco de Dados ao mesmo tempo. Assim, as informações continuarão corretas mesmo após todas as atualizações.

### Verificação de Restrições de Integridade

$\quad$ O SGBD verifica as Restrições de Integridade antes de cada operação.

$\quad$ Exemplo: não pode valores nulos, esse atributo é representado por inteiros, chaves, referências, etc.

### Controle de Redundância

$\quad$ Como o SGBD permite várias visões referentes a vários usuários, evitando a necessidade de redundância de dados, e por consequência o desperdício de espaço e problemas de inconsistência.

### Controle de Acesso de Dados

$\quad$ O SGBD permite permite especificar qual usuário tem acesso ao Banco de Dados, assim como os recursos que e operações que podem realizar, semelhante aos cargos no _Discord_.

$\quad$ O próprio SGBD controla a autenticação e autorização dos usuários.

### Armazenamento Persistente de Objetos

$\quad$ Os SGBDs orientados a objetos armazenam e recuperam objetos do Banco de Dados, fazendo a conversão de Objeto para Registro e vice-versa.

$\quad$ Isso reduz problemas de _impedância_, que seriam as dificuldades que surgem quando tentamos integrar dois modelos de dados fundamentalmente diferentes, como o modelo **orientado a objetos** e o **relacional**.

### Otimização de Consultas

$\quad$ O próprio SGBD oferece ferramentas que otimizam a execução de consultas para minimizar o tempo de resposta. É a chave para consultas de forma eficiente.

### Backup e Recuperação

$\quad$ Há módulos de _backup_, permitindo que os dados sejam guardados para uma possível recuperação após uma eventual falha de disco catastrófica.

$\quad$ Existem também os módulos de recuperação, permitindo a reversão do Banco de Dados para a versão anterior salva anteriormente, garantindo uma segurança após uma possível falha de _hardware_ ou _software_.

### Múltiplas Interfaces

$\quad$ Existem várias interfaces para gerenciamento do Banco de Dados. Por exemplo: interface gráfica, linha de comando, _drivers_ para acesso via aplicações, etc.

### Redução no Tempo de Desenvolvimento de Aplicações

$\quad$ Como todas as tarefas e responsabilidades referentes ao gerenciamento dos dados ficam por parte do SGBD, o programador fica focado apenas no desenvolvimento da aplicação.

## Os primeiros SGBDs

$\quad$ Os primeiros SGBDs surgiram na década de 60.

$\quad$ Os dados eram organizados em arquivos de registro e os relacionamentos eram descritos por meio de ponteiros.

$\quad$ Dois modelos tiveram destaque na época:
  * Hierárquico: os dados eram estruturados por meio de uma árvore.
  * Redes: os dados tinham uma representação mais livre, sem noção hierárquica.

$\quad$ Eram chamados de Bancos de Dados Navegacionais e foram utilizados na década de 60 até meados da década de 80.

$\quad$ Os problemas dos Bancos de Dados Navegacionais eram:
  * alta complexidade;
  * exigiam muito tempo de treinamento por parte de novos usuários;
  * dificuldade para expressar consultas;

## Modelo Relacional

$\quad$ Proposto por Edgar Codd em 1970, com os primeiros SGBDs relacionais surgindo alguns anos depois.