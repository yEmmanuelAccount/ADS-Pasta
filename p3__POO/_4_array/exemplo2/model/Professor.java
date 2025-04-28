package p3__poo._4_array.exemplo2.model;

public class Professor {
    // atributos
    private String nome;
    private float salario;

    // constructor
    public Professor(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    // administração de atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
}
