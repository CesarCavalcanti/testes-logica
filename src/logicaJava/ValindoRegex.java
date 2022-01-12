package logicaJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValindoRegex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String regex = sc.nextLine();

        try {
            Pattern pattern = Pattern.compile(regex);
            System.out.println("Valid");
        }catch (Exception e){
            System.out.println("Invalid");
        }

    }
}
