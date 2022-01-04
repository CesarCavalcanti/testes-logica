package logicaJava;

import java.text.NumberFormat;
import java.util.Locale;

public class Cambio {

    public static void main(String[] args) {

        double payment = 12324.134;

        String USA = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String FRA = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String CHI = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String IND = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);


        System.out.println(USA);System.out.println(FRA);System.out.println(CHI);System.out.println(IND);
    }
}
