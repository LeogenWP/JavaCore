package com.LeogenWP.JavaCore.chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread3("One");
        new NewThread3("Two");
        new NewThread3("Three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread has been finished");
    }

}

class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int n =5; n > 0; n--) {
                System.out.println( name + " : " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Thread was interrupted");
        }
        System.out.println(name + " has been finished");
    }
}
