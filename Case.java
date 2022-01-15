package com.Bilal_Gujjar;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        char alp =enter.next().trim().charAt(0);

        if(alp >= 'a' && alp <= 'z'){
            System.out.println("LoweCase");
        }else {
            System.out.println("UpperCase");
        }
    }
}
