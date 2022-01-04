import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VelasDeAniversario {
    //        Você fica encarregado do bolo de aniversário de uma criança.
    //        Você decidiu que o bolo terá uma vela para cada ano de sua idade total.
    //        Eles só serão capazes de apagar as velas mais altas. Conte quantas velas são as mais altas.
    public static void main(String[] args) {

        List<Integer> candles = new ArrayList<>();
        candles.add(4);candles.add(4);candles.add(1);candles.add(3);

        int maior = Collections.max(candles);
        int cont = 0;
        if(candles != null) {
            for (int i = 0; i < candles.size(); i++) {
                if (candles.get(i) >= 1 && candles.get(i) <= Math.pow(10, 7)) {
                    if(candles.get(i) == maior){
                        cont+=1;
                    }


                }
            }
        }

        System.out.println(cont);

    }
}
