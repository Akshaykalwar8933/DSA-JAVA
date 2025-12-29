package day03;

import java.util.Scanner;

public class leetcodeProblem {

    public static boolean completePrime(int num) {

        String s = String.valueOf(num);
        int n = s.length();

        // Prefix check
        for (int i = 1; i <= n; i++) {
            int prefix = Integer.parseInt(s.substring(0, i));
            if (!isPrime(prefix)) {
                return false;
            }
        }

        // Suffix check
        for (int i = 0; i < n; i++) {
            int suffix = Integer.parseInt(s.substring(i));
            if (!isPrime(suffix)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean checkPrime = completePrime(n);

        if (checkPrime) {
            System.out.println(n + " is a Complete Prime");
        } else {
            System.out.println(n + " is NOT a Complete Prime");
        }

        sc.close();
    }
}
