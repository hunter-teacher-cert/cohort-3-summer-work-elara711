/* July 15 PM Methods Annotation document */


// creating a method linearSearch to receive value and data
// MUST-ANSWER-Q: What is the data type for value? data?

public int linearSearch(int value, ArrayList<Integer> data) {

   
    // MUST-ANSWER-Q: declare and initialize variable foundIndex to -1
  
    int      foundIndex = -1     ;  
  //PROVIDE: -1 as a marker for "not index not in ArrayList"
  //FIRST DRAFT: Try 0 first! Hopefully students will see that it will not work as intended
  
  //PROVIDE: For loop structure "initial value; condition to continue; increment"
  //STUDENT PROMPT: Why use a for loop vs. while loop?
    for (int i = 0; i < data.size(); i++) {  // MUST-ANSWER-Q: Is i a counter? Why not use descriptive "counter"?
  // May i be initialized to 1 ?
      
      int element     =    data.get(i); //BIG IDEA: use of .get()

  // MUST-ANSWER-Q: Why "==" and not "=="?
      if (element == value) 
      {
        foundIndex = i;
        break;  // MUST-ANSWER-Q: Where does this take you if you removed this?
     
      }
      }
    return foundIndex;
  }
// }   REVISION: What happens if this bracket is added? How can you check for mismatched brackets?

// Try this-- add a CLASS and Main Method here to print all variable values

