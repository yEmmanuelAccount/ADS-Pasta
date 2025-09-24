# NodeJS

## Verificar se já está instalado na máquina

$\quad$ Para fazer isso basta escrever o comando abaixo no _Terminal_:

```
node -v
```

$\quad$ Aproveite para verificar se o _npm_ já está presente também:

```
npm -v
```

## Instalação

$\quad$ Para instalar o NodeJS, basta entrar no [nodejs.org](nodejs.org) e clicar em **Get Node.js**. Após isso, basta copiar o texto da área _Informação_, algo como:

```(terminal)
# Descarregar e instalar a nvm:
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.40.2/install.sh | bash

# Em vez de reiniciar a concha ou shell
\. "$HOME/.nvm/nvm.sh"

# Descarregar e instalar a Node.js:
nvm install 22

# Consultar a versão da Node.js:
node -v # Deveria imprimir "v22.20.0".
nvm current # Deveria imprimir "v22.20.0".

# Verify the Node.js version:
node -v # Should print "v22.20.0".

# Consultar a versão da npm:
npm -v # Deveria imprimir "10.9.3".
```

$\quad$ Lembre-se de verificar a versão e o sistema que deseja.

$\quad$ Após isso, cole o texto copiado no _Terminal_ da máquina e aguardar a instalação.

## API REST

$\quad$ A sigla API significa Interface de Programação de Aplicação. Já REST significa transferência de estado representacional.

$\quad$ Trata-se de um conjunto de definições e protocolos para integrar aplicações. É equivalente ao *backend* de uma aplicação.

$\quad$ Sabemos apenas **o que** a API faz, não **como** ela faz.

$\quad$ As API REST transferem uma representação do estado do recurso ao solicitante, via HTTP.

$\quad$ Normalmente, o formato JSON é utilizado, mas 

## Criando uma API fake em poucos passos

$\quad$ Crie uma pasta específica para seguir o passo-a-passo a seguir.

1. $\quad$ Instalando o servidor JSON 

```
npm install json-server
```

2. $\quad$ Depois siga o tutorial do [GitHUB json-server](https://github.com/typicode/json-server).

3. $\quad$ Instale o [Insomnia](https://insomnia.rest/download) e rode o comando a seguir na pasta que ele for baixado:

```
sudo dpkg -i Insomnia(tab)
```

$\quad$ Dentro do Insomnia, clique em _New Request_ e digite:

```
GET:      localhost:3000/posts
```

$\quad$ Essa é a porta da aplicação e após a barra são os recursos, que tem por padrão virem no plural. Para pegar apenas o primeiro, basta adicionar outra barra e o ID dele.

$\quad$ A resposta 200 significa que a resposta foi bem sucedida. Já 404 significa not found (não encontrado).

$\quad$ Usando o recurso POST para postar conteúdo, no campo _Body_ e escolhendo a linguagem JSON. Voltando para o nível "posts":

```
{
    "id": "3",
    "title": "Meu novo post",
    "views": 100
}
```

$\quad$ Para deletar o códgo existente, devemos usar a opção DELETE e deve ser usado o ID específico no link:

```
localhost:3000/posts/3
```

$\quad$ Podemos utilizar o PATCH para uma atualização parcial do conteúdo, colocando o ID específico do que se quer editar no link

```
{
    "title": "Novo título"
}
```

$\quad$ Outra forma seria usando PUT para substituir o conteúdo anterior pelo que você colocar:

```
{
    "comments": "Sem comentários"
}
```

## Usando Express

$\quad$ O site oficial é o [ExpressJS](https://expressjs.com/).

$\quad$ O repositório para os códigos da aula [GitHub]().

$\quad$ Para criar um projeto do zero usando NodeJS, digite o comando a seguir e cole no terminal da pasta:

```
npm init -y
```

* $\qquad$ O -y é utilizado para que ele use as informações do computador como padrão, evitando ter que ficar preenchendo informações.

$\quad$ Se o arquivo _package.json não tiver o campo "type" ou tiver algo diferente, coloque:

```
"type": "module"
```
$\quad$ Baixando o Express do projeto

```
npm i express
```

### Fazendo o Hello World