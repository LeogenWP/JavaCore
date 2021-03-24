package com.LeogenWP.JavaCore.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch cdl1 = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);

        ExecutorService es = Executors.newFixedThreadPool(1);
        System.out.println("Запуск потоков");
        es.execute(new MyThread5(cdl1,"A"));
        es.execute(new MyThread5(cdl2,"B"));
        es.execute(new MyThread5(cdl3,"C"));
        es.execute(new MyThread5(cdl4,"D"));

        try {
            cdl1.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();

        } catch (Exception e) {
            System.out.println(e);
        }

        es.shutdown();
        System.out.println("Завершение потоков");
    }
}

class MyThread5 implements  Runnable {
    String name;
    CountDownLatch latch;

    MyThread5(CountDownLatch c, String n) {
        latch = c;
        name = n;
    }


    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
