/** Prac1.java
  Tinkering with multiple void methods calls
    */
public class prac1
{
 // this void method prints "blank line " and a CR 
public static void addLine()
  {
  System.out.println("blank line +++++++"); 
  }

public static void addNumber()
  {
  System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 ..."); 
  }

  
// this method invokes addline() with for...loop  
public static void add4lines()
  {
  for(int i=0;i<5;i++)
      {
      addLine();
      addNumber();
      System.out.println(".........");
      }
  }
  
public static void main(String[] args)
  {
  add4lines();
  }  
  
}