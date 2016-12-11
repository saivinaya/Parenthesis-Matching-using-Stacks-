/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6_task3;

import java.util.Stack;

/**
 * This class has 2 methods, isPairMatch() used to check if the pair is matching or not,
 * areParenthesisBalanced() is the method having main logic to check whether the Parenthesis are balanced or not.
 * @author VinayaSaiD
 */
public class ParenthesisChecker {
    public static boolean isPairMatch(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
         return true;
       else if (character1 == '{' && character2 == '}')
         return true;
       else if (character1 == '[' && character2 == ']')
         return true;
       else
         return false;
    }

    public static boolean areParenthesisBalanced(String exp)
    {
        Stack par = new Stack();
        for(int i =0;i<exp.length();i++)
	{   if(exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[' )
                    par.push(exp.charAt(i));
            else if(exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']' )
            {   if (par.empty() || !isPairMatch((char) par.peek(),exp.charAt(i)))
                {   
                    //System.out.print((char) par.peek() + "   " + exp.charAt(i));
                    return false; 
                }
                else {par.pop();}
            }
        }
       // If there is something left in expression then there is a starting parenthesis without a closing parenthesis
       if (par.empty())
       {
         return true; //balanced
        }
       else
         return false;  //not balanced
    } 
}
