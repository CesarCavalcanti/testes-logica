import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuebrandoRecordes {

//    Maria joga basquete universitário e quer se tornar profissional.
//    Cada temporada ela mantém um registro de seu jogo. Ela tabula o número de vezes que quebra o recorde da temporada de mais e menos pontos em um jogo.
//    Os pontos marcados no primeiro jogo estabelecem seu recorde para a temporada, e ela começa a contar a partir daí.

    public static void main(String[] args) {

        List<Integer> pontos = Arrays.asList(10,5,20,20,4,5,2,25,1);

        int maxInit = pontos.get(0);
        int minInit = pontos.get(0);
        List<Integer> results = new ArrayList<>();
        results.add(0);results.add(0);


        for(int i =0; i < pontos.size();i++){
            if(pontos.get(i) >= 0){
                if(pontos.get(i) > maxInit){
                    maxInit = pontos.get(i);
                    results.set(0, results.get(0) + 1);
                }
                if(pontos.get(i) < minInit){
                    minInit = pontos.get(i);
                    results.set(1, results.get(1) + 1);
                }
            }
        }

        System.out.println(results.get(0) + " " + results.get(1));

    }
}
