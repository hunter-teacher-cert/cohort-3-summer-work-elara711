/* Practice for Strings */

import java.io.*;
import java.util.*;
import java.lang.Math;

public class Prac
  {
    public static void main( String[]  args  )
    {
      String mString=("This is the first day of everyday....");
      System.out.println();

      System.out.println("Text here "+ mString);
      
      int qNumOfChars=mString.length();
      
      System.out.println(mString + "is "+ qNumOfChars);

      // Scanner input = new Scanner(System.in);
      
      int anInt = 0;

      System.out.println(anInt);
      
      while(anInt  <  qNumOfChars)
        {
        System.out.println("The "+anInt+ " character is: "+mString.charAt(anInt));
        
        anInt++;
        }
      
      // System.out.println("Enter a new sentence:"); 
      // = input.nextStr();
      
      
    
    // System.exit(0);


      
    }
        
   }     