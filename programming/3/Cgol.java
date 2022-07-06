import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * First Last
 * collaborators: Sam Lojacono, Erwin Lara, Latoya Boland, Marieke Thomas
 */

/**
   The Rules of Life:
   Survivals:
   
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard(int rows, int cols)
  {
    char[][] board = new char[rows][cols]; // defaults to null
    for (int i = 0; i < board.length; i++)
    {
      for (int j = 0; j < board[0].length; j++)
        {
          //d for dead, x for alive
          board[i][j] = 'd';
        }
    }
    
    return board;
  }

  //create random living cells
  public static char[][] pickRandomPosition(int liveCells, char[][] board)
  {
    int i = 0;
    int randomRow, randomColumn;
    Random rand = new Random();
    
    while (i <= liveCells)
    {
      randomRow = rand.nextInt(board.length);
      randomColumn = rand.nextInt(board[0].length); 
      
      setCell(board,randomRow,randomColumn,'X');
      i++;
    }
    return board;
  }
  
  //print the board to the terminal
  public static void printBoard(char[][] board)
  {
    for (int i = 0; i < board.length; i++)
    {
      for (int j = 0; j < board[0].length; j++)
      {
        System.out.print(board[i][j]);
      }
      System.out.println("");
    }
  }

  //set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val)
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbors(char[][] board, int r, int c)
  {
    int neighbors = 0;
     //traverse through the elements in row and column 
    for (int i=0; i<board.length; i++)
    {
      for (int j=0; j<board[i].length; j++)
      {
        if (i>=r-1 && i<=r+1)   
          if(j>=c-1 && j<=c+1)
            if(i!=r || j!= c)
              if(board[i][j] == 'X')
                neighbors++;
      }
    }

    return neighbors;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  **/
  public static char getNextGenCell(char[][] board,int r, int c)
  {
   //  * A living cell with 2 or 3 living neighbours will survive for the next generation.
   // Deaths:
   // * Each cell with >3 neighbours will die from overpopulation.
   // * Every cell with <2 neighbours will die from isolation.
   // Births:
   // * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
    int neighbors = countNeighbors(board,r,c);
    if (board[r][c] == 'X' && (neighbors == 2 || neighbors == 3))
    {
       // board[r][c] = 'X';
      return 'X';
    }
    else if (board[r][c] == 'd' && (neighbors == 3))
    {
      // board[r][c] = 'X';
      return 'X';
    }
    else if (board[r][c] == 'X' && (neighbors == 0 || neighbors == 1 || neighbors > 3))
    {
      return 'd';
    }
    return board[r][c];
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard(char[][] board)
  {
    //generate new board to replace initial board
    char[][] newBoard = new char[board.length][board[0].length];
    for (int i = 0; i < board.length; i++)
    {
      for (int j = 0; j < board[0].length; j++)
      {
        newBoard[i][j] = getNextGenCell(board,i,j);
      }
    } 
    return newBoard;
  }

  public static void main(String[] args)
  {
    char[][] board;
    //change it back to 25x25
    board = createNewBoard(10,10);
    //breathe life into some cells:
    // setCell(board, 0, 0, 'X');
    // setCell(board, 0, 1, 'X');
    // setCell(board, 1, 0, 'X');
    board = pickRandomPosition(20,board);
    //int n = countNeighbors(board,1,1);
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    //System.out.println(n);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+2:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    
  }//end main()

}//end class