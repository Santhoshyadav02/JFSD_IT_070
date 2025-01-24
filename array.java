public class SingleDimensionArrayExample {
    public static void main(String[] args) {
        // Declaration and initialization
        int[] myArray = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First element: " + myArray[0]); // Output: 10
        System.out.println("Second element: " + myArray[1]); // Output: 20

        // Looping through the array
        System.out.println("All elements in the array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}