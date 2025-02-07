package task7;
import java.util.*;
public class Employeetreemap {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add some employee IDs and names to the TreeMap
        employeeMap.put(101, "RAM");
        employeeMap.put(102, "PRIYA");
        employeeMap.put(103, "VARUN");
        employeeMap.put(104, "Charles");

        // Print employee names in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        
        // Get the values (employee names) from the TreeMap and sort them alphabetically
        Collection<String> employeeNames = employeeMap.values();
        List<String> nameList = new ArrayList<>(employeeNames);
        Collections.sort(nameList);  // Sorting the list of names alphabetically

        // Print the sorted names
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
