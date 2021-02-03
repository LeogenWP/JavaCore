package com.LeogenWP.JavaCore.chapter15;

public class LamЬdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.4555;
        System.out.println(myNum.getValue());
        myNum = () -> Math.random() ;
        System.out.println("random value: " + myNum.getValue());
    }

}

interface MyNumber {
    double getValue();
}
