package com.fileHandling;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
public class WritingOnFile  {
    public static void main(String[] args)  throws IOException {
//        FileWriter obj = new FileWriter("D:\\Write.txt");
//        obj.write("19Sofware");
//        obj.close();
//        System.out.println("Written successfuly");

        //writing through byteStream
        FileOutputStream obj = new FileOutputStream("D:Write.txt");
        String s = "Barish";
        char ch[] = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            obj.write(ch[i]);

        }
        obj.close();


    }
}