package AirFare;
import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cs = 0;
        double tf;  
        System.out.print("Enter Distance (KM): ");
        int km = sc.nextInt();
        
       
        System.out.print("Enter Class (1 for Economy, 2 for Business): ");
        cs = sc.nextInt();
        
        
        if (cs == 1) {
            cs = 250;  
        } else if (cs == 2) {
            cs = 500;  
        } else {
            System.out.println("Invalid class selection.");
            return;  
        }
        
        
        tf = km * cs;
        
        
        if (km > 1000) {
            tf = tf - (tf * 0.10);  
        }
        
        
        System.out.printf("Total fare: %.2f\n", tf);
        
        sc.close();
    }
}