
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give a year:");
        
        int number = Integer.valueOf(scan.nextLine());
        
        int toThisnum = 0;
        
        if (number > toThisnum){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is not positive.");
        }
    }
}
