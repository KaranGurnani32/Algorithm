package strings;

public class Concat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Javatpoint";
        String str3 = "Reader";

        // Concatenating one string
        String str4 = str1.concat(str2);
        System.out.println(str4);

        // Concatenating multiple strings
        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);

        String str6 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println(str6);

        String str7 = str1.concat("@").concat(str2).concat("!!").concat(str3);
        System.out.println(str7);

        String str8 = "Welcome to ".concat(str2);
        System.out.println(str8);
    }
}
