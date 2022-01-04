package logicaJava;

import java.util.Arrays;
import java.util.List;

public class AdicaoSimples {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);



            System.out.println(list.stream().reduce(0,(x,y) -> x + y));



    }

}
