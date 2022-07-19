import java.io.*;
import java.util.*;

/*
David Moste, Elizabeht Rechtin, Usman Ahmed, Erwin Lara
*/

/** Methods to write
Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)

Challenge level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
    //initialize and ArrayList of Integers and initialize a random number generator
    ArrayList<Integer> data = new ArrayList<Integer>();
    Random rand = new Random();

    //add random numbers from 0 to maxval-1
    for(int i = 0; i < size; i++){
      data.add(rand.nextInt(maxval));
    }
    
    return data;
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
    //create a sum holder
    int sum = 0;

    //loop through the elements of our ArrayList and add them to our sum holder
    for(int i = 0; i < dataList.size(); i++){
      sum += dataList.get(i);
    }
    
    return sum;
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){
    //create a temporary holder for the element at index1
    int temp = dataList.get(index1);

    //swap the elements at index1 and index2
    dataList.set(index1, dataList.get(index2));
    dataList.set(index2, temp);
  }

  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
    //loop through all the elements of our ArrayList
    for(int i = 0; i < dataList.size(); i++){
      //remove elements if they match valueToRemove
      if(dataList.get(i) == valueToRemove){
        dataList.remove(i);
        //go back one element so we don't skip any
        i--;
      }
    }
  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    //initialize a new ArrayList
    ArrayList<Integer> sumList = new ArrayList<Integer>();
    
    //check precondition
    if(ListA.size() == ListB.size()){  
      //add the items from each ArrayList together
      for(int i = 0; i < ListA.size(); i++){
        sumList.add(ListA.get(i) + ListB.get(i));
      }
    }

    return sumList;
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    ArrayList<Integer> zipped = new ArrayList<Integer>();

    if(ListA.size() >= ListB.size()){
      for(int i = 0; i < ListA.size(); i++){
        if(i < ListB.size()){
          zipped.add(ListA.get(i));
          zipped.add(ListB.get(i));
        }else{
          zipped.add(ListA.get(i));
        }
      }
    }else{
      for(int i = 0; i < ListB.size(); i++){
        if(i < ListA.size()){
          zipped.add(ListA.get(i));
          zipped.add(ListB.get(i));
        }else{
          zipped.add(ListB.get(i));
        }
      }
    }
    
    return zipped;
  }




  public static void main(String[] args) {

    ArrayList<Integer> al;
    ArrayList<Integer> big = new ArrayList<Integer>();
    ArrayList<Integer> small = new ArrayList<Integer>();

    // Uncomment these to test buildRandomList
    al = buildRandomList(10,100);
    System.out.println("Result of buildRandomList");
    System.out.println(al);

    // Uncomment these to test swapElements
    swapElements(al,2,6);
    System.out.println("Result of swapElements");
    System.out.println(al);

    // Uncomment these to test removeValue
    
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    System.out.println(al);
    System.out.println("Result of sumOfList(al)");
    System.out.println(sumOfList(al));
    al.set(2,5);
    al.set(3,5);
    System.out.println(al);
    removeValue(al,5);
    System.out.println("after removeValue()");
    System.out.println("\nThis is al:"+al);
    System.out.println("\nThis is the sumlists (al,al)");
    System.out.println(sumLists(al, al));

    big.add(1);
    big.add(2);
    big.add(3);
    big.add(4);
    small.add(8);
    small.add(9);
    System.out.println("\nThis is the ziplists (big,small)");
    System.out.println(zipLists(big, small));

    System.out.println("\nThis is the ziplists (small,big)");
    
    System.out.println(zipLists(small, big));

    System.out.println("\nThis is the ziplists (big,big)");
    
    System.out.println(zipLists(big, big));
  }

}