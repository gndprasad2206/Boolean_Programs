/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

class booleanOperation {
  public static void main(String[] args){         //main method
    boolean x,y;
    Scanner sc =new Scanner(System.in); /*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
    System.out.println("Enter the x boolean value");
    x=sc.nextBoolean();                 /*Take input from user
  System.out.println("Enter x as boolean value(true/false): ");
  boolean x=sc.nextBoolean();
*/
    System.out.println("Enter the y boolean value");
    y=sc.nextBoolean();
    if(x&&y){                  //print apppropriate result for boolean operations
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
    if(x||y){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
    if(x==true){
      System.out.println("false");
    }
    else{
      System.out.println("true");
    }
    if(y==true){
      System.out.println("false");
    }
    else{
      System.out.println("true");
    }
  }    
  







}