package balanced_array;

public class balanced_array {
    public static int isBalanced(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) { // Even index, check for even number
                return 0;
            } else if (i % 2 != 0 && arr[i] % 2 == 0) { // Odd index, check for odd number
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr1 = {2, 1, 4, 3};
        System.out.println("Array 1 is balanced: " + isBalanced(arr1)); // Output: 1

        int[] arr2 = {2, 4, 6, 8};
        System.out.println("Array 2 is balanced: " + isBalanced(arr2)); // Output: 0

        int[] arr3 = {1, 3, 5, 7};
        System.out.println("Array 3 is balanced: " + isBalanced(arr3)); // Output: 0
    }
}
