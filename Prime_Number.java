package no2_Loop;

import java.util.Scanner;

public class Prime_Number {
    static int count = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố bạn muốn?");
        int number =  sc.nextInt();

        for (int i = 0; ; i++) {
            int checkNum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    checkNum++;
                }
            }
            if (checkNum == 2) {
                System.out.print(i + " ");
                count++;
                if (count > number) {
                    break;
                }
            }
        }
    }
}
