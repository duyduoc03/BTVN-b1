package com.company;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("4. Nhập 2 số nguyên, tìm ước chung lớn nhất và bội chung nhỏ nhất của 2 số đó.");
        int x, y, i;
        System.out.println("\nNhập số nguyên x=");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập số nguyên y=");
        y = sc.nextInt();
        for (i = x, i = y; i > 0; i--){
            if (x % i == 0 && y % i == 0){
                System.out.println("Ước chung lớn nhất là: " +i);
                break;
            }
        }
        for (i = x, i = y; i <= x * y; i++){
            if (i % x == 0 && i % y == 0){
                System.out.println("Bội chung nhỏ nhất là: " +i);
                break;
            }
        }
    }
}
