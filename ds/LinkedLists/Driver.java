import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("Usman");
    l.add("Elizabeth");
    l.add("Erwin");
    l.add("David");
    System.out.println(l);
    System.out.println(l.size());
    System.out.println(l.get_Helper(2).toString());

    l.add(4, "Luca");
    System.out.println(l);

    System.out.println(l.indexOf("Usman"));
  }
}