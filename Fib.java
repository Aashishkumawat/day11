package com.bl.day11;

public class Fib {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 1;
        int count = 10;
        System.out.println(num1);
        System.out.println(num2);
//       int num3 = num1+num2;
//        System.out.println(num3);
//        System.out.println(num2+num3);
//        int num4 = num3+num2;
//        System.out.println(num4+num3);
        for(int i=3;i<=count;i++){
            int num3 = num1+num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }

}
