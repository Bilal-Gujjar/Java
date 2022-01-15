package com.Bilal_Gujjar;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter the Operate :");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op =='/' || op == '%'){
                System.out.print("Enter the Two Number :");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(op == '+'){
                    ans = num1+num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '/'){
                    ans = num1/num2;
                }
                if(op == '%'){
                    ans = num1%num2;
                }
            }else if (op == 'x' || op =='X'){
                break;
            }else {
                System.out.println("Invalid Operations!!!");
            }
            System.out.println(ans);
        }

        }
    }
