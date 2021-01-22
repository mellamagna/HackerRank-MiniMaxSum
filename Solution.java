import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static long sumAllBut(int[] arr, int index) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                sum += arr[i];
            }
        }
        return sum;
    }

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long[] sums = new long[arr.length];
        int i;
        for (i = 0; i < sums.length; i++) {
            sums[i] = sumAllBut(arr, i);
        }
        long minValue = sums[0];
        long maxValue = sums[0];
        for (i = 0; i < sums.length; i++) {
            if (sums[i] < minValue) {
                minValue = sums[i];
            }
            if (sums[i] > maxValue) {
                maxValue = sums[i];
            }
        }
        System.out.println(minValue + " " + maxValue); 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
