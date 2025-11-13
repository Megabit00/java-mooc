
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");

        int givenNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int stop = Integer.valueOf(scanner.nextLine());
       


    
        int answer = 0;
        while (stop >= givenNumber) {
            
            answer += givenNumber;
            givenNumber ++;
            

            
        }
        System.out.println(answer);

    }
}
