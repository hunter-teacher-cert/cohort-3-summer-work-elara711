/**

*/

import java.util.*;
import java.util.Scanner;


public class Methods {

  public static void main(String[] args) {

    System.out.println("The Ack function A(0, 1) is: " + ack(0, 1));
    System.out.println("The Ack function A(0, 3) is: " + ack(0, 3));
    System.out.println("The Ack function A(1, 1) is: " + ack(1, 1));
    System.out.println("The Ack function A(2, 1) is: " + ack(2, 1));
    System.out.println("The Ack function A(2, 2) is: " + ack(2, 2));
    System.out.println("The Ack function A(3, 3) is: " + ack(3, 3));
  }

  /**
  * Tests whether an integer is divisble by another
  *
  * @param  n integer that we test if it is divisible by m
  * @param  m integer that we check if it divides evenly into n
  * @return true if n is divisble by m, false otherwise
  */
  public static boolean isDivisible(int n, int m) {
    if(n % m == 0) {
      return true;
    } else {
      return false;
    }
  }

  
  /**
  * Tests to see if 3 side lengths can make a triangle
  ^
  * @param  a 1st integer side length
  * @param  b 2nd integer side length
  * @param  c 3rd integer side length
  * @return true if side lengths a, b, and c can make a triangle, false otherwise
  *
  * Note: if the sum of two sides is equal to the third side, this is considered a (trivial) triangle 
  */

  public static boolean isTriangle(int a, int b, int c) {
    if(a > b + c) {
      return false;
    } else if(b > a + c) {
      return false;
    } else if(c > a + b) {
      return false;
    } else {
      return true;
    }
  }

  
  /**
  * Takes in two integers and returns the value of the Ackermann function
  A(m, n) = {
    n + 1               if m = 0
    A(m-1, 1)           if m > 0 and n = 0
    A(m-1, A(m, n-1))   if m > 0 and n > 0
  }
  *
  * @param integer m
  * @param integer n
  * @return integer A(m,n) Ackermann function
  *
  */

  public static int ack(int m, int n) {
    if(m == 0) {
      return n + 1;
    } else if(m > 0 && n == 0) {
      return ack(m-1, 1);
    } else if(m > 0 && n > 0) {
      return ack(m-1, ack(m, n-1));
    } else {
      return -1; // error, something has gone wrong!
    }
  }

}

/**

Exercise 2  
Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.

Exercise 3  
If you are given three sticks, you may or may not be able to arrange them in a triangle. For example, if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle. For any three lengths, there is a simple test to see if it is possible to form a triangle:

If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.
Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.

Exercise 8  
The goal of this exercise is to translate a recursive definition into a Java method. The Ackermann function is defined for non-negative integers as follows:

A(m, n) = 	
⎧
⎪
⎨
⎪
⎩	
              n+1	if  m = 0 
        A(m−1, 1)	if  m > 0  and  n = 0 
A(m−1, A(m, n−1))	if  m > 0  and  n > 0
Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.

Test your implementation of Ackermann by invoking it from main and displaying the return value. Note the return value gets very big very quickly. You should try it only for small values of m and n (not bigger than 3).


  */