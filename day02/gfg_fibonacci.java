package day02;

import java.util.Scanner;

public class gfg_fibonacci {

    static int fib(int N) {
        // code here
        if(N==0) return 0;
        int a = 1;
        int b = 1;
        if(N==1 || N==2){
            return 1;
        }
        for(int i = 2;i<N;i++){
            int c = (a + b) % 10;
            a = b;
            b = c;
        }
        return b;
        
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.err.println("Please Enter your number");
    int n = sc.nextInt();
    int result = fib(n);
    System.out.println(result);
}
}
