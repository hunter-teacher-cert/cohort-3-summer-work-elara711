/*
This code demos a countdown timer



*/

import java.io.*;
import java.util.*;
import java.lang.Math;

public class SummerCS {

public static void main(String[] args) {
  int x = 3;       // initialize the value of control variable x to 3
  countdown(x);    // calls the method countdown and passes the value 3
}

public static void countdown(int n) {
  if (n == 0) 
  {  
    System.out.println("Blastoff");
  } else {
    System.out.println(n);
    countdown(n - 1);
  }
}

}

// End