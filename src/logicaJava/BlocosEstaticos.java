package logicaJava;

import java.util.Scanner;

public class BlocosEstaticos {

    static Scanner input = new Scanner(System.in);
    static boolean flag = true;
    static int B = input.nextInt();
    static int H = input.nextInt();

    static {

        try {

            if( B > 0 && H > 0){
                flag = true;
            }


        }catch (Exception e){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {
        if(flag){
           double media =  B * H;
        }


    }

}
