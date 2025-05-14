package exemplo_formas_geometricas.model;

public class Quadrado extends FormaGeometrica{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea(){
        return Math.pow(lado, 2);
    }

}