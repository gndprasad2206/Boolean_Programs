/*  JFM1T2_AssignmentPrograms2:

    Write a program to perform the below actions and print the result. Check if the below numbers are equal or not.
    1. 30 and 20
    2. 20 and 20
    3. 20 and 30
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    30
    Enter second number: 
    20
    
    Expected Output:
    30 and 20 is not equal
     
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class CheckingEquality {
  public static void main(String[] args){       //main method
    int number_1,number_2;
    Scanner sc =new Scanner(System.in);     
    /*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
    System.out.println("Enter the number_1 value");
    number_1=sc.nextInt();
    /*Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
    System.out.println("Enter the number_2 value");
    number_2=sc.nextInt();
    if(number_1==number_2){        //check if the two numbers are equal or not
      System.out.println(number_1+" and "+number_2+" is equal");
    }
    else
      System.out.println(number_1+" and "+number_2+" is not equal");
  }//If the two numbers are equal then print both are equal else print both are not equal

}