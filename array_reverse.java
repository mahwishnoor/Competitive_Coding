import java.util.*;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            reversed.add(a.get(i));
        }
        return reversed;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();

        // Read elements into list
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        // Call the function
        List<Integer> res = Result.reverseArray(arr);

        // Print result
        for (int num : res) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
