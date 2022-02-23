package exercise1;
import java.util.Scanner;

public class CFG {

        static int MAX = 1000;

        // Create an array for memoization
        static int []f = new int[MAX];

        // Returns n'th Fibonacci number using table f[]
        static int fib(int n)
        {

            // Base cases
            if (n == 0)
                return 0;
            if (n == 1 || n == 2)
                return (f[n] = 1);

            // If fib(n) is already computed
            if (f[n]>0)
                return f[n];

            int k = ((n & 1)>0)? (n+1)/2 : n/2;

            // Applying above formula [Note value n&1 is 1
            // if n is odd, else 0].
            f[n] = (n & 1)>0? (fib(k)*fib(k) + fib(k-1)*fib(k-1))
                    : (2*fib(k-1) + fib(k))*fib(k);

            return f[n];
        }

        // Computes value of first Fibonacci numbers
        static int calculateSum(int n)
        {
            return fib(n+2) - 1;
        }

        // Driver program to test above function
        public static void main(String[] args)
        {
            int n = 4;
            System.out.print("Sum of Fibonacci numbers is : "
                    + calculateSum(n) +"\n");
        }
    }


