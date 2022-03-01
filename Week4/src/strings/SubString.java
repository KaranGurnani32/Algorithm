package strings;

import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {
        String s = new String("Hello My name is Sachin Tendulkar");
        System.out.println(s);
        System.out.println(s.substring(6));
        System.out.println(s.substring(0,6));

        String[] sentence = s.split("\\.");
        System.out.println(Arrays.toString(sentence));
        System.out.println(s.trim());

        //value of method
        int a = 10;
        String s2 = String.valueOf(a);
        System.out.println(s2+10);

        //replace method
        String replaceString = s.replace("Hello", "Jello");
        System.out.println(replaceString);

        //contains method - case sensitive
        boolean containsmethod = s.contains("Name");
        System.out.println(containsmethod);

        //ends with
        String name = "Karan";
        boolean end = name.endsWith("n");
        System.out.println(end);

        //split method
        String[] split = s.split("\\s", 7); //based on space split
        System.out.println(Arrays.toString(split));
    }
}
