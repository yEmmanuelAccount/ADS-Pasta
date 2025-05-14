package exemplo_veiculos.model;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String placa, int cilindradas) {
        super(placa);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularPedagio(){
        return 4.8;
    }

}