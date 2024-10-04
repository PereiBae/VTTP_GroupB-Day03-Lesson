package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.ObjectInputStream;

public class IOMain {

    public static void main(String[] args) throws FileNotFoundException, IOException{

        File file = new File(args[0]);
        // Throws an exception
        InputStream fis = new FileInputStream(file);

        DataInputStream ois = new DataInputStream(fis);

        int totalWords = 0;

        while (true){
            String line = ois.readLine();
            System.out.printf(">>> line : %s\n", line.toUpperCase());
            if (null == line)
                break;
            System.out.printf(">>> total words");

        }

        /* 
        // Create a buffer
        byte[] buffer = new byte[1024];

        // Read the file
        int bytesRead = 0;
        int total = 0;
        while (bytesRead >= 0){
            bytesRead = is.read(buffer);
            if (bytesRead >=0)
                total += bytesRead;
            System.out.printf(">>> bytes read: %d (%d)\n", bytesRead, total);
        }
        */

        //After Reading close the stream
        fis.close();


    }
    
}
