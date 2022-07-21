/**
Create a directory named pre06 under your assignments repo. Write a program named Loops.java which has solutions to excercises 2,3, and4from chapter 7 of Think Java.

*/


public class Loops {

  public static void main(String[] args){
    System.out.println("Square Root:" + squareRoot(100));
    System.out.println("Power: "+ power(2, 10));
    System.out.println("Factorial: " + factorial(3));

  }

  // >>> Exercise 2: squareRoot

  /**
  * Computes an approximation of the square root of a number
  *
  * @param  a   double of which we're finding the approximation of its square root 
  * @return     approximation of square root of a
  */
  public static double squareRoot(double a) {
    double currGuess = a/2;
    double newGuess;
    double diff;
    final double MARGIN_OF_DIFF = 0.0001;
      
    while(true) {
      newGuess = (currGuess + a/currGuess) / 2;
      diff = Math.abs(newGuess - currGuess);
   
     if (diff < MARGIN_OF_DIFF) { 
        break;
      }
      currGuess = newGuess;
    }
    return newGuess;
  }

  // >>> Exercise 3: power

  /**
  * Computes given number to a given power: x^n
  * @param x double, base of power
  * @param n int, exponent (must be positive)
  * @return x^n
  * 
  */
  public static double power(double x, int n) {
    double result = 1; // allows n = 0
    for(int i = 0; i < n; i++) {
      result *= x;
    }
    return result;  // result = x^n
  }

  // Exercise 4: factorial

  /**
  * Computes the factorial of n: n!
  *
  * @param n  integer that we are finding the factorial of.  Must be >= 0
  * @returns n!
  */
  public static int factorial(int n) {
    int result = 1;
    if(n == 0) {
      return result;
    } else {
      for(int i = n; i > 1; i--) {
        result = result*i;
      }
    }
    return result;
  }

}



/**

>>>>>  Exercise 2  
Let’s say you are given a number, a, and you want to find its square root. One way to do that is to start with a rough guess about the answer, x0, and then improve the guess using this formula:

x1 =(x0 + a/x0) / 2 
For example, if we want to find the square root of 9, and we start with x0 = 6, then x1 = (6 + 9/6) / 2 = 3.75, which is closer. We can repeat the procedure, using x1 to calculate x2, and so on. In this case, x2 = 3.075 and x3 = 3.00091. So it converges quickly on the correct answer.

Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.

As your initial guess, you should use a/2. Your method should iterate until it gets two consecutive estimates that differ by less than 0.0001. You can use Math.abs to calculate the absolute value of the difference.

>>>>> Exercise 3  
In Exercise 9 we wrote a recursive version of power, which takes a double x and an integer n and returns xn. Now write an iterative method to perform the same calculation.

>>>> Exercise 4  
Section 6.7 presents a recursive method that computes the factorial function. Write an iterative version of factorial.

  */