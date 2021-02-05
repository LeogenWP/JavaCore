package com.LeogenWP.JavaCore.chapter15;

public class LambdasAsArgumentDemo {
    static String stringOp (StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = " HeHeHeHe  GoGoGo";
        String outStr;
        System.out.println("Origin string is: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(),inStr);
        System.out.println("toUpperCase: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for (i = 0; i < str.length(); i ++){
                if(str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;

        }, inStr);

        System.out.println(" string without spaces: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for(i = str.length() -1 ; i>=0;i--){
                result +=str.charAt(i);
            }
            return result;
        };

        System.out.println("reverse string is " + stringOp(reverse,inStr));
    }
}


