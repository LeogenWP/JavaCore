package com.LeogenWP.JavaCore.chapter10;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("Upper level");
        e.initCause(new ArithmeticException("cause"));
        throw e;

    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Exc has been caught " + e);
            System.out.println("The Cause is " +  e.getCause());
        }
    }


}
