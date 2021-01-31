package com.LeogenWP.JavaCore.chapter10;

public class ThrowsDemo {
    static void throwOne () throws IllegalAccessException {
        System.out.println(" in the body of throwOne()");
        throw  new IllegalAccessException();
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
