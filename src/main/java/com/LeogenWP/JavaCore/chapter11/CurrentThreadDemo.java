package com.LeogenWP.JavaCore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread is: " + t);
        t.setName("My main thread");
        System.out.println("After changing thread name: " + t);

        try {
            for (int n =5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}
