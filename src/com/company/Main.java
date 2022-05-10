package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

 class Task_3
{

    public static void main(String[] args)
    {
        int bajt;

        try(FileInputStream fis = new FileInputStream("file1.txt");
            FileOutputStream fos = new FileOutputStream("file2.txt"))
        {
            do
            {
                bajt = fis.read();
                if ((char) bajt == ' ') bajt = '-';
                if (bajt != -1) fos.write(bajt);

            }
            while (bajt != -1);
        }
        catch (IOException e) {
            System.out.println("Error 402");
        }
    }
}
