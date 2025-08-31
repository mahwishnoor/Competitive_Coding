import java.util.*;
public class ArrayManipulation {

    // Function to perform the operations and return the maximum value
    public static long arrayManipulation(int n, int[][] queries) {
        // Step 1: Initialize an array of zeros with size n+1
        long[] arr = new long[n + 1];  // Use long to prevent overflow with large numbers

        // Step 2: Apply all the queries efficiently
        for (int[] query : queries) {
            int a = query[0];  // Start index (1-indexed)
            int b = query[1];  // End index (1-indexed)
            int k = query[2];  // Value to add

            arr[a - 1] += k;   // Add k at index a-1 (convert to 0-indexed)
            if (b < n) {
                arr[b] -= k;   // Subtract k at index b (convert to 0-indexed)
            }
        }

        // Step 3: Compute the prefix sum to get the final values and find the maximum
        long maxValue = 0;
        long currentValue = 0;

        for (int i = 0; i < n; i++) {
            currentValue += arr[i];  // Running sum of additions
            maxValue = Math.max(maxValue, currentValue);  // Track the maximum value
        }

        return maxValue;
    }

    public static void main(String[] args) {
        // Sample Input
        Scanner sc = new Scanner(System.in);

        // Read the size of the array and number of queries
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] queries = new int[q][3];

        // Read the queries
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j] = sc.nextInt();
            }
        }

        // Call the function and print the result
        System.out.println(arrayManipulation(n, queries));
    }
}
