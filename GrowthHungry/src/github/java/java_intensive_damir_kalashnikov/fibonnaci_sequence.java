package java_intensive_damir_kalashnikov;

import java.util.HashMap;

public class fibonnaci_sequence {
    /* HW - week 1
The Fibonacci sequence can be defined using a recurrence relation:
F(n) = F(n-1) + F(n-2)
F(0) = 0
F(1) = 1
Write Java program that computes Nth Fibonacci number.
 */
    private static long[] fibonnaciCache;
    public static void main(String[] args) {
        int n = 100;
        fibonnaciCache = new long[n + 1];

        for (int i =0; i <=n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    private static long fibonacci (int n){
        if (n<=1){
            return n;
        }
         if (fibonnaciCache[n] != 0)   {
            return fibonnaciCache[n];
         }

         long nthFibonnaciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonnaciCache[n] = nthFibonnaciNumber;
        return nthFibonnaciNumber;
        }

}
