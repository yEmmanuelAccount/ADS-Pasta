<!-- Link do CSS -->
<link rel="stylesheet" href="./../estilos-markdown.css">

<h1 class="bdd2"> Novo Container Docker: PostGis </h1>

<h2 class="bdd2"> Instalação </h2>

[Link oficial do PostGis](postgis.net).

Rode o comando a seguir para baixar as dependências:
```
docker run --name postgis --network postgres-network -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgis/postgis
```

Depois, para ligar o PgAdmin4:
```
docker start pdadmin4
```

Dentro do PgAdmin4, criamos um novo servidor:
1. botão direito em "aula" e registrar novo servidor
2. no campo **geral**
   1. nome: postgis
3. no campo **conexão**
   1. host name/adress: postgis
   2. username: postgres
   3. senha: postgres

<h2 class="bdd2"> Elemento Geométrico PONTO </h2>

No editor de código SQL do servidor **PostGis**:
```
CREATE TABLE exemplo (
    id serial primary key,
    nome varchar(50),
    geometria geometry
)
```

<div class="bdd2"> Sintaxe </div>

* POINT(10 10)
  * as coordenadas são separadas por **espaço**.
  * latitude e longitude são invertidas na hora da inserção.

<div class="bdd2"> Primeira função </div>

Exemplo: Salvando as coordenadas do IF de Cajazeiras:
```
INSERT INTO exemplo (nome, geometria)
    VALUES
        ('IFPB - Cajazeiras', ST_GeomFromText('POINT(-38.5453 -6.8897)', 4326))
```

Para testá-lo, use o comando abaixo. Na tabela resultante, ao clicar no ícone de mapa, é possível ter uma visualização no mapa.
```
SELECT * FROM exemplo
```