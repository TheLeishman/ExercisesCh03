/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.ch03;

/**
 *
 * @author pmlei
 */
/*
import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Promt the user to enter filing status
        System.out.println("(0-single filer, 1-married jointly or "
                + "qualifying widow(er), 2-married seperately, 3-head of "
                + "household)");
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        
        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        
        // Compute tax
        double tax = 0;
        
        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if ((income <= 82250))
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
                        (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
                        (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
                        (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
                        (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        
        }
        else if (status == 1) {
            if (income <= 8350)
                tax = 
            else if (income <= 33950)
                tax = 
            else if ((income <= 82250))
                tax = 
            else if (income <= 171550)
                tax = 
            else if (income <= 372950)
                tax = 
            else
                tax = 
        }
        else if (status == 2) {
            if (income <= 8350)
                tax = 
            else if (income <= 33950)
                tax = 
            else if ((income <= 82250))
                tax = 
            else if (income <= 171550)
                tax = 
            else if (income <= 372950)
                tax = 
            else
                tax = 
        }
        else if (status == 3) {
            if (income <= 8350)
                tax = 
            else if (income <= 33950)
                tax = 
            else if ((income <= 82250))
                tax = 
            else if (income <= 171550)
                tax = 
            else if (income <= 372950)
                tax = 
            else
                tax = 
        }
        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        
        // Display the result
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
}
*/