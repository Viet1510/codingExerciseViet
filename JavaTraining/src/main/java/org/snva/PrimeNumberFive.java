package org.snva;

public class PrimeNumberFive {

    static public boolean Isprime(int n){
       // System.out.println(n);
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;

    }
}