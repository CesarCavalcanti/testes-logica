import java.util.ArrayList;
import java.util.List;

public class Emojis {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();


        arr.add(":)"); arr.add(":)"); arr.add("x-]"); arr.add(":ox"); arr.add(";-("); arr.add(";-)"); arr.add(";~("); arr.add(":~D");

        int numeros = 0;
        if (arr.size() != 0){
            for (int i = 0; i< arr.size(); i++){
                    if (arr.get(i).equals(":)") || arr.get(i).equals(":-)")|| arr.get(i).equals(":~)")|| arr.get(i).equals(";-)")|| arr.get(i).equals(";~)")|| arr.get(i).equals(";)")){
                        numeros+= 1;
                    }

                    else if (arr.get(i).equals(":D")|| arr.get(i).equals(":-D")|| arr.get(i).equals(":~D")
                        || arr.get(i).equals(";D")|| arr.get(i).equals(";-D")|| arr.get(i).equals(";~D"))  {
                        numeros+=1;
                    }
                    
            }
        }
        System.out.println(numeros);
    }
}
