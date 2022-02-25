package strings;

import java.util.ArrayList;

public class CharAt {
    public static void main(String[] args) {
        String name = "javatpoint";

        char ch = name.charAt(4);
        System.out.println(ch);
        System.out.println("Character length at 0 index is " + name.charAt(0));
        System.out.println("Character length at last index is " + name.charAt(name.length() - 1));

        String str = "Welcome to Javatpoint portal";
        //Print characters at odd position
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.println("Char at " + i + " place " + str.charAt(i));
            }

        }
        int n = 1 % 2;
        System.out.println("1 % 2 is : " + n);

        //counting frequency of a character
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 't') {
                count++;
            }
        }
        System.out.println("T is coming " + count + " times");

        CharAtExample6 chr = new CharAtExample6();
        System.out.println(chr.isVowel('r'));

        System.out.println(chr.countVowels(str));
    }
}

class CharAtExample6 {
    ArrayList<Character> al;

    public CharAtExample6() {
        al = new ArrayList<Character>();
        al.add('A');al.add('E');
        al.add('a');al.add('e');
        al.add('I');al.add('O');
        al.add('i');al.add('o');
        al.add('U');al.add('u');

    }

    //method to check ch is vowel or not
    public boolean isVowel(char c) {
        for (int i = 0; i < al.size(); i++) {
            if (c == al.get(i)) {
                return true;
            }
        }
        return false;
    }

    public int countVowels(String s) {
        int countVowel = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                countVowel++;
            }
        }
        return countVowel;
    }
}
