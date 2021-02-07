package com.LeogenWP.JavaCore.chapter20;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        System.out.println("Type some digits to count Avg");
        while(conin.hasNext()){
            if(conin.hasNextDouble()) {
                sum += conin.nextDouble();
                count++;
            } else{
                String str = conin.next();
                if(str.equals("finish")){
                    break;
                }else{
                    System.out.println("Wrong data format");
                    return;
                }
            }
        }
        conin.close();
        System.out.println("Avg is " + sum / count);
    }
}
