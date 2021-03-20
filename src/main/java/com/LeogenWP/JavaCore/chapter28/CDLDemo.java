package com.LeogenWP.JavaCore.chapter28;

import edu.princeton.cs.algs4.Count;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("Запуск потока исполнения");
        new Thread(new MyThread(cdl)).start();

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потока исполнения");

    }
}

class MyThread implements Runnable {
    CountDownLatch latch;

    MyThread(CountDownLatch cdl) {
        latch = cdl;
    }


    @Override
    public void run() {
        for (int i =0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }
}
