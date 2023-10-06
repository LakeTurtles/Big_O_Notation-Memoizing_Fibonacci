package org.example;

public class FibonacciNaive {
    public int fibFunction(int n){
        if (n <= 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fibFunction(n -1) + fibFunction( n - 2);
        }
    }


//    The code 8 is a recursive Java function that calculates the nth Fibonacci number using a recursive approach.
//    The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones,
//    usually starting with 0 and 1.
//
//    Here's how this code works:
//
//    If the input n is less than or equal to 0, it returns 0 because the Fibonacci sequence starts with 0.
//    If n is equal to 1, it returns 1 because the second number in the Fibonacci sequence is 1.
//    For all other values of n, it calculates the Fibonacci number for n-1 and n-2 recursively and adds them
//    together to find the nth Fibonacci number.
//
//            However, this code has an issue: it's not very efficient. It uses a naive recursive approach,
//            which can lead to a significant amount of redundant calculations. For example, if you calculate
//            fibFunction(5), it will calculate fibFunction(4) and fibFunction(3), and then fibFunction(4) will
//            also calculate fibFunction(3) and fibFunction(2), resulting in redundant calculations.
//


//////////////////////////////////////////////////////////////////////////////////////

    public static int fibFunction(int n, int[] memo) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] != 0) {
            return memo[n];
        } else {
            memo[n] = fibFunction(n - 1, memo) + fibFunction(n - 2, memo);
            return memo[n];
        }
    }

    public static int calculateFibonacci(int n) {
        int[] memo = new int[n + 1];
        int result = fibFunction(n, memo);
        System.out.println("The Fibonacci value in sequence number : " + n + " is = " + result);
        return result;
    }


//    To improve the efficiency of Fibonacci number calculation, you can use memoization or
//    dynamic programming to avoid redundant calculations. This involves storing previously
//    calculated Fibonacci numbers in an array or dictionary to reuse them when needed.


/////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        FibonacciNaive fibonacciNumberInSequenceNumber = new FibonacciNaive();
        int answer = fibonacciNumberInSequenceNumber.fibFunction(11);

        System.out.println("The eleventh Fibonacci number is: " + answer);


//        The 10th Fibonacci Number in the sequence
        int n = 10; // Replace with the desired value of n
        calculateFibonacci(n);
    }

}
