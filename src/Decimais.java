import java.util.ArrayList;
import java.util.List;

public class Decimais {

    //Given an array of integers, calculate the ratios of its elements
    // that are positive, negative, and zero. Print the decimal
    // value of each fraction on a new line with  places after the decimal.
    //Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(1); arr.add(-1); arr.add(-1); arr.add(0); arr.add(1);

        double positive = 0;
        double negative = 0;
        double nulo = 0;

        for (int i =0; i < arr.size();i++){
            if(arr.get(i) < 0){
                negative+= 1;
            }
            else if (arr.get(i) == 0){
                nulo+=1;
            }else {
                positive += 1;
            }
        }

        System.out.printf("%.5f%n %.5f%n %.5f%n",positive / arr.size(),negative / arr.size(),nulo / arr.size());

    }
}
