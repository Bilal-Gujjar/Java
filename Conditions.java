package com.Bilal_Gujjar;

public class Conditions {

    public static void main(String[] args) {
	// write your code here
        int salary = 17000;

        if (salary > 100000) {
            salary += 3500;
        }else if(salary > 35000 || salary < 15000){
            salary += 1500;
        }else if( salary > 16500 || salary == 18000){
            salary += 1000;
        }else {
            salary = +5000;
        }

        System.out.println(salary);
    }
}
