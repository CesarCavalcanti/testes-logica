package logicaJava;

public class Strings {

    public static void main(String[] args) {

        String a = "Abc";
        String b = "Dfg";

        // 1º Some os comprimentos das duas Strings

        int result = a.length() + b.length();
        System.out.println(result);
        //2º Compare as duas strings e veja qual é lexicograficamente maior
        if(a.compareTo(b) < 0){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }

        //3º Coloque a primeira letra maiuscula em ambas strings

        System.out.println(a.substring(0,1).toUpperCase().concat(a.substring(1))+" " + b.substring(0,1).toUpperCase().concat(b.substring(1)));
    }
}
