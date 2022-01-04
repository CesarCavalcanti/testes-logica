import java.util.ArrayList;
import java.util.List;

public class MaximoMinimo {

    //Dados cinco inteiros positivos, encontre os valores mínimo e máximo que podem ser calculados somando exatamente quatro dos cinco inteiros.
    // Em seguida, imprima os respectivos valores mínimo e máximo como uma única linha de dois inteiros longos separados por espaço.

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(769082435);arr.add(210437958 );arr.add(673982045 );arr.add(375809214 );arr.add(380564127);

        Long maior = 0L;
        Long menor = 0L;
        Long soma = 0L;
        menor = arr.stream().mapToLong(Integer::longValue).sum();
        for (int i=0;i < arr.size();i++) {
            if(arr.get(i) >= 1 && arr.get(i) < Math.pow(10.0,9.0)){
                soma = arr.stream().mapToLong(Integer::longValue).sum() - arr.get(i);
                if(soma > maior){
                    maior = soma;
                }
                if (soma < menor){
                    menor = soma;
                }
            }
        }
        System.out.println(menor +" " + maior);

    }
}
