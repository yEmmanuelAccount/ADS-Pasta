// criando package
package p3__poo._3introducao_Objeto_e_Classe.exemplo2.view;

import p3__poo._3introducao_Objeto_e_Classe.exemplo2.model.*;

public class Main {
    public static void main(String[] args) {
        Escola ifpb = new Escola(123456789, "IFPB", new Endereco("José Antônio da Silva", 300, "58900000"));

        System.out.printf("O endereço do IFPB é "+ifpb);
    }
}
