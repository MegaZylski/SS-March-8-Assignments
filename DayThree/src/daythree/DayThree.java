package daythree;
/*
 * Programmer: Damian Zylski
 * Project:    TrianglesFromNotes
 * Date:       03/10/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To let the user provide a filepath and display all files and folders
 * in said directory. This program will also allow text to be appended to a file and will
 * have the ability to search for a particular character in a file and count it.
 */

import java.util.Scanner;
import java.io.File;
import java.nio.file.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DayThree
{
    
//*directoryChecker*********************************************************************************
    //Lists the files and folders in a directory. Directory will be input as command line arg
    //NOTE: Had to refer to examples online as I have no idea how to list files in Java.
    //NOTE: Having lots of trouble with this. Can't seem to display sub directories correctly
    public static File directoryChecker(StringBuilder path)
    {
        //Variables
        int i = 0;
        File dir = null;
        File dirList [] = null;
        StringBuilder newPath = new StringBuilder();
        
        //Try to open directory
        try
        {     
            //open file location
            dir = new File(path.toString());
           //Get all directories in directory
           dirList= dir.listFiles();
           
           //loop through all files and display contents
           for(File f : dirList)
           {
               //Check if path is a directory
               if(f.isDirectory())
               {
                   System.out.println("Directory: " + f.getAbsolutePath());
                   //New path
                   newPath.append(f.toString());
                   //Enter directory and display inner directory contents                   
                   //return directoryChecker(newPath);
               }
               //for files
               else if(f.isFile())
               {
                   System.out.println("File: " + f.getAbsolutePath());
                   //return directoryChecker(newPath);
               }
               else
               {
                   return null;
               }
           }
        }
        catch(InvalidPathException e)
        {
            e.printStackTrace();
            System.err.println("Directory not found!");
            throw e;
        }
        return null;
    }
    
//*textAppender*********************************************************************************
    //Appends text to a file
    public static void textAppender()
    {
        
    }
    
//*charSearch*********************************************************************************
    //Searches for a specific char in a file and counts it
    public static void charSearch()
    {
        
    }
    
//*main*********************************************************************************
    public static void main(String[] args)
    {
        //check what is in a directory and it's subdirectories
        try //Check if there is any input, since this is coming from Command Line
        {
            //open the file
            StringBuilder path = new StringBuilder(args[0]);
            //print message
            System.out.println("Contents of " + path.toString());
            //Check files
            directoryChecker(path);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
            System.out.println("Error. No directory provided\n");
        }
        catch(InvalidPathException e)
        {
            e.printStackTrace();
            System.err.println("Directory not found!");
            throw e;
        }
        
        //Append text to a file
        
        //Search for a char in a file and count it
    }
    
}
