package com.LeogenWP.JavaCore.chapter22;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))){
            for(int i=0; i <26; i++){
                fout.write((byte)('A'+i));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
