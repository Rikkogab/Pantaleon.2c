
package pantaleon;
    import java.util.Scanner;
public class Pantaleon {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter total hours worked this week: ");
        double hoursWorked = scanner.nextDouble(); 
        
        double grossWage = hourlyRate * hoursWorked; 
        double sssContribution = grossWage * 0.10;
        double netWage = grossWage - sssContribution;
        
        System.out.println("\nOutput: ");
        System.out.println("---- Wage Summary ----");
        System.out.println("Employee: " + employeeName);
        System.out.printf("Hourly Rate: %.2f\n", hourlyRate);
        System.out.printf("Hours Worked: %.0f%n", hoursWorked);
        System.out.printf("Gross Weekly Wage: ₱%.2f%n", grossWage);
        System.out.printf("SSS Contribution (10%%): ₱%.2f%n", sssContribution);
        System.out.println("--------------------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f%n", netWage);
        
        scanner.close();
   
        
    }
    
}