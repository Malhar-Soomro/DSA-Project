package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
//        FileReader obj = new FileReader("D:\\NewFile.txt");
//        int ch;
//        while((ch=obj.read())!=-1){
//            System.out.print((char)ch);
//        }

        //read through byteStream

        FileInputStream obj = new FileInputStream("D:Read.txt");
        int ch;
        ch = obj.read();
        while(ch!=-1){
            System.out.print((char)ch);
            ch = obj.read();

        }
    }
}
