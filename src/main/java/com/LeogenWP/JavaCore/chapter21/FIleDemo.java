package com.LeogenWP.JavaCore.chapter21;

import java.io.File;

public class FIleDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        //File f1 = new File("C/Maven/mamba.txt");
        //"C:\\demo\\music.txt"
        File f1 = new File("C:\\Maven\\music.txt");
        p("file name: " + f1.getName());
        p("Path" + f1.getPath());
        p("Absolut path: " + f1.getAbsolutePath());
        p("Parant catalog" + f1.getParent());
        p(f1.exists() ? "exist" : "not exist");
        p(f1.canWrite() ? "Available for writing" : "not available for writing");
        p(f1.canRead() ? "available for reading" : "not available for reading");

    }
}
