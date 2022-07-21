import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {

 
	// Uncomment these to test part 1

  int size=1000;
      
	SortSearch ss = new SortSearch(size);
	System.out.println(ss);
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	i = ss.findSmallestIndex(3);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3

	System.out.println(ss);
	ss.sort();
	System.out.println(ss);


      
  // >>>>>>>>>>> Linear Search
  // System.out.println(ss);
  System.out.println("\nTesting linear Search: ");
  
  long start,elapsed;
	start = System.currentTimeMillis();
	/// ss.sort();

	// System.out.println(ss);
	    
  System.out.println(ss.linearSearch(size));
  elapsed = System.currentTimeMillis() - start;
	System.out.println("\nSize: " + size + " Sort Time: " + elapsed);
  

  // >>>>>> Binary Search
  System.out.println(ss);
  System.out.println("\nTesting Binary Search: ");
    
      
  System.out.println(ss);
  System.out.println(ss.binarySearch(size));   
  elapsed = System.currentTimeMillis() - start;
	System.out.println("\nSize: " + size + " Sort Time: " + elapsed);
  
	      

    }
}

/*

	int size = 1000;

	SortSearchReference ss = new SortSearchReference(size);
	
	// printing is really slow so we don't want
	// to print when testing time.
	// System.out.println(ss);
		
	long start,elapsed;

	start = System.currentTimeMillis();
	ss.sort();

	// System.out.println(ss);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time: " + elapsed);
			   

	      

    }
}
*/