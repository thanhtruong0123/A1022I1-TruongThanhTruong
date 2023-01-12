package no2_Loop;

import java.util.Scanner;

public class Prime_Number {
    static int count = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố bạn muốn?");
        int number =  sc.nextInt();

        for (int i = 0; ; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    System.out.print(i + ", ");
                    count++;
                    break;
                }
            }
            if (count > number) {
                break;
            }
        }
    }
}
