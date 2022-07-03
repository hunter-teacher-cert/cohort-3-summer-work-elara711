/**
 * ArrayPractice by Team 11
 * Yenmin Young
 * collaborators: Alana Robinson, Adam Driggs, Erwin Lara
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:
   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip
   The stubs will have comments describing what they should do
   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray
   - printArray
   - arraySum
   - firstOccurence
   - findMaxValue
   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds
   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;
import java.util.Random;

public class ArrayPractice{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
     Returns:
     a new array of integers
     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */

  // [3, 5, 7, 9, 11]
  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];

    // loop through each element of the array and
    // data[0] = startValue + 0*step;
    // data[1] = startValue + 1*step;
    // data[2] = startValue + 2*step;
    // data[3] = startValue + 3*step;
    // data[4] = startValue + 4*step;
    
    for (int i=0; i<size; i++){
     data[i] = startValue + i*step;
    }
    // assign the appropriate value to each one.
    return data;
  }


  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use
     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */

  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];


    for (int i = 0; i<size; i++){
      data[i] = r.nextInt(maxValue);
    }

    return data;
  }


  /**
     Parameters:
     data - an array of ints
     Returns:
     nothing
     prints out the array
     Note: data.length stores the length of the array
     Another Note: yes, we know William live coded this a few minutes ago.
  */
  public static void printArray( int[] data )
  { //print out the contents of the array in standard format --> [item, item...]
    System.out.print("["); //print opening bracket
    for (int i=0; i<data.length; i++){ //loop through the array
      System.out.print(data[i]); //print the value at current index
      if (i < data.length - 1){ //if we are NOT at the last item, add a comma and a space.
        System.out.print(", ");
      }   
    }
    System.out.print("]"); //closing bracket
    System.out.println(""); //end the line!
  }



  /**
     Parameters:
     data - an array of integers
     value - the value to search for
     Returns:
     the index (location) of the first occurence of value
     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence( int[] data, int value )
  {
    int location = 0;
    boolean found = false;
    for (int i = 0; i<data.length; i++){
      if(data[i] == value){
        location = i;
        found = true;
        break;
      }
    }
    if (found == true){
      System.out.println("The first time that " + value + " appears is in index location " + location);
    } else {
      System.out.println(value + " does not appear in this array.");
    }
    
    return location; // change this
  }


  /**
     Parameters: data - an array of ints
     Returns: an integer that is equal to the sum of all the elements in the array
     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)
  */

  // [9, 4, 3, 2, 5, 0, 3, 9, 0, 3]
  public static int arraySum( int[] data ){ 
    int sum = 0;
    for(int i = 0; i<data.length; i++){ 
      //add each item to the sum
      sum = sum + data[i];  
    }
    System.out.println("The sum of the arrays in this number is: " + sum);
    return sum;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     true if the array is sorted, false otherwise
     That is, if each element is < the element to its right
     then the array is sorted.
     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,18,15 is not
  */
  public static boolean isSorted( int[] data )
  {
    boolean sort = true;
    for(int i = 0; i < data.length-1; i++){
      //look to see if value at i is greater than the previous value...
      //if so it is sorted
      //else it isn't. set sorted to false
      if (data[i] > data[i+1]){
        sort = false;
      }
    }
    if (sort == true){
      System.out.println("This array is sorted beautifully.");
    } else {
      System.out.println("YUCK, THIS ARRAY IS OUT OF ORDER.");
    }
    return sort; // replace this
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int m=0;  // will hold the maximum value;
    for (int i = 0; i<data.length; i++){
      if (data[i]>m){
        m = data[i];
      }
    }
    System.out.println("THE ULTIMATE NUMBER IS " + m);
    return m;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     the number of odd elements in the array
     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count=0;

    for(int i = 0; i < data.length; i++){
      if (data[2])
    }
    // Note the % operator is the modulo (basically remainder) function
    // in java. Use to determine if an integer is odd.

    return count;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    int[] data = buildRandomArray(10, 20);
    arraySum(data);
    firstOccurence(data, 4);
    findMaxValue(data);
    
    int[] data2 = buildIncreasingArray(10,5,3);
    printArray(data);
    isSorted(data);
    int[] tester = {5, 7, 12, 10, 11}; //try this one!
    printArray(tester);
    isSorted(tester);
    printArray(data2);
    isSorted(data2);

    // add calls to show that the methods you write work.
  }
}