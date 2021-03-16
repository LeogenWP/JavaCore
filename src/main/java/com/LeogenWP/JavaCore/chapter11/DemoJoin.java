package com.LeogenWP.JavaCore.chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("one");
        NewThread4 ob2 = new NewThread4("Two");
        NewThread4 ob3 = new NewThread4("Three");

        System.out.println("Thread one is running " + ob1.t.isAlive());
        System.out.println("Thread two is running " + ob2.t.isAlive());
        System.out.println("Thread three is running " + ob3.t.isAlive());

        try {
            System.out.println("W8ing until threads are  finished");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thread one is running " + ob1.t.isAlive());
        System.out.println("Thread two is running " + ob2.t.isAlive());
        System.out.println("Thread three is running " + ob3.t.isAlive());
        System.out.println("Main thread has been finished");
    }
}

class NewThread4 implements  Runnable {
    String name;
    Thread t;
    NewThread4(String s) {
        name = s;
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
