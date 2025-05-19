package exemplo01.model;
import java.io.Serializable; // apenas mostra se um objeto é serializado. basta apenas importar

public class Quadrado implements AreaCalculavel, ComprimentoCalculavel, Serializable {
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
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou a área diferente.");
    }
}
