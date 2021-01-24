package com.LeogenWP.JavaCore.chapter18;

public class VerDemo {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("Main version: " + version.major());
        System.out.println("Additional version: " + version.minor());
        System.out.println("Security version: " + version.security());
    }
}
