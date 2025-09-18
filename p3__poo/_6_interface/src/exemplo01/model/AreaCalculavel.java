package exemplo01.model;

public interface AreaCalculavel {
    double calcularArea();
    default void desenhar() {
        System.out.println("Desenhou a área calculada.");
    }
}
