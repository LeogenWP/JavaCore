package com.LeogenWP.JavaCore.chapter15;

public class LambdaDemo3 {

    public static void main(String[] args) {
        NumericTest2 isFactor = (n,d) -> (n % d) == 0;

        if(isFactor.test(10,2)){
            System.out.println("d is Factor");
        }
    }
}

interface NumericTest2 {
    boolean test (int n, int d);
}
