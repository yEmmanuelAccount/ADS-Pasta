# Generics (Generalização)

## Explicação

$\quad$ Como exemplo temos um [exemplo escolar](./exemplo_escola), com as classes inciais Professor e Aluno, cada uma possui suas características próprias.

$\quad$ Nesse contexto, a _Generalização_ pode ser usada na parte do cadastro, onde ambas as classes recebem os mesmos parâmetros e tem a mesma estrutura.

$\quad$ Em um projeto grande,  pensando nas partes de manutenção ou adição de elementos, usamos _generalização_ para receber essas diferentes classes e criar um único método de [Cadastro](./exemplo_escola/model/CadastroGeral.java) invés de um específico para cada classe.

## Vantagens

$\quad$ Esse método garante a integridade e a segurança de acesso às classes.