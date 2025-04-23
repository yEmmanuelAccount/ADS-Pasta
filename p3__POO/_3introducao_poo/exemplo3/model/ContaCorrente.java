package p3__poo._3introducao_poo.exemplo3.model;

public class ContaCorrente {
    // criação de atributos
        private int numero;
        private String titular;
        private float saldo;
    
    // construtor da classe
    public ContaCorrente (int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    // operações da conta
        // depósito
            public boolean depositar (float valor) {
                // verificando restrições
                if (valor > 10000) return false;
                if (valor < 0) return false;

                // atualização do valor
                saldo = saldo + valor;

                // finalizando operação
                return true;
            }
        
        // saque
            public boolean sacar (float valor) {
                // verificando restrções
                if (valor <= 0) return false;
                if (valor >= 1000) return false;
                if (valor > saldo) return false;

                // atualização do valor
                saldo = saldo - valor;

                // finalizando operação
                return true;
            }

        // transferência
            public boolean transferir (ContaCorrente destino, float valor) {
                // verificando restrições
                if (valor > 10000) return false;
                if (valor > saldo) return false;
                if (valor <= 0) return false;

                // atualização do valor
                saldo = saldo - valor; // retirando valor a conta Origem
                destino.saldo = saldo + valor; // adicionando valor na conta Destino

                // finalizando operação
                return true;
            }

    // administração da classe
        // numero
            public int getNumero() {
                return numero;
            }

            public void setNumero (int numero) {
                this.numero = numero;
            }
        
        // titular
            public String getTitular() {
                return titular;
            }

            public void setTitular (String titular) {
                this.titular = titular;
            }
        
        // saldo
            public float getSaldo() {
                return saldo;
            }

            public void setSaldo (float saldo) {
                this.saldo = saldo;
            }
}
