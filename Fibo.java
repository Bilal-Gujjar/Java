package com.Bilal_Gujjar;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int p = 0;
        int i = 1;

        int count = 2;
        while (count <= n){
            int temp = i;

            i = i +p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
