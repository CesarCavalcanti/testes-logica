import java.util.Arrays;

public class MaioreMenor {
    public static void main(String[] args) {
        String numeros = "-10 -2 3 4 5";



       String [] array = numeros.split(" ");

        int maior = Integer.valueOf(array[0]);
        int menor =Integer.valueOf(array[0]);

        for (int i = 0; i < array.length;i++){
            if(Integer.valueOf(array[i]) > maior){
                maior = Integer.valueOf(array[i]);
            }
            if (Integer.valueOf(array[i]) < menor){
                menor = Integer.valueOf(array[i]);
            }
        }


        System.out.println(String.valueOf(menor) + " " + String.valueOf(maior));
    }
}
