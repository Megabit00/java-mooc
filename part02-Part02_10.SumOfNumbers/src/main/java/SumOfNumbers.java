
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int count = 0;
        while (true) {
            
            System.out.println("Give a number:");

            int givenNumber = Integer.valueOf(scanner.nextLine());
        
            if (givenNumber == 0) {
                System.out.println("Sum of the numbers: " + count);
                break;

            }else  {
                count += givenNumber;
            }
        }
    }   
}