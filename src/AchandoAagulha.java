import java.util.Arrays;

public class AchandoAagulha {
    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(findNeedle(haystack1));


    }
    public static String findNeedle(Object[] haystack) {
        int needlePosition = 100;
        for ( int i =0; i< haystack.length; i++){
            if (haystack[i] != null && haystack[i].equals("needle")){
                needlePosition = i;
            }
        }



        return "found the needle at position " + needlePosition;
    }
}
