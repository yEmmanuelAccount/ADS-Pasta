package exemplo_escola.model;

// importing dependencies
import java.util.Arrays;

public class CadastroGeral <T> {

    private T[] element;
    private int quantity;

    public CadastroGeral() {
        element = (T[]) new Object[10];
        quantity = 0;
    }

    public boolean addElement(T element){
        if(quantity < this.element.length){
            this.element[quantity++] = element;
            return true;
        }
        return false;
    }

    public T[] getElement(){
        return Arrays.copyOfRange(element, 0, quantity);
    }

}







