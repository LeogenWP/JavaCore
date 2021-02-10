package com.LeogenWP.JavaCore.chapter21;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;
    public InputStreamEnumerator (Vector<String> files){
        this.files = files.elements();
    }
    public boolean hasMoreElements(){
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try{
            return new FileInputStream(files.nextElement().toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try{
            while ((c = input.read())!= -1){
                System.out.println((char)c);
            }
        }catch( Exception e){
            e.printStackTrace();
        }finally {
            try{
                input.close();
            }catch (Exception e){

            }
        }
    }
}
