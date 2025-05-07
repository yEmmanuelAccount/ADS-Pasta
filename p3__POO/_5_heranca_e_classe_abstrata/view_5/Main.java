package view;

import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario professor = new Professor("222.222.222-02",
                "Maria", LocalDate.now(), 3000,
                Formacao.Mestrado);
        Funcionario tecnico1 = new TecnicoAdministrativo(
                "111.111.111-01", "Pedro", LocalDate.now(),
                2000, "Laboratório de Química"
        );
        Funcionario tecnico2 = new TecnicoAdministrativo(
                "111.111.111-01", "José", LocalDate.now(),
                2000, "Protocolo"
        );

        System.out.println(professor.getSalario());
        System.out.println(tecnico1.getSalario());
        System.out.println(tecnico2.getSalario());


    }
}