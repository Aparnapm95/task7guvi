package task7;

public class Exception {

    public static void main(String[] args) {
        // Example for ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Accessing element at index 10: " + arr[10]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        // Example for StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            System.out.println("Accessing character at index 10: " + str.charAt(10)); // Invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
        }
    }
}
