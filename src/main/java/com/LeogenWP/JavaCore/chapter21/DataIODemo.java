package com.LeogenWP.JavaCore.chapter21;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) throws IOException {

        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        }catch (FileNotFoundException e){
            System.out.println("Can't open the file");
            return;
        }catch(IOException e){
            e.printStackTrace();
        }
        try(DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println(d + " "+ i + " " + b );
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
