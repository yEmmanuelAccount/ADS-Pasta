package exemplo01.model;

public class Circulo implements AreaCalculavel, ComprimentoCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*raio;
    }
}
