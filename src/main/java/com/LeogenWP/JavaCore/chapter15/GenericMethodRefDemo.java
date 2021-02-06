package com.LeogenWP.JavaCore.chapter15;


interface Func<T>{
    int func(T[] vals,T v);
}

class MyArrayOps{
    static <T> int countMatching(T[] vals, T v){
        int count = 0;
        for(int i =0; i < vals.length; i++){
            if(vals[i]== v){
                count++;
            }
        }
        return count;
    }
}
public class GenericMethodRefDemo {
    static <T> int myOp (Func<T> f, T[] vals, T v){
        return f.func(vals,v);
    }

    public static void main(String[] args) {
        Integer[] vals = { 1,2,3,2,2};
        String[] strs = {"One", "Two", "Three","Two","Two"};
        int count;
        count = myOp(MyArrayOps::<Integer>countMatching,vals,2);
        System.out.println("Array vals contains: " + count);
        count = myOp(MyArrayOps::countMatching,strs,"Two");
        System.out.println("Array strs contains: " + count);
    }
}
