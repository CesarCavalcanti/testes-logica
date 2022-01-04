import java.util.Arrays;
import java.util.List;

public class ContandoFrutas {
//    A casa de Sam tem uma macieira e uma laranjeira que dão uma abundância de frutas. Usando as informações fornecidas abaixo, determine o número de maçãs e laranjas que caem na casa de Sam.
//
//    No diagrama abaixo:
//
//    A região vermelha denota a casa, onde  é o ponto de partida, e é o ponto final. A macieira fica à esquerda da casa e a laranjeira à direita.
//    Suponha que as árvores estejam localizadas em um único ponto, onde a macieira está no ponto , e a laranjeira está no ponto .
//    Quando uma fruta cai de sua árvore, ela pousa  unidades de distância de sua árvore de origem ao longo do -eixo.
//    * Um valor negativo de significa que a fruta caiu  unidades à esquerda da árvore, e um valor positivo de  significa que cai unidades à direita da árvore. *

    public static void main(String[] args) {

        int s = 7;
        int t = 10;
        int a = 4;
        int b = 12;
        int maxApples = 0;
        int maxOranges= 0;

        List<Integer> apples = Arrays.asList(2,3,-4);
        List<Integer> oranges = Arrays.asList(3,-2,-4);

        for(int i =0;i < apples.size();i++){
            int distancia = a + apples.get(i);
            if(distancia >= s && distancia <= t){
                maxApples += 1;
            }
        }
        for(int i =0;i < oranges.size();i++){
            int distancia = b + oranges.get(i);
            if(distancia <= t && distancia >= s ){
                maxOranges += 1;
            }
        }

        System.out.println(maxApples);
        System.out.println(maxOranges);
    }
}
