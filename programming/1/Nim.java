/**
 * Game of Nim by Team BossCoders
 * Erwin  Lara
 * collaborators: Adam Prado, Richard Parker, Yenmin Young,
 */

             
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Nim
  {
      public static void main( String[]  args  )
    {
        int stonesInitial =12;
        int stonesRemain=stonesInitial;
        int stonesTaken;
     
        Scanner input = new Scanner(System.in);

      // loop until game ends
      
      while (stonesRemain > 0) 
      {
        // prompt user input (user turn)
        System.out.print("Your Turn: Take 1-3 stones.");
        stonesTaken  =  input.nextInt();
       
        System.out.println("You took "+ stonesTaken + " stones.");        
        // calculate number of stone remaining, print
        stonesRemain-=stonesTaken;
        System.out.println("Stones Remaining =" + stonesRemain);
        System.out.println(""); 

        // check for win condition
        if(stonesRemain==0)
        {
          System.out.println("Y O U  A R E  A  W I N N E R");
          System.exit(0);
        }

        
        //machine turn to take stones randomly between 1-3 stones only but not more than what is left in variable stonesRemain
       
        Random random = new Random();
        int machineTakes = random.nextInt(3) + 1;
        stonesRemain = stonesRemain - machineTakes;
          if(stonesRemain<=0)
          {
            System.out.println("AI Wins!!! You Lose");
            System.exit(0);
          }
        
        System.out.println("AI took "+ machineTakes + " stones");
        System.out.println("");
        System.out.println("Stones Remaining =" + stonesRemain);

        // check if AI is the winner
        
        
        
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