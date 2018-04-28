package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();
        myMap.put("1", "dog");
        myMap.put("3", "cat");
        myMap.put("2", "bird");

        for (Map.Entry<String, String> entry : myMap.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

    }
}
