package com.LeogenWP.JavaCore.chapter11;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread6 ob1 = new NewThread6("One");
        NewThread6 ob2 = new NewThread6("Two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("One is stopping");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("One is running");
            Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("Two is stopping");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Two is running");
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("w8ing for Thread finishing");
            ob1.t.join();
            ob2.t.join();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is finishing");
    }

}

class NewThread6 implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread6(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        suspendFlag = false;
        t.start();
    }

    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while(suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(name + " has been finished");
    }
    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
