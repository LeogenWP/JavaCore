package com.LeogenWP.JavaCore.chapter28;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();

        new Thread( new MakeString(exgr)).start();
        new Thread(new UseString(exgr)).start();
    }
}

class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;
    MakeString(Exchanger<String> c) {
        ex = c;
        str = new String();

    }

    @Override
    public void run() {
        char ch = 'A';
        for(int i =0; i <3; i++) {
            for(int j = 0; j <5; j++) {
                str += (char) ch++;
            }
            try {
                str = ex.exchange(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    UseString(Exchanger<String> ex) {
        this.ex = ex;

    }

    @Override
    public void run() {
        for (int i =0; i <3; i++) {

            try {
                str = ex.exchange(str);
                System.out.println("Получено " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}