import java.util.ArrayList;
import java.util.List;

public class ArredondandoNotas {
//    A HackerLand University tem a seguinte política de avaliação:
//
//    Cada aluno recebe um  na faixa inclusiva de  para .
//    Qualquer  Menor que  é uma nota de reprovação.
//    Sam é um professor da universidade e gosta de acompanhar cada aluno  de acordo com estas regras:
//
//    Se a diferença entre o  e o próximo múltiplo de  é menos do que , arredondar  até o próximo múltiplo de .
//    Se o valor de  é menos do que , nenhum arredondamento ocorre, pois o resultado ainda será uma nota de reprovação.

    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(73);grades.add(67);grades.add(38);grades.add(33);
        int resto = 0;

        if(grades.size() >= 1 && grades.size() <= 60){
            for (int i = 0; i < grades.size() ; i++){
                if(grades.get(i) >= 0 && grades.get(i) <= 100 && grades.get(i) >= 38){
                    resto = grades.get(i) % 5;
                    if(resto > 2) {
                        if (((grades.get(i) - resto) + 5) % 5 == 0) {
                            grades.set(i, (grades.get(i) - resto) + 5);
                        }
                    }
                }
            }
        }

        for (Integer result: grades){
            System.out.println(result);
        }

    }
}
