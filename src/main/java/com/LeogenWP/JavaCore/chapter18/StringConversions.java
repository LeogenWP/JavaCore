package com.LeogenWP.JavaCore.chapter18;

public class StringConversions {
    public static void main(String args[]){
        int num = 19648;
        System.out.println("Число " + num + "в двоичной форме: " + Integer.toBinaryString(num));
        System.out.println("Число " + num + "в восьмеричной форме: " + Integer.toOctalString(num));
        System.out.println("Число " + num + "в шестнадцатеричной форме: " + Integer.toHexString(num));

    }
}
