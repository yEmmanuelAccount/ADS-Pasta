package p3__poo._3introducao_Objeto_e_Classe.exemplo1.model;

public class Professor {
    // atributos
        private String nome;
        private String cpf;
        private String horario;
        private String telefone;
        private float salario;

    // Constructors
    public Professor(String nome, String cpf, String horario, String telefone, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.horario = horario;
        this.telefone = telefone;
        this.salario = salario;
    }
}
