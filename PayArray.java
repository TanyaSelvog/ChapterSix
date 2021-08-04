import java.util.Scanner;

/**
This program stores in an array the hours worked by
5 employees who all make the same hourly wage
*/

public class PayArray
{
    public static void main(String[] args)
    {
        final int EMPLOYEES = 5; // number of employees
        double payRate; // hourly pay rate
        double grossPay; // gross pay

        // Create an array to hold employee hours
        int[] hours = new int[EMPLOYEES];

        // Create a Scanner object for keyboard
        Scanner keyboard = new Scanner(System.in);

        // Get the hours worked by each employee
        System.out.println("Enter the hours worked by " +
        EMPLOYEES + " employees who all earn " + 
        "the same hourly rate.");

        for (int index = 0; index < EMPLOYEES; index++)
        {
            System.out.print( "Employee #" + (index + 1) + ": ");
            hours[index] = keyboard.nextInt();
        }

        // Get the hourly pay rate
        System.out.print("Enter the hourly rate for each employee: ");
        payRate = keyboard.nextDouble();

        // Display each employee's gross pay
        System.out.println("Here is each employee's gross pay: ");
        for (int index = 0; index < EMPLOYEES; index++)
        {
            grossPay = hours[index] * payRate;
            System.out.println("Employee #" + (index + 1) +
            ": $" + grossPay);
        }
    }
}

