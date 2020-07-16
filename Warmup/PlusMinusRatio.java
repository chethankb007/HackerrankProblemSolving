import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int noOfZero = 0;
        int negative = 0;
        int positive = 0;
        int n = arr.length;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i] == 0)
            noOfZero++;
            if(arr[i]<0)
            negative++;
            if(arr[i]>0)
            positive++;
        }
        float positiveRatio = (float)positive / n;
        float negativeRatio = (float)negative / n;
        float zeroRatio = (float) noOfZero / n;
        System.out.println(String.format("%.6f", positiveRatio));//To set to 6 precision
        System.out.println(String.format("%.6f",negativeRatio));
        System.out.println(String.format("%.6f",zeroRatio));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
