/** Pre04 
  Updated July 2 after discussion with Day 1 Group
  and notes from William Sakas

*/

import java.io.*;
import java.util.*;

public class Beer {

  // if num == 1, prints: 1 bottle of beer
  // if num > 1 or == 0, prints: num bottles of beer
  public static void bottleOfBeer(int num) {
    System.out.print(num + " bottle");
    
    if(num > 1 || num == 0) {
      pluralize();
    }
    System.out.print(" of beer");
  }

  // adds an s when needed
  public static void pluralize() {
    System.out.print("s");
  }
  
  public static void passIt() {
    System.out.println("ya' take one down, ... ya' pass it around,");
  }
  
  public static void singing(int numBottles) {
  
    if(numBottles > 0 ) {
      bottleOfBeer(numBottles); // n bottles of beer
      System.out.println(" on the wall,");
      bottleOfBeer(numBottles); // n bottles of beer
      System.out.println(",");
      passIt(); 
      bottleOfBeer(numBottles - 1); // n-1 bottles of beer
      System.out.println(" on the wall.");
      System.out.println();

      singing(numBottles - 1);
      
    } else {
      System.out.println("NO bottles of beer on the wall ,");
      System.out.println("NO bottles of beer,");
      System.out.println("ya’ can’t take one down, ... ya’ can’t pass it around,");
      System.out.println("’cause there are no more bottles of beer on the wall!");
    }
  }
 
  public static void main(String[] args) {
    singing(25);
  }

}