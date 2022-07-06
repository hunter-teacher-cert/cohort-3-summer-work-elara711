/**
 * Game of Nim by Team BossCoders - Zoom Room 2
 * MULTIPLAYERS BOSSES!
 * collaborators: 
* kmaschm - Maschmeyer, Kate 
* AliseBraick
* usman0527 - Usman Ahmed
* WayneTobias, Wayne
* Jihae Park, jpark-29
* jmtheo8 - Jerusha Theobald 
* 
 */

import java.io.*;
import java.util.*;

public class NimA {

  public static void main(String[] args) {  
   
    // starting with a bag of 12 stones
    int stones = 12;
  
    // how many stones a player has chosen to take
    int stonesTaken;

    // Scanner for our user input
    Scanner input = new Scanner(System.in);
   
    System.out.println("*****************");
    System.out.println("Welcome to Nim!");
    System.out.println("*****************");
  
           
    // loop until game ends
    while(stones > 0) {
       
        //ask the user input for the number of stones to be taken away
        System.out.println("There are " + stones + " stones in our bag.\n  How many would you like to     choose? 1, 2, or 3.");
        stonesTaken = input.nextInt();
        input.nextLine();
        
        //when the user tries to take less than 1 or greater than 3, this will happen
        if(stonesTaken > 3 || stonesTaken < 1) { // badness
            System.out.println("Ooops, that's not a valid number of stones to take!  Try again.");
            stonesTaken = input.nextInt();
            input.nextLine();
        }
        
        System.out.println("You chose to take " + stonesTaken);
    
        stones -= stonesTaken;
// CHECK FOR WIN