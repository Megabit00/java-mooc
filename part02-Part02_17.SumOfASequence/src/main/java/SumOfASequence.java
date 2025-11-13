
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");

        int givenNumber = Integer.valueOf(scanner.nextLine());
        int count = 1;
        int otherCount = 2;
        int answer = 1;
        while (otherCount <= givenNumber) {
            
            answer += count = otherCount;
            count++;
            otherCount ++;

            
        }
        System.out.println(""answer);
    }
}
