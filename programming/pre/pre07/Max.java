import java.util.Arrays;
import java.util.Random;

public class Max {

  public static void main(String[] args) {

  // originally had indexOfMax in Array.java, oops!

   // testing indexOfMax:
    // including checking that it handles the largest element is a negative number.
    // Random rand = new Random();
    // int a[] = new int[10];
    // for(int i = 0; i < a.length; i++) {
    //   a[i] = rand.nextInt(10) * -1;
    // }
    // System.out.println(Arrays.toString(a));

    // System.out.println("Index of largest element in a: " + indexOfMax(a));


  }





  /**
  * Takes in an array of ints and returns index of the largest element
  * 
  * @param  a array of ints we are inspecting
  * @return index of largest element
  *
  * Note: if largest element occurs multiple times within the array, this will return the index of the first time the largest element occurs in the array
  */
  public static int indexOfMax(int[] a) {
    int maxIndex = 0;
    int maxValue = a[0];

// cannot use enhanced for loop, as we need to refer to the index
    for(int i = 0; i < a.length; i++) {
      if(a[i] > maxValue) {
        maxValue = a[i];
        maxIndex = i;
      }
    }

    return maxIndex;
  }
 
}