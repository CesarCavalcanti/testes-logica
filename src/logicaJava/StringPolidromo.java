package logicaJava;

public class StringPolidromo {

    //Descubrir se uma String é igual de trás para frente como -> arara

    public static void main(String[] args) {

        String a = "ssaaw";
        StringBuilder sb = new StringBuilder(a);

        if(a.equals(sb.reverse().toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
