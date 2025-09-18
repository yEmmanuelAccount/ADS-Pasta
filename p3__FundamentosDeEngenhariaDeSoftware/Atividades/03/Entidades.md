# Entidades

## Custodiante

* [ ] nome
* [ ] endereço
  * [ ] país
  * [ ] estado
  * [ ] cidade
  * [ ] região
  * [ ] bairro
  * [ ] rua
  * [ ] número
* [x] id
* [ ] tipo (privado ou público)
* [ ] plano
* [ ] entidade

## Museu

* Especialização de Custodiante

* [x] CNPJ
* [ ] HorárioVisitas

## Acervo Pessoal

* Especialização de Custodiante

* [ ] CPF
* [ ] NomeResponsável
* [ ] Contato

## Usuário

* [x] ID
* [x] Email
* [ ] Senha
  
## Seção

* [ ] Nome

## Itens

* [ ] Nome
* [x] ID
* [ ] Categoria
* [ ] Descrição
* [ ] Data

# Relacionamentos

## [Custodiante](#custodiante)

* é procurado por [USUÁRIO](#usuário)
* tem [SEÇÃO](#seção)

## [Seção](#seção)

* tem [ITENS](#itens)