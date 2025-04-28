package p3__poo._4_array.explicacao.view;

public class Main {
    public static void main(String[] args) {
        int array[] = {10, 8, 7, 3, 6, 4};

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(int i: array) {
            System.out.println(i);
            i++;
        }
    }
}
