package Telusco;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print a number");
        int number = sc.nextInt();
        int sum[] = new int[33];
        int i = 32;
        while (number > 0) {
            sum[i] = number % 2;
            number = number / 2;
            i=i-1;
        }
        System.out.println("Binary of your number is: ");
        for (int k = 0; k < 33; k++) {
            System.out.print(sum[k]);
        }
        // System.out.println("\n"+i);
        sc.close();
    }
}
