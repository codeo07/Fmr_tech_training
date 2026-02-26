package Tech_4;

import java.util.*;
 
public class Ass_3 {

    public static void main(String[] args) {
 
        

        Map<Integer, String> countries = new HashMap<>();
 
        

        countries.put(1, "India");

        countries.put(2, "United States");

        countries.put(3, "Canada");

        countries.put(4, "Germany");

        countries.put(5, "France");

        countries.put(6, "Japan");

        countries.put(7, "Australia");

        countries.put(8, "Brazil");

        countries.put(9, "South Africa");

        countries.put(10, "Italy");
 
        System.out.println("Initial Countries Map: " + countries);
 
        

        System.out.println("\nKeys (country codes): " + countries.keySet());
 
        System.out.println("Values (country names): " + countries.values());
 
        

        System.out.println("Contains value \"India\"? " + countries.containsValue("India"));
 
        

        System.out.println("Contains key 45? " + countries.containsKey(45));
 
       

        String removed = countries.remove(9);

        System.out.println("Removed key 9 -> " + removed);

        System.out.println("After removing one country: " + countries);
 
        

        Map<Integer, String> states = new HashMap<>();

        states.put(11, "Maharashtra");

        states.put(12, "Karnataka");

        states.put(13, "California");

        states.put(14, "Queensland");

        states.put(15, "Bavaria");
 
        System.out.println("\nStates Map: " + states);
 
        

        countries.putAll(states);

        System.out.println("Merged Map (countries + states): " + countries);
 
       

        String removed5 = countries.remove(5);

        System.out.println("Deleted key(5) -> " + removed5);

        System.out.println("After deleting key(5): " + countries);
 
        

        System.out.println("Is merged map empty? " + countries.isEmpty());
 
        

        Map<Integer, String> sorted = new TreeMap<>(countries);

        System.out.println("\nSorted (by key) merged map: " + sorted);
 
        

        countries.clear();

        System.out.println("\nAfter clear(), countries map: " + countries + " | isEmpty = " + countries.isEmpty());

    }

}
 
