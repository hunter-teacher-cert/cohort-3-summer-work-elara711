/* A program to output a string in reverse using indices
  in Strings 

precondition:  aString="heels"
postcondition: display "sleeh"

*/


import java.io.*;
import java.util.*;
import java.lang.Math;

public class ReverseString
  {
      public static void main( String[]  args  ){

        String aString="Happy Birthday";
        System.out.println(aString);

        // get the length of the string
        int lengthString=aString.length();

        System.out.println(aString+" has "+ lengthString + " chars");

        // print to screen the string in Reverse Order
        
        int counter = lengthString-1;   // initialize counter for while loop
        while (counter !=-1)
          {
            System.out.print(aString.charAt(counter));
            counter --;       
          }
      System.out.println("");        
      }
  }


//  End of Code
