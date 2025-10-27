
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        
        System.out.println("Give speed:");
        
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        int speedlimit = 120;
        
        if (firstNumber > speedlimit) {
            
            System.out.println("Speeding ticket!");
        
        
        }
                
                
    }
}
