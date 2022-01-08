package logicaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DividirStrings {

    //Dividir a String em silábas de 3 letras seguidas, o máximo de silábas que conseguir, e depois retornar a maior

    public static void main(String[] args) {

        String s = "welcometojava";
        List<String> list = new ArrayList<>();
        for(int i=0; i < s.length(); i ++){
            if(i < s.length() - 2) {
                list.add(s.substring(i, 3 + i));
            }
        }

        List<String> result = list.stream().sorted().collect(Collectors.toList());

        String menor = result.get(0);
        String maior = result.get(list.size() - 1);

        System.out.println(menor + " / " + maior);


    }
}
