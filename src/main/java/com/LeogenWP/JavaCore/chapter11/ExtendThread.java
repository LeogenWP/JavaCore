package com.LeogenWP.JavaCore.chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();
        try {
            for (int n =5; n > 0; n--) {
                System.out.println("MAIN thread: " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("MAIN Thread was interrupted");
        }
        System.out.println("MAIN Thread has been finished");
    }
}

class NewThread2 extends Thread {
    NewThread2() {
        super("Demonstration Thread");
        System.out.println("Child Thread: " + this);
        start();
    }

    public void run () {
        try {
            for (int n =5; n > 0; n--) {
                System.out.println("Child thread: " + n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread was interrupted");
        }
        System.out.println("Child Thread has been finished");
    }
}
