package p3__poo._3introducao_poo.exemplo2.model;

public class Escola {
    // criação de atributos
    private int cnpj;
    private String nome;
    private Endereco endereco;

    // construtor da classe
    public Escola (int cnpj, String nome, Endereco endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }

    // administração da classe
        // cnpj
            public int getCnpj() {
                return cnpj;
            }

            public void setCnpj (int cnpj) {
                this.cnpj = cnpj;
            }
        
        // nome
            public String getNome() {
                return nome;
            }

            public void setNome (String nome) {
                this.nome = nome;
            }

        // endereço
            public Endereco getEndereco() {
                return endereco;
            }

            public void setEndereco (Endereco endereco) {
                this.endereco = endereco;
            }
} 
