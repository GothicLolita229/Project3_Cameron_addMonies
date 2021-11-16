package linares_exam3;

/**
 * Exam 3
 * Lourdes Linares
 * 11.16.2021
 * CIS 115
 * 
 */
import java.util.Scanner;
public class Linares_Exam3 
{

    /**
     * 
     */
    public static void main(String[] args) 
    {
        //input facilitator
        Scanner k = new Scanner(System.in);
        //variables
        int pennies, nickels, dimes, quarters;
        double money;
        
        //get # of pennies
        System.out.print("Enter the number of pennies: ");
        pennies = k.nextInt();
        
        //get # of nickels
        System.out.print("Enter the number of nickels: ");
        nickels = k.nextInt();
        
        //get # of dimes
        System.out.print("Enter the number of dimes: ");
        dimes = k.nextInt();
        
        //get # of quarters
        System.out.print("Enter the number of quarters: ");
        quarters = k.nextInt();
                
        // Calculations
        
        money = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) 
                + (quarters * 0.25);
        System.out.println(String.format("%.2f", money));
        
        if (money == 1.00)
        {
            System.out.println("$1.00 exactly! You won the game!");
        }
        else if (money < 1.00)
        {
            System.out.println("Sorry, that is less than $1.00.");
        }
        else 
        {
            System.out.println("Sorry, that is more than $1.00.");
        }
        
    }
    
}
