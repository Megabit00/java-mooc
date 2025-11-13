
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        // assume the first number is the greatest to start
        int greatest = list.get(0);

        // loop through all numbers in the list
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number > greatest) {
                greatest = number;
            }
        }

        System.out.println("The greatest number: " + greatest);
    }
}
