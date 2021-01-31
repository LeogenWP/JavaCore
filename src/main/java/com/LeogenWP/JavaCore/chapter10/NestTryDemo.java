package com.LeogenWP.JavaCore.chapter10;

public class NestTryDemo {
    public static void main(String[] args) {
        try {
            int a =args.length;
            int b = 42/a;

            System.out.println("a = " + a);

            if (a==1) a = a/(a-a);

            try {
                if(a==2) {
                    int c[] = {1};
                    c[42] = 99;

                }
            } catch (ArrayIndexOutOfBoundsException  e) {
                System.out.println("ArrayIndexOutOfBoundsException ");
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
