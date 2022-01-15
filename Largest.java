package com.Bilal_Gujjar;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        int a = enter.nextInt();
        int b = enter.nextInt();
        int c = enter.nextInt();

//        int max = a;
//        if (b>max){
//            max = b;
//        }
//        if(c> max){
//            max = c;
//        }
//        int max = 0;
//
//        if(a>b){
//            max = b;
//        }else {
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
    int max = Math.max(c,Math.max(a,b));

        System.out.println(max);
    }
}
