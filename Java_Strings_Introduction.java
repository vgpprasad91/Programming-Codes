//hackerrank java strings introduction 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String abc = "";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        char[] first  = A.toLowerCase().toCharArray();
        char[] second = B.toLowerCase().toCharArray();
        int minLength = Math.min(A.length(), B.length());
        for(int i = 0; i < minLength; i++)
        { 
          if (first[i] != second[i]){ 
              if (A.charAt(i) > B.charAt(i)){
                abc = "Yes";
                break;
              }
            else{
                abc = "No";
                break;
            }}
            else {
               abc = A.length() > B.length()?"Yes":"No";    
            } 
        } 
        System.out.println(abc);
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}
