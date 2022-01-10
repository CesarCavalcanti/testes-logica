package logicaJava;

import java.util.Arrays;

public class Anagramas {

    public static void main(String[] args) {

        //Comparar duas Strings e verifiar se as mesmas possuem a mesma quantidade de letras iguais.

        String a = "arara";
        String b = "raraa";

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        a = String.valueOf(charA);
        b = String.valueOf(charB);
        if(a.equalsIgnoreCase(b)){
            System.out.println("Anagramas");
        }else{
            System.out.println("Não são anagramas");
        }
    }
}
