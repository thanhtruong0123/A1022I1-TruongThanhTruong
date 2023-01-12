package no3_Array;

import java.util.Scanner;

public class Element_Adding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài Mảng");
        int length = sc.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị mảng tại vị trí " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhập giá trị mới cần chèn vào mảng");
        int newValue = sc.nextInt();

        System.out.println("Nhập vị trí chèn");
        int positions = sc.nextInt();

        System.out.println("Mảng cũ:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        arr[positions] = newValue;

        System.out.println("");

        System.out.println("Mảng mới");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
