package exemplo_formas_geometricas.model;

public class Retangulo extends FormaGeometrica{

    private double ladoa;
    private double ladob;

    public Retangulo(double ladoa, double ladob) {
        this.ladoa = ladoa;
        this.ladob = ladob;
    }

    public double getLadoa() {
        return ladoa;
    }

    public void setLadoa(double ladoa) {
        this.ladoa = ladoa;
    }

    public double getLadob() {
        return ladob;
    }

    public void setLadob(double ladob) {
        this.ladob = ladob;
    }

    @Override
    public double calculaArea(){
        return ladoa*ladob;
    }
}