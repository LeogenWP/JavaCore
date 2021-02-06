package com.LeogenWP.JavaCore.chapter15;

class MyStringOps{
    static String strReverse(String str){
        String result ="";
        int i;
        for(i = str.length()-1; i>=0;i--){
            result += str.charAt(i);
        }
        return result;
    }
}


public class MethodRefDemo {
    static String stringOp (StringFunc sf,String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Hello World";
        String outStr;

        outStr = stringOp(MyStringOps :: strReverse, inStr);
        System.out.println("Origin: " + inStr);
        System.out.println("Reverse: " + outStr);
    }
}
