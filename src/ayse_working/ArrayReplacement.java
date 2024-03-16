package ayse_working;


    import java.util.Arrays;

    public class ArrayReplacement {

        public static int[] replace(int[] arr, int index, int newElement) {
            // Check if the index is within the valid range
            if (index >= 0 && index < arr.length) {
                arr[index] = newElement; // Replace the element at the specified index
            } else {
                System.out.println("Invalid index. No replacement performed.");
            }

            return arr; // Return the modified array
        }

        public static void main(String[] args) {
            // Example usage
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Original Array: " + Arrays.toString(arr));
            int[] modifiedArray = replace(arr, 2, 30);
            System.out.println("Modified Array: " + Arrays.toString(modifiedArray));
        }
    }


