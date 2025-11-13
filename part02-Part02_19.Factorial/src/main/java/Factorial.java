
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give a number:");

        int giveNumber = Integer.valueOf(scanner.nextLine());
        
        int answer = 1;
        int counter = 1;

        while (counter <= giveNumber) {
            answer *= counter;
            counter ++;

        }
        System.out.println("Factorial:" + answer);

    }
}
