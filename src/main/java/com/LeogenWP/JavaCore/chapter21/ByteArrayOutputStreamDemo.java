package com.LeogenWP.JavaCore.chapter21;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This data is going to become an array";
        byte buf[] = s.getBytes();
        try{
            f.write(buf);
        }catch(IOException e){
            System.out.println("Error, sorry");
            return;
        }

        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("in Array");
        byte b[] = f.toByteArray();
        for(int i=0; i<b.length; i++)
            System.out.println((char) b[i]);
        System.out.println("\n поток вывода типа OutputStream()");
        try(FileOutputStream f2 = new FileOutputStream("test.txt")){
            f.writeTo(f2);
        }catch (IOException e){
            System.out.println(e);
            return;
        }

        System.out.println("In an origin position");
        f.reset();
        for(int i=0; i<3;i++)
            f.write('X');
        System.out.println(f.toString());
    }
}
