package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
    public static String [] lambdaStrings()
    {
        //Boolean
        boolean isSorted = false; //used to check if array was sorted
        
        //Create string array
        String strings [] = {"quack","taco","extra","one","Astronomy","enemy","bend","eat"};
        
        try{  
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
        //sort by strings that start with e first, with a static method
        Arrays.sort(strings, (s1,s2) -> (s2.length() - s1.length() )); //sort by length first to mix it up
        Arrays.sort(strings, (s1,s2) -> (SortStrings.startWithE(s1, s2)));
        System.out.print("Sort by strings starting with e: ");
        for(String s : strings){System.out.print(s + " ");}
        System.out.println("");
        }
        catch(NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException e)
        {
            e.printStackTrace();
        }
        return strings;
    }
    
    //*oddEvenList************************************************************************
    //Takes a list of ints and returns a string with an e preceding even num, and an o
    //preceding an odd num
    public static String oddEvenList(List <Integer> nums)
    {
        try{
        //use lambda to print a comma seperated string of ints preceded by e or o
        String s = nums.stream().map((num) -> (OddEvens.isEvenorOdd(num))).collect(Collectors.joining(","));
        System.out.println("\n" + s);
        
        return s;
        }
        catch(NullPointerException | IllegalStateException | NumberFormatException e)
        {
            e.printStackTrace();
        }
        return "";
    }
//*aList************************************************************************
    //Takes a list of strings and returns the ones that start with letter a and 
    //are length 3.
    public static List <String> aList(List <String> strings)
    {
        try{
        //filter out the correct strings
        strings = strings.stream() //using stream
                .filter((string) -> (string.charAt(0) == 'a')) //filter once based on first letter being a
                .filter((string) -> (string.length() == 3)) //filter twice based on length being 3
                .collect(Collectors.toList()); //return a list
        
        System.out.println("");
        
        //print out list contents
        for(String s : strings){System.out.println(s);};
        
        return strings;
        }
        catch(NullPointerException | IllegalStateException e)
        {
            e.printStackTrace();
        }
        return strings;
    }
    
//*main************************************************************************
    public static void main(String[] args)
    {
        
        //Create a list of nums
        List <Integer> nums = new ArrayList <Integer>();
        
        //add some nums
        nums.add(666);
        nums.add(777);
        
        //create list of strings
        List <String> strings = new ArrayList <String>();
        
        //add some strings
        strings.add("dictionary");
        strings.add("act");
        strings.add("a");
        strings.add("and");
        strings.add("any");
        strings.add("anyways");
        
        //Perform lambda strings operations
        lambdaStrings();
        
        //Create string with comma seperated nums
        oddEvenList(nums);
        
        //create a list of filtered strings
        aList(strings);
        
    }
    
}
