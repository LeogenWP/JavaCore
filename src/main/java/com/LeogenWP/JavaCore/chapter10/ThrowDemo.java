package com.LeogenWP.JavaCore.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Demonstration");
        } catch (NullPointerException e) {
            System.out.println(" Catch e in the method");
            throw  e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Catch the e again");
        }
    }
}
