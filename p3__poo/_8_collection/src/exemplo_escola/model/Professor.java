package exemplo_escola.model;

public class Professor {
    // atributos
    private String cpf;
    private String nome;
    private float salario;
    public String getCpf() {
        return cpf;
    }

    // getters e setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
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

    // constructor
    public Professor(String cpf, String nome, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    // to string
    @Override
    public String toString() {
        return "Professor [cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + "]";
    }

    
}
