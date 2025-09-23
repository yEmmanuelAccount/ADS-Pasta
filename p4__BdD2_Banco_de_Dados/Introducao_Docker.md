# Docker

## Ideia

$\quad$ A ideia é que toda a aplicação esteja em um único local e quando o produto for entregue, todas as dependências irão junto.

## Diferença entre DOCKER e Máquina Virtual

$\quad$ 

## Comandos

* docker ps: lista todos os containers presentes no PC
* docker ps -a: lista dos containers, incluindo os que não estão ativos
* docker start [*nome_container*]: inicia um container
* docker stop [*nome_container*]: para um container
* docker run [*nome_container*]: cria um container
* docker rm [*nome_container*] ou [*nome_rede*]: remove um container
* docker network ls: lista as redes criadas
* docker network inspect [*nome_rede*]: inspeciona as informações de uma rede
* docker start *postgres* -P 5432: 5432 --> coloca a porta do container na porta da máquina, assim, as coisas serão feitas diretamente no docker e não na máquina

## Fazendo o Postgres rodar no DOCKER

$\quad$ Criando a rede
```
docker network create postgres-network
```
$\quad$ Criando o container

```
docker run --name postgres --network postgres-network -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres

* nome: postgres
* senha: postgres
* -p: sincronizando as portas (PC->Container)
* -d:  
```

$\quad$ Abrindo o pSQL

```
docker run -it --rm --network postgres-network postgres psql -h postgres -U postgres
```

## Baixando o PgAdmin4

$\quad$ Clonando a imagem

```
docker pull dpage/pgadmin4
```

$\quad$ Criando a conta do PgAdmin4

```
docker run --name pgadmin4 --network postgres-network -e PGADMIN_DEFAULT_EMAIL=emmanuel.florencio@academico.ifpb.edu.br -e PGADMIN_DEFAULT_PASSWORD=postgres -p 15432:80 -d dpage/pgadmin4
```
