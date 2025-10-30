
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int countNumbers = 0;
        while (true) {
            
            System.out.println("Give a number:");

            int givenNumber = Integer.valueOf(scanner.nextLine());
        
            if (givenNumber == 0) {
                System.out.println("Average of the numbers: " + ((double) count/ countNumbers));
                break;

            }else  {
                count += givenNumber;
                countNumbers += 1;
            }
        }

    }
}
