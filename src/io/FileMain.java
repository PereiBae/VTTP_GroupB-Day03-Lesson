package io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMain {

    public static void main (String[] args){

        System.out.printf("args.length = %d\n", args.length);

        /*for (int i =0; i <args.length ; i++){
            System.out.printf("%d. %s\n", i, args[i]);
            System.out.println(">>>>");
        }

        for (String value: args)
        System.out.printf(">>>> %s\n", args.length);

        if (args.length <= 0){
            System.err.println("Please provide a file name");
            System.exit(1);
        } */

        // Loop through all the files and print their info
        for (String a: args){
            System.out.printf("\n\n>>>> Processing %s\n", a);
            Path p = Paths.get(a);
            File file = p.toFile();
            File file1 = new File(a);
            System.out.printf("path: %s\n", file.getAbsolutePath());
            System.out.printf("is file: %s\n", file.isFile());
            System.out.printf("exits %s\n", file.exists());
            System.out.printf("write: %s\n", file.canWrite());
        }

    }

}