package com.company;

import java.util.Scanner;

public class bai3 {
    public static boolean checkNT(int n){
        if (n<2) return false;
        if (n<4) return true;
        for (int i =2;i<=n/2;i++){
            if (n%i==0) return false;
        }
        return true;
    }
    public static boolean checkFB(int n) {
        int f0 = 0, f1 = 1, f2;
        int[] fn = new int[10];
        for (int i = 0; i < 10; i++){
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            fn[i] = f2;
        }
        for (int i = 0; i < 10; i++){
            if (n == fn[i]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("3. Nhập mảng 10 số nguyên, tìm các số nguyên tố và số thuộc dãy Fibonaci có trong mảng.");
        int[] arr = new int[10];
        int f0 = 0, f1 = 1, fn;
        System.out.println("\nNhập 10 số nguyên: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Các số nguyên tố có trong mảng là:");
        for (int i = 0; i < 10; i++){
            if (checkNT(arr[i]) == true){
                System.out.println("\t\t\t\t\t\t\t\t\t"+arr[i]);
            }
        }
        System.out.println("Các số có trong dãy fibonaci của mảng là:");
        for (int i = 0; i < 10; i++){
            if (checkFB(arr[i]) == true){
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+arr[i]);
            }
        }
    }
}
