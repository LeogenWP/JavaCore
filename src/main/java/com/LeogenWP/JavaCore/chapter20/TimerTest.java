package com.LeogenWP.JavaCore.chapter20;


import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask {
    public void run(){
        System.out.println("The task has been done");
    }
}
public class TimerTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
        myTimer.schedule(myTask,1000,500);

        try{
            Thread.sleep(5000);
        }catch(InterruptedException exc){
            System.out.println(exc);
        }
        myTimer.cancel();
    }
}
