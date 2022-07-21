/**
 * nth Fibonacci number generator by Team SumEmIfYaGotEm
 * Jenna Lin
 * collaborators: Yenming Young, Erwin Lara, Asley Ufret
 */

public class Fib
{

    public static void main( String[] args )
    {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));

        System.out.println(fib(10));
        System.out.println(fib(20));
        System.out.println(fib(40));
    }

    public static int fib(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }

        else 
        {
            return fib(n - 1) + fib(n - 2);
        }
    }


}