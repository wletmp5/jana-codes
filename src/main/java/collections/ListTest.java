package collections;

import threads.Th2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        //This is will not work since that is not a String class
        //myList.add(new Th2());
        myList.add("cat");
        myList.add("dog");
        myList.add("bird");
        myList.add("cat");
        myList.add("dog");
        myList.add("bird");

        for(String item : myList){
            System.out.println(item);
        }
    }

}
