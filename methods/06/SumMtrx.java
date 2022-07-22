/** Author: Erwin Lara
  This code will use two 5x5 matrices that the user will enter values for. 
  The code will clear the console at the beginning of every task to keep
  the console clutter down. Then, the two matrices will be added. The two matrices
  will be displayed and then the sum will follow. */


import java.util.*;
import java.util.Scanner;

public class SumMtrx {

  public static void clearScreen()
    {
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }

  
    public static void main(String[] args) {
    int row = 5, col = 5;
    int[][] oneMatrix = new int[5][5];
    int[][] twoMatrix = new int[5][5];


clearScreen();

      
// Get new values from user for oneMatrix
    int entry=0;
    for (int i=0; i<row; i++)
    {
      for (int j=0; j< col; j++)
        {
        // get entry from user
        Scanner in = new Scanner(System.in);
          System.out.print("Assign value for Matrix A");
          System.out.print("(row,column):("+i+","+j+")=>");
          entry = in.nextInt();
          oneMatrix[i][j]=entry;  
        }
      System.out.println();
    }

clearScreen();
      
// Get new values from user for twoMatrix
    
      entry=0;
    for (int i=0; i<row; i++)
    {
      for (int j=0; j< col; j++)
        {
        // get entry from user
        Scanner in = new Scanner(System.in);
          System.out.print("   Assign value for Matrix B");
          System.out.print("(row,column):("+i+","+j+")=>");
          entry = in.nextInt();
          twoMatrix[i][j]=entry;  
        }
    System.out.println();  
    }

clearScreen();

      
// Show the default state of the two matrices result on screen
    System.out.println("The elements of the first Matrix is ");
      for (int i=0; i < row; i++)
      {     
        for (int j=0; j < col; j++)
        {
        System.out.print(oneMatrix[i][j]+"  ");    
        }
      System.out.println();  
      }

    System.out.println();
    System.out.println("The elements of the second Matrix is ");
      for (int i=0; i < row; i++)
      {     
        for (int j=0; j < col; j++)
        {
        System.out.print(twoMatrix[i][j]+"  ");    
        }
      System.out.println();  
      }

      
    // Combine Matrices by Addition
    System.out.println();
    int[][] sumofmatrix = new int[5][5]; // create a new matrix 5x5
      
      // add all the elements on a row x column until i=5 and j=5 using a           for..loop
      for (int i=0; i < row; i++)
      {     
        for (int j=0; j < col; j++)
        {
        sumofmatrix[i][j]= oneMatrix[i][j] + twoMatrix[i][j];
        }
      }

    // Show the result on screen
      System.out.println("The sum of the two matrices is: ");
      for(int[] rows:sumofmatrix)
      {
        for(int cols:rows ) 
        {
      System.out.print(cols + "   ");    
        }
        System.out.println();
        }
      }
      }

  