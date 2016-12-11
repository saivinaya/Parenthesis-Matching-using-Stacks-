/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6_task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class has readFile() method, which is used to read the lines in a file and put it into a String.
 * @author VinayaSaiD
 */
public class ReadFromFile {
    public static String readFile(String name) throws Exception
    {
       
        String content;
        content = "";
        String line;
        // use FileReader and BufferedReader to read from the file
        try (FileReader fr = new FileReader(name); BufferedReader br = new BufferedReader(fr)) {
            // Read data from a file
            while ((line = br.readLine()) != null) {
                content = content + line;
            }          }
        catch (Exception e)
            {   
                System.out.println(e.getMessage());
                System.out.println("Invalid file path entered. Exiting the program.\n\n");
                System.exit(0);
            }
        return content;
    }
}
