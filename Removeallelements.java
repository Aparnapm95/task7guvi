package task7;
import java.util.ArrayList;
public class Removeallelements {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Display the ArrayList before removing elements
        System.out.println("ArrayList before removing elements: " + stringList);

        // Remove all elements from the ArrayList
        stringList.clear();

        // Display the ArrayList after removing all elements
        System.out.println("ArrayList after removing all elements: " + stringList);
    }
}






