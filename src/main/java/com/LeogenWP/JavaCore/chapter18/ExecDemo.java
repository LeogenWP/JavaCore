package com.LeogenWP.JavaCore.chapter18;

import java.io.IOException;

public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("Notepad");
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("NotePad returns: " + p.exitValue());
    }
}
