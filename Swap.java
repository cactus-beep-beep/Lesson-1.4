/*
AP CS A
Name: Cameron Bakhtiari
Date: 8/27/25
Teacher: Ms. Gee
Assignment: Lesson 1.4 Notes
Description:
    * Based on the code to "copy" variables, write code
    * that swaps the value two int variables x and y.
    * Use java.util.Scanner to prompt values for int
    * variables x and y.
    * Hint: you might need to create new variable(s).
*/


public class Swap {
    public static void main(String[] args){

        int x = 0;
        int y = 1;
        System.out.println("Before swap x: " + x);
        System.out.println("Before swap y: " + y);
        
        System.out.println("Swapping...");
        
        int z = x;
        x = y;
        y = z;
        
        System.out.println("After swap x: " + x);
        System.out.println("After swap y: " + y);
    }
}