//Programming-Codes 
//This repository contains the code with regards to all my programs 
 
//Java Programming template

// template for the number of test cases
 
import java.util.Scanner;
class template { 
  public static void main(String args[]){
    Scanner input = new Scanner( System.in );
    System.out.println("Enter the number of test cases :");
    String T = input.nextLine();
    if ( Integer.parseInt(T) >100 || Integer.parseInt(T)<1 ){
      System.out.println("Enter the number of testcases between 1 to 100");
    } 
    for ( i=0; i<Integer.parseInt(T); i++){
    
    } 
  } 
} 

// template for getting a number within a testcase ( T-N || T-N-A)

import java.util.Scanner;
class template { 
  public static void main(String args[]){
    Scanner input = new Scanner( System.in );
    System.out.println("Enter the number of test cases :");
    String T = input.nextLine();
    if ( Integer.parseInt(T) >100 || Integer.parseInt(T)<1 ){
      System.out.println("Enter the number of testcases between 1 to 100");
    } 
    for ( i=0; i<Integer.parseInt(T); i++){
        System.out.print("Enter the number :");
        String N = input.nextLine();
        if ( Integer.parseInt(N) >1000 || Integer.parseInt(N)<1 ){
          System.out.println("Enter the number of testcases between 1 to 100");
    } 
  } 
} 

// template for T-N-A

// template for getting a number within a testcase ( T-N || T-N-A)

import java.util.Scanner;
class template {
  public static void main(String args[]){
   int[] H= {};
    Scanner input = new Scanner( System.in );
    System.out.println("Enter the number of test cases :");
    String T = input.nextLine();
    if ( Integer.parseInt(T) >100 || Integer.parseInt(T)<1 ){
      System.out.println("Enter the number of testcases between 1 to 100");
    } 
    for ( i=0; i<Integer.parseInt(T); i++){
        System.out.print("Enter the number :");
        String N = input.nextLine();
        if ( Integer.parseInt(N) >1000 || Integer.parseInt(N)<1 ){
          System.out.println("Enter the number of testcases between 1 to 100");
    } 
        for ( i=0; i<Integer.parseInt(N); i++){
          String H[i] = input.nextLine();
    } 
  } 
} 
