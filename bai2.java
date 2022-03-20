package com.company;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("2. Nhập 1 số nguyên n, tìm số có vị trí thứ n của dãy Fibonaci.");
        int n, f0 = 0, f1 = 1, f2, fn = 1;
        System.out.println("\nNhập số nguyên n=");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            if (fn < f2) fn = f2;
        }
        System.out.println("số có vị trí thứ " +n+ " của dãy Fibonaci là: " +fn);
    }
}
