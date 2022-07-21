public class Driver{
  public static void main(String[] args) {

    //Create node setup
    Node p = new Node();
    Node n1 = new Node("5");//n1 holds value of 5, next is null
    Node n2 = new Node("10");//n2 holds value of 10, next is null
    Node n3 = new Node("15");//n3 holds value of 15, next is null
    Node n4 = new Node("20");//n4 holds value of 20, next is null

    p.setNext(n1);//the object of p is pointing to the object n1 (nested inside of)
    n1.setNext(n2);//n1 is pointing at n2
    n2.setNext(n3);//n2 is pointing at n3
    n3.setNext(n4);//n3 is pointing at n4

    //Create a new Node object set it to point to the node with the 10 in it.
    Node n5 = new Node();//declares a new node 
    n5.setNext(n2);//n5 is pointing at n2

    //Create a new Node object and instantiate it to a new Node with a value of 30.
    Node n6 = new Node("30");//declares new node with a value of 30

    //Write the code to insert this new Node between the 10 and the 15
    n6.setNext(n3);//n6 is pointing at n3
    n2.setNext(n6);//n2 is now pointing at n6

        //this establishes node n (with the initial value p) as the start of the list 
      for (Node n = p; n != null; n = n.getNext())//going though loop as long as get.Next is not null
        {  
          System.out.println(n.getData());//prints what's in our current node
        }
      
    // System.out.println(n1.getNext().getData());//this will print out 10 (from original n2)
    // System.out.println(n2.getNext().getData());//this will print out 30 (from n6 with a value of 30)
    // System.out.println(n6.getNext().getData());//this will print out 15 (from original n3)
    // System.out.println(n3.getNext().getData());//this will print out 20 (from n4)
    // //System.out.println(n4.getNext().getData()); bc this wasn't pointing at anything
    // System.out.println(n5.getNext().getData());//this will print out 10 (from n2)
  }
}
