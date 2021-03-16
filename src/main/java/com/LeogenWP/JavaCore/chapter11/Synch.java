package com.LeogenWP.JavaCore.chapter11;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Welcome mate");
        Caller ob2 = new Caller(target,"This is Sync ");
        Caller ob3 = new Caller(target,"world :) ");
        try {
            System.out.println("W8ing until threads are  finished");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Callme {
   synchronized void call (String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class Caller implements  Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller (Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}