package com.LeogenWP.JavaCore.chapter21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String source = "Hello helo world one two three...";
        char buffer[] = new char[source.length()];
        source.getChars(0,source.length(),buffer,0);

        try(FileWriter f0 = new FileWriter("file4.txt");
            FileWriter f1 = new FileWriter("file5.txt");
            FileWriter f2 = new FileWriter("file6.txt")){
            for(int i=0; i < buffer.length;i +=2){
                f0.write(buffer[i]);
            }
            f1.write(buffer);

            f2.write(buffer,buffer.length - buffer.length/4,buffer.length/4);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
