import java.time.LocalDate;
import p3__poo._5_heranca_e_classe_abstrata.model.*;

public class Main {
    public static void main(String[] args) {
        // definindo objetos diretamente
        Aluno aluno = new Aluno("111.111.111-01", "João", LocalDate.now(), 123, "ADS");
        Professor professor = new Professor("222.222.222-02", "Maria", LocalDate.now(), 3000, "Mestrado");

        // definindo objetos pela SuperClasse
        Pessoa pessoa1 = new Aluno("111.111.111-01", "João", LocalDate.now(), 123, "ADS");
        Pessoa pessoa2 = new Professor("222.222.222-02", "Maria", LocalDate.now(), 3000, "Mestrado");

        /* O inverso não funciona
         * Aluno aluno = new Pessoa ("xxx.xxx.xxx-0x", "Abcdefg", LocalDate.now(), hij, "klmnopq");
        */
    }
}
