package logicaJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(\\d\\d)(\\w)");

        Matcher matcher = pattern.matcher("11a22b33c");

        boolean encontrou = matcher.find();

        if(encontrou) {
            String match = matcher.group();
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);

            int start = matcher.start();
            int end = matcher.end();

            System.out.printf("%s | %s | %s [%d,%d]",match,group1,group2,start,end);

        }

        pattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");

        matcher = pattern.matcher("2007-12-31");

        encontrou = matcher.find();

        if(encontrou) {
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);

            System.out.printf("%s - %s - %s ", group3,group2,group1);

        }

    }
}
