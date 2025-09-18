# Interfaces

## Introdução

- define como _coisas_, _pessoas_ e _sistemas_ podem interagir
- define **_o que_** pode ser feito, não **_como_** deve ser feito
- métodos de um objeto em Java: são suas interfaces com o mundo exterior

## Interface

- objetos podem se comunicar por interfaces
- classes **_não relacionadas_** podem implementar vários métodos em comum
- é possível implementar o comportamento polimórfico, mas sem gerar um acoplamento tão alto, como na _Herança_. (**É UM**)
- exemplificação

    $\quad$ Um exemplo básico são _aviões_ e _pássaros_. Ambos realizam o mesmo serviço (voar), mas não são relacionadas.

    $\quad$ Não faz sentido utilizar uma _herança_ somente porque os dois voam, pois são muito diferentes.

- Contratos (analogia)

    $\quad$ As interfaces são contratos que especificam implementações que devem ser cumpridas.

    $\quad$ Ou a classe implementa todos os métodos do _contrato_ ou se declara **_abstrata_**.