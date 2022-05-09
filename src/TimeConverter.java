
import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        int hours;
        int minutes;
        int seconds;
        int totalValue;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of hours: ");
        
        hours = scan.nextInt(); 
        
        System.out.println("Enter the number of minutes: ");
        
        minutes = scan.nextInt(); 

        System.out.println("Enter the number of seconds: ");

        seconds = scan.nextInt();
        
        totalValue = ((hours * 3600 ) + (minutes * 60 ) + (seconds));
        
        System.out.println("The total number of seconds: " + totalValue);
        
    }
    
}
