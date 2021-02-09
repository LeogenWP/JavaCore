package com.LeogenWP.JavaCore.chapter21;

import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try(FileInputStream  f = new FileInputStream("C:/QBJE/adress.txt")){
            System.out.println("Общее количество доступных байтов " + (size = f.available()));
            int n = size/40;
            System.out.println("Первые " + n + " байтов, прочитанных из файла по очереди методом read()");
            for(int i=0;i<n;i++){
                System.out.println(((char) f.read()));
                System.out.println("\nВсе еще доступно: " + f.available());
                System.out.println("Чтение следующих " + n + " байтов по очереди методом read(b[])");
                byte b[] = new byte[n];
                if (f.read(b) != n) {
                    System.out.println("Нельзя прочитать " + n + " байтов.");
                }

                System.out.println(new String(b,0,n));
                System.out.println("\nВсе еще доступно: \" + f.available() ");
                f.skip(size/n);
                System.out.println("Still available: " + f.available() );
                System.out.println("Reading " + n/2 +" bytes in the end of the array");
                if(f.read(b,n/2,n/2) != n/2){
                    System.out.println("It is impossible to read "  + n/2 + " bytes");
                }
                System.out.println(new String(b,0,b.length)  );
                System.out.println("Still available: " + f.available() );
            }
        }catch (IOException e){
            System.out.println("IO exception " + e);
        }
    }
}
