package com.LeogenWP.JavaCore.chapter11;

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
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

 class NewThread implements  Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread was created: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int n =5; n > 0; n--) {
                System.out.println("Chalid thread: " + n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread was interrupted");
        }
        System.out.println("Child Thread has been finished");
    }
}
