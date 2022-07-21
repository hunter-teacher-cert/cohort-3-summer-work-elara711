


import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).
Basic
-----
+add(string value)
+get(int index);
toString()
Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()
Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list
  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    head = new Node(value, head);//constructs newNode and assigns it value, and points to head

  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index)
  {
    Node walker = head;
    for (int i = 0; i < index; i++)
      {
        if (walker == null || index < 0)
        {
          return("Exception. Out of bounds");
        }
        else
        {
          walker = walker.getNext();
        }
      }
    return walker.getData();
  }

  public Node get_Helper(int index)
  {
    Node walker = head;
    for (int i = 0; i < index; i++)
      {
        if (walker == null || index < 0)
        {
          return null;
        }
        else
        {
          walker = walker.getNext();
        }
      }
    return walker;
  }
  

  /**
  Return a string representation of the list
  */
  public String toString(){
    Node walker = head;
    String str = "";
    while (walker != null)
      {
        str = str + walker.toString();
        walker = walker.getNext();
      }
    return str + "null";
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    Node walker = head;
    int counter = 0;

    while (walker != null)
      {
        walker = walker.getNext();
        counter++;
      }

    return counter;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value
  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.
  For example, given the list:
  "a" -> "b" -> "c" -> "d"
  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"
  */
  public void add(int index, String value)
  {
    if (index == 0) // if in the beginning head node
    {
      this.add(value);
      return;
    }
    else if (index == this.size()) // this is the last node
    {  
       Node previous = get_Helper(index - 1);
       Node n = new Node (value);
       previous.setNext(n);
    }
    else
    {
      Node previous = get_Helper(index - 1);//created variable for previous
      Node n = new Node (value);//created variable for object that we are adding
      Node next = get_Helper(index);//created variable for the next node
      n.setNext(next);//set n to point at next variable
      previous.setNext(n); // set previous to point at n variable
    }

  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value)
  {
    Node walker = head;
    int counter = 0;
    while (walker != null)
      {
        if (walker.getData() != value)
        {
          walker = walker.getNext();
          counter++;
        }
        else
          return counter;
      }
    return -1;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  public String[] toArray(){
    return null;
  }



  /**
  Remove the Node at location index from the list.
  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }



  
}