import java.util.Arrays;

public class Sieve {

  public static void main(String[] args) {

    // int n = 25;
    // System.out.println("Sieve for " + n + ": " + Arrays.toString(sieve(n)));


  }

  /**
  * Takes in an integer n and returns a boolean array that indicates, for each integer from 0 to n-1, whether the number is prime
  *
  * @param n integer we are conducting the Sieve of Eratosthenes on (determining whether 0 to n-1 are prime)
  * returns a boolean array that indicates, for each integer from 0 to n-1, whether the number is prime
  */
  public static boolean[] sieve(int n) {
    boolean isItPrime[] = new boolean[n];

    // initialize isItPrime so all elements are true, will then set select values to false with sieve
    for(int i = 0; i < n; i++) {
      isItPrime[i] = true;
    }

     // check that n > 1 first then note 1 is not prime
    if(n > 1) {
      isItPrime[1] = false;
    }

    // since 0, 1 taken care of, start at 2
    for(int i = 2; i < n; i++) {
      // if i is prime, then we may have crossing out to do
      if(isItPrime[i] == true) {
        // set all indices of isItPrime that are  multiples of i (greater than i) up until n-1 to false 
        for(int j = 2; i*j < n; j++) {
            isItPrime[i*j] = false;
        }
      }
    }  
    return isItPrime;
  }


}