package collectionsGenerics;

import java.util.*;

public class TestCollectionsGenerics {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Friday");
        String element = myList.get(0);

        Set<String> mySet = new HashSet<>();
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Friday");

        Map<String, String> myMap = new HashMap<>();
        myMap.put("value1", "John");
        myMap.put("value2", "Karla");
        myMap.put("value3", "Rosario");
        myMap.put("value3", "Carlos");

        String mapElement = myMap.get("value3");

        print(myMap.keySet());
        print(myMap.values());
    }

    public static void print(Collection<String> collection) {
        for (String element : collection) {
            System.out.println("element = " + element);
        }
    }

}