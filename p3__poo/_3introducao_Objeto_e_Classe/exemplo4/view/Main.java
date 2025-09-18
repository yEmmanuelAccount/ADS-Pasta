package p3__poo._3introducao_Objeto_e_Classe.exemplo4.view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate nascimento = LocalDate.of(2005, 8, 18);

        System.out.println(Period.between(nascimento, LocalDate.now()).getYears());
    }
}
