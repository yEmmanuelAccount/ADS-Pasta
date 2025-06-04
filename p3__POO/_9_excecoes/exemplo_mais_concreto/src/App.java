// importando dependências
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
        try{
            lerArquivo("teste.txt");
        }catch (FileNotFoundException ex){
            System.out.println("Arquivo não encontrado");
        }
    }

    private static void lerArquivo(String file) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(
                new FileReader(file)
        );
    }
}