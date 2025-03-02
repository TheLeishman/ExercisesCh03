/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.ch03;

/*
Author: Paul Leishman
Class:  CS 113 Programming in Java
Date:   2/28/25
 */
import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for today's day (dateToday)
        System.out.print("Enter a number for today's day (Sun = 0, Mon = 1, Tues = 2, "
                + "Wed = 3, Thurs = 4, Fri = 5, Sat = 6): ");
        int dateToday = input.nextInt();

        // Prompt the user for number of days after (futureDay)
        System.out.print("Enter the number of days after today: ");
        int futureDay = input.nextInt();

        // Calculate the futureDayOfWeek
        int futureDayOfWeek = (dateToday + futureDay) % 7;

        // Display the the futureDayOfWeek
        System.out.print("The future day of the week is: ");
        if (futureDayOfWeek == 0) {
            System.out.println("Sunday");
        } else if (futureDayOfWeek == 1) {
            System.out.println("Monday");
        } else if (futureDayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (futureDayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (futureDayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (futureDayOfWeek == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }
    }
}

/*
--- exec:3.1.0:exec (default-cli) @ ch03 ---
Enter a number for today's day (Sun = 0, Mon = 1, Tues = 2, Wed = 3, Thurs = 4, Fri = 5, Sat = 6): 1
Enter the number of days after today: 3
The future day of the week is: Thursday
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  48.297 s
Finished at: 2025-02-28T13:38:37-08:00
------------------------------------------------------------------------
*/

