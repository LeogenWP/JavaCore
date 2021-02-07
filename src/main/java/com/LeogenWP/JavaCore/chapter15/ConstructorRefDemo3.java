package com.LeogenWP.JavaCore.chapter15;


interface MyFunction <R,T> {
    R func(T n);
}

class MyCl2 {
    String str;
    MyCl2(String str){
        this.str = str;
    }
    MyCl2(){
        str ="";
    }
    String getVal(){
        return str;
    }
}
public class ConstructorRefDemo3 {
    static <R,T> R myClassFactory (MyFunction<R,T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunction<MyCl<Double>,Double> myClassCons = MyCl<Double>::new;
        MyCl<Double> mc = myClassFactory(myClassCons,100.1);
        System.out.println("mc.val is: " + mc.getVal());

        MyFunction<MyCl2,String> myClassCons2 = MyCl2::new;
        MyCl2 mc2 = myClassFactory(myClassCons2,"Lambda");
        System.out.println("mc2.val is: " + mc2.getVal());
    }
}
