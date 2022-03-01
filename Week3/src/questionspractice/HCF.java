package questionspractice;

import java.util.Scanner;

public class HCF { // complexity O(n)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first no. ");
        int a = scanner.nextInt();
        System.out.println("Enter second no. ");
        int b = scanner.nextInt();
        int hcf = 0;
        int lcm = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        lcm = (a*b)/hcf;

        System.out.println("HCF is : " + hcf);
        System.out.println("LCM is : " + lcm);
    }
}
