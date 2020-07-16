import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
       
        Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }

       int sum1 = 0 , sum2 = 0;

    for(int i = 0; i<arr.length;i++)
    {
        for(int j = 0 ; j < arr.length ; j++)
        {
            if(i == j)
            sum1 = sum1 + arr[i][j];

            if(i == n-1- j)//dont put else if because it wont read mid element 
            sum2 = sum2 + arr[i][j];

        }
    }
    int finalsum = Math.abs(sum1 - sum2);
    System.out.println(finalsum);
    }
}
