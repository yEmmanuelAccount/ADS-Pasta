import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String texto = "A casa branca estava cheia de flores rosas " + "e a luz solar entrava pelas janelas iluminando " + "até que o céu foi tomado por nuvens negras";

        Arrays.stream(texto.toUpperCase().split(" "))
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
