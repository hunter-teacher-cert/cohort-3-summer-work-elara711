// Author: Erwin Lara


import java.util.*;
import java.util.Scanner;

// Use GMN instead of GuessMyNumber
//

public class GMN {
public static void main(String[] args){

int guess=200;
  
// pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

System.out.println("I am thinking of a number from 1 to 100. ");

// Enter a command here to get user input to a variable user_guess
// Read an integer value from the keyboard, 
  Scanner in = new Scanner(System.in);
  System.out.print("Can you guess what it is?");
  guess = in.nextInt();
  int diff=guess-number;

// Evaluate the user input if it is equal to the value of the assumed guess
if(diff==0){
  System.out.println("Your guess is correct!!!");
}
else {
  System.out.println("Your guess is different from my number by.. "+diff);
  }
System.out.println("End of Guessing Game -> Goodbye");
  }
}