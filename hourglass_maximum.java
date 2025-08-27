import java.util.*;

public class HourglassSum {
    public static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;  // lowest possible value
        
        for (int i = 0; i <= 3; i++) {  // 6 - 2 = 4
            for (int j = 0; j <= 3; j++) {
                int top = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                int mid = arr[i+1][j+1];
                int bottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                int sum = top + mid + bottom;
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        // Read input
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Compute and print result
        System.out.println(hourglassSum(arr));
    }
}
