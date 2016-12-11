/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6_task3;

import java.util.Scanner;
import java.util.Stack;
import a6_task3.ParenthesisChecker.*;
import a6_task3.ReadFromFile.*;

/**
 * This class reads the file name from the command line and calls the readFile() method to read from the file,
 * then it calls areParenthesisBalanced() method to check whether the parenthesis are balanced or not
 * @author VinayaSaiD
 */
public class A6_Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        String expression = null;
        // read the lines from the file
        expression = ReadFromFile.readFile(args[0]);
        // check if the brackets are balanced or not
        if(ParenthesisChecker.areParenthesisBalanced(expression))
        {   System.out.println("Parenthesis are Balanced.");
        }
        else
        {   System.out.println("Parenthesis are Not Balanced.");
        }
    }
}
