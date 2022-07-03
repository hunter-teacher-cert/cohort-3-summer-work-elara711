/**
 * Game of Nim by Team BossCoders
 * Erwin  Lara
 * collaborators: Adam Prado, Richard Parker, Yenmin Young,
 */

             
import java.io.*;
import java.util.*;
import java.lang.Math;
import


public class Nim
  {
      public static void main( String[]  args  )
    {
        int stones =12;
        int stonesTaken;

        Scanner input = new Scanner(System.in);

      // loop unitl game ends
      
      while (stones > 0) 
      {
        // prompt user input (user turn)
        System.out.print("How many stonde do you want to take?");
        stonesTaken  =  input.nextInt();
        System.out.print("You took ""+ stonesTaken + "stones.");        
        
        // calculate number of stone remaining, print
        stonesTaken=stones-stonesTaken;
        Sy
        // shceck for win

        //machine turn

        //calculate number of stone remaining, print

        // check win
        
      }


      
    }

    
  }

/** Work: Game of Nim
GOAL:

Be the player to remove the last stone.

RULES:

bag contains 12 stones initially
a move consists of removing 1-3 stones from the bag
YOUR CODING MISSION:

Write a program that will allow a human at console to play against your "AI" a game of NIM.

prompt user for number of stones they wish to remove each turn
tell user how many stones the AI removed and how many stones remain
facilitate play until human or AI wins, and announce winner
Grow cohort KB ("knowledge base") on slack:

Have a Q? Ask.
Confident in your skills/knowledge? See how well you can explain it.
SUGGESTED WORKFLOW:

Designate "slacker" to interact with slack. (esp. #java-fu and #replit-fu for now...)
Designate "driver" to screenshare and type.
All parties dialogue as you compose code.
Think about who you will designate as presenter, should you demo to entire cohort.
PROTIPs:

Never stray far from runnable code.
Comments galore!!!
DELIVERABLE:

Save in your_work_repo: programming/1/Nim.java
Include heading at top of file, as comment. List all collaborators and consultants. E.g.,

  */