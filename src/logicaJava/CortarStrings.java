package logicaJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CortarStrings {

    public static void main(String[] args) {

        //Dividir e imprimir as Strings separadas por " "
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("\\Z");
        String a = sc.nextLine().trim();





        if(a.length() >0 && a.length() < 4000) {

            String[] arrayA = a.split("[!,?._'@\\s]+");
            System.out.println(arrayA.length);
           for(String token : arrayA){

               System.out.println(token);

           }
        }
    }
}
