
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println("Give the first number:");
        
        int number = Integer.valueOf(scan.nextLine());
        
        
        System.out.println("Give the second number:");
        
        int secondNumber = Integer.valueOf(scan.nextLine());
        
        
        
        if (number > secondNumber){
            System.out.println("Greater number is: " + number);
        }else if (number < secondNumber){
            
            System.out.println("Greater number is: "  + secondNumber );
        }else if (number == secondNumber){
            System.out.println("The numbers are equal!");
        }
    }
}
