import java.util.ArrayList;
import java.util.List;

public class binariodecimal {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(1);
        numeros.add(0);
        numeros.add(1);


        int soma = 0;
        int index = numeros.size();
        for(int i = 0; i< numeros.size();i++){
            index = index - 1;
            soma = (int) (numeros.get(i) * Math.pow(2,index) + soma);
        }

        System.out.println(soma);
    }
}
