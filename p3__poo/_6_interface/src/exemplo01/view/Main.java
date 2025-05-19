package exemplo01.view;

import exemplo01.model.AreaCalculavel;
import exemplo01.model.Circulo;
import exemplo01.model.Quadrado;

public class Main {
    public static void main(String[] args) {
        AreaCalculavel area1 = new Quadrado(2);
        AreaCalculavel area2 = new Circulo(2);

        System.out.println(area1.calcularArea());
        System.out.println(area2.calcularArea());

        area1.desenhar(); // tem Override
        area2.desenhar();
    }
}
