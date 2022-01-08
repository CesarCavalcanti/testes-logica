package logicaJava;

import java.util.Scanner;

public class SubStrings {

    public static void main(String[] args) {

        //Imprimir o intervalo de strings conforme informado na entrada

        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(text.substring(a,b));



        sc.close();
    }
}
