package p3__poo._3introducao_poo.exemplo2.model;

public class Endereco {
    // definição de atributos
    private String rua;
    private int numero;
    private String cep;

    // construtor da classe
    public Endereco (String rua, int numero, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    // administração da classe
        // rua
            public String getRua() {
                return rua;
            }
        
            public void setRua (String rua) {
                this.rua = rua;
            }
        
        // numero
            public int getNumero() {
                return numero;
            }

            public void setNumero(int numero) {
                this.numero = numero;
            }
        
        // cep
            public String getCep() {
                return cep;
            }

            public void setCep(String cep) {
                this.cep = cep;
            }
}