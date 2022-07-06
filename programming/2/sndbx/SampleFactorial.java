/*
This is a demo of how recursion is implemented 
using the factorial algorithm

Code was provided by topfr via link to Day 2

*/

import java.io.*;
import java.util.*;
import java.lang.Math;


public class SampleFactorial 
{ 
   
   public static void main(String[] args) 
   {
      int x = 4;
      factorial(x);
   }

   public static int factorial(int n) 
   {
      if (n == 0) 
      {
         return 1;
      } else {
         int recurse = factorial(n-1);
         int result = n * recurse;
         System.out.println("Recurse= "+n);
         System.out.println("  ");
         System.out.println("Result= "+result);
         System.out.println("  ");
         System.out.println("Final Result ="+result);
         return result;
      }
   }

}