package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
       //List Set Map
        Set<String> mySet = new TreeSet<>();
        mySet.add("cat");
        mySet.add("dog");
        mySet.add("bird");
        mySet.add("cat");
        mySet.add("dog");
        mySet.add("bird");


        for(String item : mySet){
            System.out.println(item);
        }

    }
}
