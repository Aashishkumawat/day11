package com.bl.day11;

public class PerfactNumber {
    public static boolean check(int number){
        int sum = 1;
        for(int i=2; i*i<=number; i++){
            if(number%i==0) {
                if (i * i != 0)
                    sum = sum + i + number / i;
                else
                    sum = sum + i;
            }
            }
            if(sum==number && number !=1)
                return true;

            return false;
        }
        public static void main (String[] args){

            System.out.println("Perfect numbers between 0-5000:");
            for (int n = 2; n < 5000; n++){
                if (check(n))
                    System.out.println( n +" is a perfect number");
            }
        }
    }



