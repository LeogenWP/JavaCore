package com.LeogenWP.JavaCore.chapter15;

interface MyFun {
    MyClass func(int n);
}

class MyClass {
    private int val;
    MyClass(int v){
        val = v;
    }
    MyClass(){
        val = 0;
    }
    int getVal(){
        return val;
    }
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFun myClassCons = MyClass::new;
        MyClass mc = myClassCons.func(100);
        System.out.println("mc.getVal() " + mc.getVal());
    }

}
