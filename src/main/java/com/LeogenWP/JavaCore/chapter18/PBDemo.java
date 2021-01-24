package com.LeogenWP.JavaCore.chapter18;

public class PBDemo {
    public static void main(String[] args) {

        try {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testfile.txt");
            proc.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
