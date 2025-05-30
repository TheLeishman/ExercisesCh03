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

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user to input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        // Prompt user to input height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        
        final double KILOGRAMS_PER_POUND = 0.45359257;
        final double METERS_PER_INCH = 0.0254;
        
        // calculate BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
        System.out.printf("Your BMI is %5.2f\n", bmi);
        
        if (bmi < 16)
            System.out.println("You are seriously underweight");
        else if (bmi < 18)
            System.out.println("You are underweight");
        else if (bmi < 24)
            System.out.println("You are normal weight");
        else if (bmi < 29)
            System.out.println("You are overweight");
        else if (bmi < 35)
            System.out.println("You are seriously overweight");
        else
            System.out.println("You are gravely overweight");
    }
}