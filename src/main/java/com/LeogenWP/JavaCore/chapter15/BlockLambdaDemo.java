package com.LeogenWP.JavaCore.chapter15;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for(int i = 1; i<= n; i++){
                result = i * result;
            }
            return result;
        };
        System.out.println("factorial 3 is " + factorial.func(3));
        System.out.println("factorial 5 is " + factorial.func(5));
    }
}

interface NumericFunc {
    int func (int n);
}

