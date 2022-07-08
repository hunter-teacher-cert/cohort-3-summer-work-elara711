import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * Jenna Lin
 * collaborators: Ashley Ufret, Yenming Young, Erwin Lara.

 */

public class Driver 
{

    public static void main(String[] args) 
    {

        //declare a var of appropriate type to assign an instance of Time to
        Time startTime = new Time(18, 50, 12);
        Time runningTime = new Time(2, 16, 11);
        Time time1 = new Time(18, 50, 12);
        Time time2 = new Time(20, 12, 11);

        //Check toString() in class Time
        System.out.println(startTime.toString());

        System.out.println();

        //Check 
        time1.set(10, 20, 30);
        System.out.println(time1.toString());
        
        System.out.println();

        //Check add() in class Time
        System.out.println("Starting Time: " + startTime.toString());
        System.out.println("Running Time: " + runningTime.toString());
        startTime.add(runningTime);
        System.out.println("Ending Time: " + startTime.toString());
    

        System.out.println();

        //Check equal() in class Time
        System.out.println(startTime.equals(runningTime));
        System.out.println(startTime.equals(startTime));

        System.out.println();

        //Check convertTime() in class Time;
        //System.out.println(runningTime.convertTime(runningTime));

        //System.out.println();

        //Check compareTo() in class Time
        System.out.println(time1.compareTo(runningTime));
        System.out.println(time1.compareTo(time2));
        System.out.println(time1.compareTo(time1));
        

    }

}