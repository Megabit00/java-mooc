



import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        // Calculate sum
        int sum = first + second;

        // Calculate square root of the sum
        double squareRoot = Math.sqrt(sum);

        // Print the result
        System.out.println(squareRoot);
    }
}
