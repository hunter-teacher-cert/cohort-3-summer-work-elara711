import java.util.ArrayList;
public class Demo{
  public static void main(String[] args){
    ArrayList<String> words = new ArrayList<String>();
    ArrayList<Integer> numbers = new ArrayList<Integer>(1500);
    //adding
    words.add("fish");//line 16 changes this to notFish
    //somethingelse>> //line 11 inserts somethingelse
    words.add("fish2");
    words.add("fish3");
    words.add(1,"somethingelse");
    System.out.println(numbers);//extra since code was posted
    System.out.println(words);

    System.out.println(words.get(0));
    words.set(0,"notFish");
    words.add("anotherNotFish");
    System.out.println(words.get(0));
    System.out.println(words);
    //size()-1 is the index of the last element
    System.out.println(words.get( words.size()-1 ));
  }
}