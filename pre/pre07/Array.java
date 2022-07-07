import java.util.Arrays;
import java.util.Random;

public class Array {

  public static void main(String[] args) {
    // Testing powArray:
    // double[] a = {5, 7, 2, -3, 1, 0, 0.5, 100};
    // System.out.println(Arrays.toString(powArray(a, 4)));


    // Testing histogragram:
    // Scores will be 0 to 100, not including 100
    // final int MAX_SCORE_NONINCL = 100; 

    // // number of counters/bins for histogram
    // final int NUM_OF_COUNTERS = 5;

    // System.out.println("Bucket size: " +  ( MAX_SCORE_NONINCL / NUM_OF_COUNTERS));

    // // Setting up scores array, making sure that it can handle more scores than there are counters/bins
    // Random rand = new Random();

    // int scores[] = new int[2*NUM_OF_COUNTERS];
    // for(int i = 0; i < 2*NUM_OF_COUNTERS; i ++) {
    //     scores[i] = rand.nextInt(MAX_SCORE_NONINCL);
    // }

    // System.out.println("Scores: " + Arrays.toString(scores));

    // // Let's see how histogram does!
    // int counts[];
    // counts = histogram(scores, NUM_OF_COUNTERS);
    // System.out.println("Histogram: " + Arrays.toString(counts));

 
    
  }


  /**
  * Takes in an array, a, and returns a new array that contains the elements of a squared
  * @param a double[]
  * @return double[] that contains the elements of a^n
  */
  public static double[] powArray(double[] a, int n) {
    double[] an = new double[a.length];
    for(int i = 0; i < a.length; i++) {
      an[i] = power(a[i], n);
    }
    return an;
  }

  /**
  * Takes in numbers x and n, returns x^n
  *
  * @param x double
  * @param n int
  * @return x^n double
  */

  public static double power(double x, int n) {
    double result = 1;
    for(int i = 0; i < n; i++) {
      result *= x;
    }
    return result;
  }

  /**
  * Takes in an array of scores (1 up to 100 exclusive) and returns a histogram of numOfCounters counters
  *
  * @param scores int[]  scores that can be integers 1-100, including 1, but not including 100
  * @param numOfCounters the number of counters/bins in the histogram (bin size is 100 / numOfCounters)
  * @return int[100] of counters
  */
  public static int[] histogram(int[] scores, int numOfCounters) {
    int counts[] = new int[numOfCounters];
    int counterWidth = 100 / numOfCounters;

    for(int score : scores) {
      counts[score / counterWidth]++;
    }

    return counts;
  }


}
