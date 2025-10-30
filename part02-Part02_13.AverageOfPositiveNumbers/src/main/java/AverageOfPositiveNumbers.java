
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int countNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int givenNumber = Integer.valueOf(scanner.nextLine());

            if (givenNumber == 0) {
                if (countNumbers > 0) {
                    double average = (double) sum / countNumbers;
                    System.out.println("Average of the numbers: " + average);
                } else {
                    System.out.println("Cannot calculate the average");
                }
                break; // stop when 0 is entered
            }

            if (givenNumber > 0) {
                sum += givenNumber;
                countNumbers++;
            }
            // negative numbers are ignored automatically
        }

        scanner.close();
    }
}
