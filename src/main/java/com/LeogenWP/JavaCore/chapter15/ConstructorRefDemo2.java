package com.LeogenWP.JavaCore.chapter15;


import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.IntegerSyntax;

interface  MyF<T>{
    MyCl<T> func(T n);
}

class MyCl<T>{
    private T val;

    MyCl(T v){
        val = v;
    }
    MyCl(){
        val = null;
    }
    T getVal(){
        return val;
    }
}
public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyF<Integer> MyClassCons = MyCl<Integer>::new;
        MyCl<Integer> mc = MyClassCons.func(100);
        System.out.println("mc.getVal: " + mc.getVal());
    }


}
