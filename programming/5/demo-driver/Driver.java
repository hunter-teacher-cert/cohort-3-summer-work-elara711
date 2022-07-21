import java.io.*;
import java.util.*;

public class Driver
{
  public static void main( String[] args )
  {

    //declare a var of type Wagon
    Wagon w;

    //assign var the address of a newly-apportioned Wagon object
    w = new Wagon();

    //Q: how does this statement behave when a is pvt? public?
    System.out.println(w.a);

    System.out.println(w.getA());

    w.setA(0);

    System.out.println(w.getA());

  }//end main()

}//end class