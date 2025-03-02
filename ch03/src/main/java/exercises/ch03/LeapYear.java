/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.ch03;

/**
 *
 * @author pmlei
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        // Check if the year is a Leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // Display the result in a message dialog box
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
