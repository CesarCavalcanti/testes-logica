import java.util.Arrays;

public class RemoverEspacos {
    public static void main(String[] args) {
        String espacos = " a s d a e s ";

        String resultado = espacos.replaceAll("\\s+","");

        System.out.println(resultado);
    }
}
