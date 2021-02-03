package com.LeogenWP.JavaCore.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(9));

        NumericTest isPositive = (n) -> n > 0;
        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(0));
    }
}

interface NumericTest {
    boolean test(int n);
}

