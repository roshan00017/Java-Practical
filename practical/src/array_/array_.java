package array_;

import java.util.Arrays;

public class array_ {
    public static int isAllPossibilities(int[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        // Check if the first element is 0
        if (arr[0] != 0) {
            return 0;
        }
        
        // Check if all numbers between 0 and arr.length - 1 are present
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return 0;
            }
        }
        
        return 1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr1 = {0, 1, 2, 3};
        System.out.println("Is arr1 an array of all possibilities? " + isAllPossibilities(arr1)); // Output: 1
        
        int[] arr2 = {0, 1, 3};
        System.out.println("Is arr2 an array of all possibilities? " + isAllPossibilities(arr2)); // Output: 0
        
        int[] arr3 = {1, 2, 3};
        System.out.println("Is arr3 an array of all possibilities? " + isAllPossibilities(arr3)); // Output: 0
    }
}
