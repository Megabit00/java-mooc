
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);


        
        int numberOfnumbers = 0;
        int count = 0;

        int even = 0;

        int odd = 0;

        while (true) {

            System.out.println("Give numbers:");
            int givenNumber = Integer.valueOf(scanner.nextLine());

            if (givenNumber < 0) {
                break;
                
            }

            count += givenNumber;
            numberOfnumbers ++;
            
            if (givenNumber % 2 == 0) {
                even++;
            }else{
                odd++;  
            }

            
                
            
                
            

        }
        System.out.println("Thx! Bye!");

        System.out.println("Sum: " + count);

        System.out.println("Numbers: " + numberOfnumbers);

        System.out.println("Average: " + ((double) count /numberOfnumbers));

        System.out.println("Even: " + even);

        System.out.println("Odd: " + odd);

    }
}
