
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give a string:");
        
        String givest = scan.nextLine();
        
        System.out.println("Give an integer:");
        
        int givenNumber = Integer.valueOf(scan.nextLine());
        
        
        System.out.println("Give a double:");
        
        double givenDoub = Double.valueOf(scan.nextLine());
        
        
        System.out.println("Give a boolean:");
        
        boolean giveBoo = Boolean.valueOf(scan.nextLine());
        
        
        System.out.println("You gave the string " + givest);
        System.out.println("You gave the integer " + givenNumber);
        System.out.println("You gave the double " + givenDoub);
        System.out.println("You gave the boolean " + giveBoo);
        
        
        
        
        

    }
}
