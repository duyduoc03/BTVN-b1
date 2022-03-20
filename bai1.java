package com.company;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("1. Nhập 1 số nguyên n, kiểm tra nó có phải số hoàn hảo hay không.");
        int n, total = 0;
        System.out.println("\nNhập số nguyên n=");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n / 2; j++) {
                if (i * j == n) total = total + j;
            }
        }
        if (total == n) System.out.println("\t\tSố " +n+ " là số hoàn hảo");
        else System.out.println("\t\tSố " +n+ " không phải là số hoàn hảo");
    }
}
