package logicaJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Calendarr {
//    A classe Calendar é uma classe abstrata que fornece métodos para converter entre um instante específico no tempo e um conjunto de campos do calendário,
//    como YEAR, MONTH, DAY_OF_MONTH, HOUR e assim por diante, e para manipular os campos do calendário, como obter a data da próxima semana.

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,mes-1);
        calendar.set(Calendar.DAY_OF_MONTH,dia);
        calendar.set(Calendar.YEAR,ano);

        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US).toUpperCase(Locale.ROOT));


    }
}
