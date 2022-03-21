package com.Bilal_Gujjar;


// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int[] num ={23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        boolean ansboolean = linerSearchbool(num ,target);
        int ansindex = linerSearch(num ,target);
        int anselement = linerSearchElement(num ,target);
        System.out.println(ansboolean);
        System.out.println(ansindex);
        System.out.println(anselement);
    }
//Liner Search Basic Problems Pattern to find index value
    static int linerSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i =0; i <arr.length;i++){
            int element = arr[i];
            if (element == target){
                return i ;
                //We can get index just replacing the element to i
            }
        }
    return -1;
    }
//Liner Search Basic Problems Pattern to find Element
    static int linerSearchElement(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int element:arr){
            if (element == target){
                return element  ;
                //We can get index just replacing the element to i
            }
        }
    return Integer.MAX_VALUE;
    }
//Liner Search Basic Problems Pattern to find Boolean 
      static boolean linerSearchbool(int[] arr,int target){
        if (arr.length == 0){
            return false;
        }
        for (int i =0; i <arr.length;i++){
            int element = arr[i];
            if (element == target){
                return true ;
                //We can get index just replacing the element to i
            }
        }
    return false;
    }
}
