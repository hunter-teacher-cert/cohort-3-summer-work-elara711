public class Driver{
  public static void main(String[] args) {

    //Create node setup
    Node p = new Node();
    Node n1 = new Node("5");
    Node n2 = new Node("10");
    Node n3 = new Node("15");
    Node n4 = new Node("20");

    p.setNext(n1);
    n1.setNext(n2);
    n2.setNext(n3);
    n3.setNext(n4);

    //Create a new Node variable set it to point to the node with the 10 in it.
    Node n5 = new Node();
    n5.setNext(n2);

    //Create a new Node variable and instantiate it to a new Node with a value of 30.
    Node n6 = new Node("30");

    //Write the code to insert this new Node between the 10 and the 15
    n6.setNext(n3);
    n2.setNext(n6);
    
    
    System.out.println(n1.getNext().getData());
    System.out.println(n2.getNext().getData());
    System.out.println(n6.getNext().getData());
    System.out.println(n3.getNext().getData());
    //System.out.println(n4.getNext().getData());
    System.out.println(n5.getNext().getData());
  }
}