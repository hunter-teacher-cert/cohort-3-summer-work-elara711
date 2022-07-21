public class Gcd{

  public static int i = 0;
  public static void main(String[] apples){
       
    System.out.println( gcd(39,24) );
    
  }

  public static int gcd(int a, int b) {

    int r = 0;
    trace(r,a,b);
    while (a % b != 0) {
      r = a % b;
      a = b;
      b = r;
      trace(r,a,b);
    }//mod check loop
    return b;
  }//gcd

  public static void trace(int r, int a, int b){
    System.out.print("Loop: " + i);
    System.out.print("\tr: " + r + "\ta: " + a + "\tb: " + b + "\t");
    System.out.println();
    i++;
  }
  
}