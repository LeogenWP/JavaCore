package com.LeogenWP.JavaCore.chapter10;

public class MyExceptionDemo extends Exception{
    private int detail;

    MyExceptionDemo(int a){
        this.detail = a;
    }

    public String toString(){
        return "MyException[ " + detail + " ]";
    }
}

class ExceptionDemo {
    static void compute(int a ) throws MyExceptionDemo{
        System.out.println("method starts");
        if (a > 10){
            throw new MyExceptionDemo(a);
        }
        System.out.println("Normal ending ");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyExceptionDemo myExceptionDemo) {
            myExceptionDemo.printStackTrace();
        }
    }
}
