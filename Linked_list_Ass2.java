package Tech_4;

import java.util.*;

public class Linked_list_ass1 {
    public static void main(String[] args) {
 
        LinkedList<String> months = new LinkedList<>();
 
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("April");
        months.add("November");
 
        months.add("December");
 
        months.addFirst("January");
 
        months.add(1, "March");
        months.add(2, "February");
 
        months.add(5, "September");
        months.add(6, "October");
 
        System.out.println("All Months: " + months);
 
        System.out.print("Even months: ");
        for (int i = 1; i < months.size(); i += 2)
            System.out.print(months.get(i) + " ");
        System.out.println();
 
        System.out.print("Odd months: ");
        for (int i = 0; i < months.size(); i += 2)
            System.out.print(months.get(i) + " ");
        System.out.println();
 
        System.out.println("Printing using iterator:");
        Iterator<String> it = months.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();
 
        System.out.println("First month: " + months.getFirst());
        System.out.println("Last month: " + months.getLast());
 
        months.remove("December");
        System.out.println("After removing birthday month: " + months);
 
        boolean winter = months.contains("December") || months.contains("January") || months.contains("February");
                        
        System.out.println("Contains winter month? " + winter);
 
        System.out.println("Peek first: " + months.peekFirst());
        System.out.println("Peek last: " + months.peekLast());
 
        System.out.println("Polling first: " + months.pollFirst());
        System.out.println("Polling last: " + months.pollLast());
        System.out.println("After polling: " + months);
    }
}
