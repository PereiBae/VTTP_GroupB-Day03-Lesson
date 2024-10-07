package io;

import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class IOTest {
    
    // Method to read the file using InputStream
    public static void readFile (String filepath) throws IOException{
        // Creating FileInputStream to read the file
        FileInputStream fis = new FileInputStream(filepath);

        // Use ByteArrayOutoutStream to accumulate file content
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        int data;
        // Read the file in chunks (bytes) and write it to the output stream
        while((data = fis.read()) != -1){
            outputStream.write(data);
        }

        //Convert byte array to string and print
        String content = new String(outputStream.toByteArray());
        System.out.println(content);

        //Close the InputStream
        fis.close();
        outputStream.close();
    }

    public static void main (String[] args) throws IOException{

        if (args.length == 0){
            System.out.println("No file path provided. Please provide the file path");
            return;
        }

        // Get the file path from the first argument
        String filePath = args[0];

        //Call the method to read the file
        readFile(filePath);

    }

}
