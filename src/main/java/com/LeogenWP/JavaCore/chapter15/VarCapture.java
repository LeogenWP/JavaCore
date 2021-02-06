package com.LeogenWP.JavaCore.chapter15;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = (n) -> {
            int v = num + n;
            return v;
        };
    }
}

interface MyFunc {
    int func(int n);
}
