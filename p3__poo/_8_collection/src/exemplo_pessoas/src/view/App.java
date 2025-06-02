package view;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import model.*;

public class App {

    public static void main(String[] args) {

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(new Pessoa("111.111.111-01",
                "João", LocalDate.of(2000,6,12)));
        pessoas.add(new Pessoa("333.333.333-03",
                "Maria", LocalDate.of(1999,10,5)));
        pessoas.add(new Pessoa("222.222.222-02",
                "Ana", LocalDate.of(2001,6,2)));

        //COMO fazer
        for(Pessoa p : pessoas) System.out.println(p);

        //O QUE fazer
        pessoas.stream().forEach(System.out::println);

        // pessoa mais velha
            // como fazer
            Class<? extends Set> menorPessoa = pessoas.getClass(); // criação de variável desnecessária
            for (int i = 0; i < pessoas.size(); i++) { // mais chances de erro (vai que não tem nenhuma pessoa)
                if (Boolean.parseBoolean(pessoas.getClass().getName().intern())) {
                    menorPessoa = pessoas.getClass();
                }
            }
            System.out.println(menorPessoa);

            // o que fazer
            System.out.println(pessoas.stream().min(Comparator.comparing(Pessoa::getNascimento)));

        // com Set
        Set<Pessoa> pessoasSet = pessoas.stream().collect(Collectors.toSet());
        System.out.println(pessoasSet);

        // se fosse um "Set<Pessoa> pessoas = new HashSet<>();"
        // List<Pessoa> pessoasList = pessoas.stream().collect(Collectors.toSet());
        // transformar em List para ser mais fácil de manipular

        // verificando se há alguém menor de idade na lista de pessoas
        System.out.println(pessoas.stream().anyMatch(
                p -> p.getIdade()<18
        ));

        // verificando se TODOS são maiores de idade
        System.out.println(pessoas.stream().allMatch(
                p -> p.getIdade()>18
        ));

        // pegando um fluxo, fazendo uma modificação e retornando um novo fluxo
            // retirando as pessoas menores de idade do Set, obtendo uma lista apenas com as pessoas meiores de idade
            List<Pessoa> pessoasListaMaior = pessoas.stream().filter(p -> p.getIdade()>18).collect(Collectors.toList());
            System.out.println(pessoasListaMaior);

            // mapeando as pessoas
        pessoas.stream().map(p -> p.getIdade())
                .sorted().forEach(System.out::println);
    }

}