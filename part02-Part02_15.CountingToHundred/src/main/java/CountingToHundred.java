
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.valueOf(scanner.nextLine());
        int max = 100;
        while (givenNumber <= max) {
            System.out.println(givenNumber);
            givenNumber ++;
        }

    }
}
