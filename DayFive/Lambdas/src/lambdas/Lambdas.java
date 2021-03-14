package lambdas;

import java.util.Arrays;
import java.util.Collections;

/*
 * Programmer: Damian Zylski
 * Project:    Lambdas
 * Date:       03/13/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To create a series of methods utilizing lambdas.
 */
public class Lambdas
{
//*lambdaStrings************************************************************************
    //Sort lambda strings by various methods
    public static void lambdaStrings()
    {
        //Create string array
        String strings [] = {"quack","taco","extra","one","Astronomy","enemy","bend","eat"};
        
        //Sort Strings based on length
        Arrays.sort(strings, (s1,s2) -> (s1.length() - s2.length() ));
        System.out.print("Sort by length: ");
        for(String s : strings){System.out.print(s + " ");}
        System.out.println("");
        
        //sort by reverse length order
        Arrays.sort(strings, (s1,s2) -> (s2.length() - s1.length() ));
        System.out.print("Sort by reverse length: ");
        for(String s : strings){System.out.print(s + " ");}
        System.out.println("");
        
        //Sort alphabetically by the first char
        Arrays.sort(strings, (s1,s2) -> (s1.charAt(0) - s2.charAt(0)));
        System.out.print("Sort by first char: ");
        for(String s : strings){System.out.print(s + " ");}
        System.out.println("");
        
        //sort by strings that start with e first
        Arrays.sort(strings, (s1,s2) -> {
                                         if(s1.charAt(0) == 'e' && s2.charAt(0) != 'e')
                                         {return -1; }
                                         
                                            else
                                         {
                                             return 0;
                                         }});
        System.out.print("Sort by strings starting with e: ");
        for(String s : strings){System.out.print(s + " ");}
        System.out.println("");
    }
    
//*main************************************************************************
    public static void main(String[] args)
    {
        //Perform lambda strings operations
        lambdaStrings();
    }
    
}
