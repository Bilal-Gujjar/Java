package com.Bilal_Gujjar;

public class ReverserNumber {
    public static void main(String[] args) {
       int n = 123456789;
       int newNumber = 0;
       while (n > 0){
           int rem = n % 10;
           n /= 10;
           newNumber = newNumber * 10 + rem;
       }
        System.out.println(newNumber);
        }
    }

