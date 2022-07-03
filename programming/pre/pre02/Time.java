import java.util.*;

public class Time {
public static void main(String[] args){
      
double hour, minute;
double second;
long start = System.currentTimeMillis( );
long startTime = System.currentTimeMillis();

// assign the current time to 18:22.30 
hour = 18*60.0*60.0;
minute = 22*60.0;
second = 30;
  
  
// create variables named hour, minute, and second. Assign values that are roughly the current time. Use a 24-hour clock so that at 2pm the value of hour is 14
    
// Calculate and display the number of seconds elapsed since midnight
System.out.println("The current time is "+Math.round(hour/(60*60))+":"+Math.round(minute/60)+"."+second);
  
double secondsSinceMidnight = (hour)+(minute)+second;

System.out.println("The number of seconds elapsed since midnight is "+ secondsSinceMidnight);
    
//  Calculate and display the number of seconds remaining in the day
double secondsRemaininginday = (24*60*60)-secondsSinceMidnight;

System.out.println("The number of seconds remaining in the day is "+ secondsRemaininginday);

  
// Calculate and display the percentage of the day that has passed. You might run into problems when computing percentages with integers, so consider using floating-point


double percentofDaypassed = (secondsSinceMidnight*1.00)/86400.00;
  
System.out.println("Percentage of the day that has passed "+percentofDaypassed*100+"%");

  
// Change the values of hour, minute, and second to reflect the current time.Then write code to compute the elapsed time since you started working on this; exercise

hour = 18*60.0*60.0;
minute = 55*60.0;
second = 45;

double codingTime= (hour+minute+second)- secondsSinceMidnight;

System.out.println("Coding Time ="+codingTime/60);

  
  
    }
}