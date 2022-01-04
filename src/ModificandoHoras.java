import java.util.Arrays;
import java.util.stream.Collectors;

public class ModificandoHoras {

    //    Dado um tempo em formato AM / PM hora , converte para o horário militar (24 horas).
//    Nota: - 12:00:00 AM em um relógio de 12 horas é 00:00:00 em um relógio de 24 horas.
//    - 12h00 em um relógio de 12 horas é 12h00 em um relógio de 24 horas.
    public static void main(String[] args) {

        //Primeiro método encontrado
        String relogio = "12:54:54PM";
//        String horas[] = relogio.split(":");
//
//        if(relogio.contains("PM")){
//
//            int hora = Integer.valueOf(horas[0]) + 12;
//            horas[0] = String.valueOf(hora);
//
//            relogio = Arrays.stream(horas).collect(Collectors.joining());
//        }
        //Segundo método encontrado
        int hr = 0;
        String result;
        if(relogio.contains("PM")){
           hr = Integer.valueOf(relogio.substring(0,2) );
           if(hr < 12){
               hr += 12;
               result = relogio.replace(relogio.substring(0,2),String.valueOf(hr)).replaceAll("PM","");

           }else{
               result = relogio.replaceAll("PM","");
           }

       }else{
           hr = Integer.valueOf(relogio.substring(0,2));
           if(hr == 12){

               result = relogio.replace(relogio.substring(0,2),"00");
           }else{
               result = relogio.replaceAll("AM","");
           }

       }

        System.out.println(result);



    }
}