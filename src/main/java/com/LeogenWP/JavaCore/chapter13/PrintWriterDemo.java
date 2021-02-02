package com.LeogenWP.JavaCore.chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);

        pw.println("This is a string");
        int i = -7;
        pw.println(i);
        double d = 4.5;
        pw.print(d);
    }
}
