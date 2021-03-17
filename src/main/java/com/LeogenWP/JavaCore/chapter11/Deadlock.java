package com.LeogenWP.JavaCore.chapter11;

public class Deadlock  implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this,"another thread");
        t.start();
        a.foo(b);
        System.out.println("Returning into Main thread");
    }

    public void run() {
        b.bar(a);
        System.out.println("back to another thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " got in method A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " is trying to call B.last()");
        b.last();
    }
    synchronized void last() {
        System.out.println(" in method A.last()");
    }
}

class B {
    synchronized void bar (A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name  + " came in method B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " Is trying to call A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("In method B.last()");
    }
}
