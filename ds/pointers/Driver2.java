import java.io.*;
import java.util.*;

public class Driver2{

    public static void main(String[] args) {

	// First:
	// Start here and trace through
	// the code by hand until the comment
	// that says stop tracing

	Node front;//declares Node front
	front = new Node("one");//front node is assigned the value of "one"
	front.setNext(new Node("two"));//sets the front node to point to node "two"
	front.getNext().setNext(new Node("three"));
	front.getNext().getNext().setNext(new Node("four"));

	System.out.println(front.getData());

	Node walker;

	walker = front;//assigns the value of front to walker, we do this to allow for manipulation of the data without worrying about losing front (front is now safe from being harmed, "locked down" and not used unless necessary)
	System.out.println(front.getData());
	walker = walker.getNext();
	System.out.println(walker.getData());
	System.out.println(front.getNext().getData());

  /*
  for (Node n = walker; n != null; n = n.getNext())//going though loop as long as get.Next is not null
        {  
          System.out.println(n.getData());//prints what's in our current node
        }
      
  */
  
  // while(walker.getNext() != null) {
//      print(walker data)
//      walker = walker.getNext();
//  }
      
	// stop tracing

	// Now, compile and run the program
	// using "javac Driver.java Node.java"
	// and then "java Driver"

	// Once you've run,
	// complete the program as per the following comments
	// and compile and run your program again.

	// Add a line to set the walker variable defined above
	// so that it points to (refers to) the same node as
	// the variable front points to.
	
	// Uncomment the next line, compile and run
	// to test what you just added
	System.out.println(walker.getData());
  walker = front;//walker takes the value of front

  while(walker.getNext() != null) {//while the walker is pointing at something
    System.out.println(walker.getData());//prints the data at each node
    walker = walker.getNext();//each time the walker is reassigned to the next node
  }
  System.out.println(walker.getData());//this accesses the data on the last node (whose next is null)
	// Add the code necessary
	// to set up a loop that
	// 1. prints out what is in walker.data()
	// 2. moves walker to point to the next node
	// 3. loops until walker gets to null
	
    }

}