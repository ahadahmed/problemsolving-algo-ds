package com.maico.dynamicprogramming.educative;

/**
 * @author ahadahmed - 16/11/20
 * @see <a href="#"> see this</a>
 */
public class FibonacciNumber {

    public static void main(String[] args) {

        int n = 7;
        System.out.println(n +"th fib number is : "+ fibonacciTopDown(n));
        System.out.println(n +"th fib number is : "+calculateFibonacciNonRecursive(n));

    }


    public static int fibonacciTopDown(int n){
        int[] memory = new int[n+1];
        return calculateFibonacci(memory, n);
    }

    private static int calculateFibonacci(int[] memory, int n) {

        if(n < 2){
            return n;
        }

        if(memory[n] != 0){
            return memory[n];
        }
        int i = calculateFibonacci(memory,n-1);
        int j= calculateFibonacci(memory, n - 2);
        memory[n] = i+j;

        return memory[n];
    }




    private static int calculateFibonacciNonRecursive(int n) {

        int[] memo = new int[n];

        memo[0] =1;
        memo[1] =1;
        for(int i=2; i<n; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }

        return memo[n-1];
    }

}
