import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =0;
        int o=n-1;
        int sum1 = 0;
        int sum2 = 0;
        int a[] = new int[n*n];
        for(int i=0; i < n*n; i++){
            a[i] = in.nextInt();
            if (i-m == n+1){
                sum1 += a[i];
                m = i;
            }
            if(i-o == n-1){
                sum2+= a[i];
                o = i;
            }
            }
        System.out.println((sum1+a[0])-(sum2+a[n-1]-a[n*n-1]) > 0 ? (sum1+a[0])-(sum2+a[n-1]-a[n*n-1]): 0 - ((sum1+a[0])-(sum2+a[n-1]-a[n*n-1])));
        }
    }

