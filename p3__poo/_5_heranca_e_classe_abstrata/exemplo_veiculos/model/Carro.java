package exemplo_veiculos.model;

public class Carro extends Veiculo{

    private int passageiros;

    public Carro(String placa, int passageiros) {
        super(placa);
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public double calcularPedagio(){
        return 9.6;
    }
}