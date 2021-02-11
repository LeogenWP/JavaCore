package com.LeogenWP.JavaCore.chapter21;

import java.io.CharArrayWriter;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This Data is going to be added in an array!";
        char buf[] = new char[s.length()];

        s.getChars(0,s.length(),buf,0);
        try{
            f.write(buf);
        }catch (Exception e){
            e.printStackTrace();
            return;
        }


    }
}
