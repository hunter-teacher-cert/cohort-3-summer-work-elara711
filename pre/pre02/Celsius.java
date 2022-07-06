import java.util.*;
import java.util.Scanner;

public class Celsius {
public static void main(String[] args){

   
// Exercise 2   Write a program that converts a temperature from Celsius to Fahrenheit.
    

    final double CON_MULTIPLE=9.0/5.0;
    final double CON_CONSTANT=32; // 
    double cels; // celsius variable s
    double fahr; // fahrenheit variable
  
  //(1) prompt the user for input  and read a double value from the keyboard
  Scanner in = new Scanner(System.in);
  System.out.print("Enter a Celsius value ");  // this prompts the user for entry
  cels = in.nextInt(); // this assigns the user entry in to the variable cels

    
// Add section with if..else statement
  
 if (cels<50) 
  {
    System.out.println("The Celsius value you entered is less than 50="+cels); // if cels < 50
  }
  else  
 {
  System.out.println("The Celsius value you entered is more than 50 ="+cels); // else block go here
 }    
  
  // (3) calculate the result, and 
  fahr=CON_CONSTANT+(cels * CON_MULTIPLE);  // calculate the result
  
  
  //(4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F"
  
  System.out.println("Celsius ="+cels);
  System.out.printf("Celsius floating point = %f \n",cels);
  System.out.printf("Celsius floating point 3 decimals = %.3f \n",cels);
  System.out.printf("Celsius floating point 0 decimals= %.0f \n",cels);
  
  System.out.println("Fahrenheit equivalent ="+fahr);

  System.out.println("C O N V E R S I O N Complete");
  
    }
}