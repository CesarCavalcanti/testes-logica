import java.util.ArrayList;
import java.util.List;

public class ComparandoListas {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);


        List<Integer> l2 = new ArrayList<>();
        l2.add(7);l2.add(8);l2.add(9);

        List<Integer> resultado = new ArrayList<>();

        resultado.add(0);
        resultado.add(0);

        for (int i =0; i < l1.size(); i++){
                if (l1.get(i) > l2.get(i)){
                    resultado.set(0, resultado.get(0) + 1);
                }
                else if (l1.get(i) < l2.get(i)){
                    resultado.set(1, resultado.get(1) + 1);
                }

        }

      resultado.forEach(r -> System.out.println(r));

    }
}
