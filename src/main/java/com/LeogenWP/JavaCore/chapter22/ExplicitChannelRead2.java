package com.LeogenWP.JavaCore.chapter22;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExplicitChannelRead2 {

    public static void main(String[] args) {
        int count;

        try(SeekableByteChannel fChan = Files.newByteChannel(Paths.get("test.txt"))){
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do{
                count =fChan.read(mBuf);
                if (count!= -1){
                    mBuf.rewind();

                    for(int i =0; i < count; i++){
                        System.out.println((char)mBuf.get());
                    }
                }

            }while(count != -1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
