//Programming-Codes
//This repository contains the code with regards to all my programs

//Binary to decimal with Integer.parseInt()

// import the necessary java files
import java.util.Scanner;

//create a class
class Bintodec {
  public static void main(String args[]){  
    Scanner input = new Scanner( System.in );
    System.outprint("Enter the number of test cases :");
    String T = input.nextLine();
    if ( Integer.parseInt(T) >100 || Integer.parseInt(T)<1 ){
      System.out.println("Enter the number of testcases between 1 to 100");
    }
    for ( i=0; i<Integer.parseInt(T); i++){
    System.out.print("Enter a binary no :");
    String binaryString = input.nextLine();
    if (binaryString.length() >8 ){
      System.out.println("Enter the length of binary string to be between 1 to 8");
    }
    System.out.println("Output: "+Integer.parseInt(binaryString, 2));
    }
  }
}

//Binary to decimal without Integer.parseInt()
