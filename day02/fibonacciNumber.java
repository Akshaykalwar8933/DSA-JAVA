package day02;

import java.util.Scanner;

public class fibonacciNumber {
    
    public static void PrintFibonacci(int n){
        int first = 0;
        int seceond = 1;
        for(int i = 1;i<=n;i++){
            System.out.println(first);
            int next = first + seceond;
            first = seceond;
            seceond = next;
        }
    }

        public static void main (String []args){
            Scanner scn = new Scanner(System.in);
            System.err.println("Please Enter your number");
            int n = scn.nextInt();

            PrintFibonacci(n);
        }

    }
