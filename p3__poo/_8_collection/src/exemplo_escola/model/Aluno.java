package exemplo_escola.model;

public class Aluno {
    // atributos
    private String cpf;
    private String nome;
    private int matricula;
    
    // getters e setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // constructor
    public Aluno(String cpf, String nome, int matricula) {
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
    }
    
    // to string
    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", nome=" + nome + ", matricula=" + matricula + "]";
    }

    
}
