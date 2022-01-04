public class ContandoOvelhas {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        int soma = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i] == true){
                soma += 1;
            }

        }

        System.out.println(soma);
    }
}
