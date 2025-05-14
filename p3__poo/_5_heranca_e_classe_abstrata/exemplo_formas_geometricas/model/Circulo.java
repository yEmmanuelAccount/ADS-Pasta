package exemplo_formas_geometricas.model;

public class Circulo extends FormaGeometrica{

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
    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }

}