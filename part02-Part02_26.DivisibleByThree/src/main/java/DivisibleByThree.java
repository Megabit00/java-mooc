
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginning = Integer.valueOf(scanner.nextLine());

        int end = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(beginning, end);

    }

    public static void divisibleByThreeInRange(int beginning, int end){
        int counter = beginning;
        while (counter <= end) {
            if (counter % 3 == 0) {
                System.out.println(counter);
                counter++;

                
            }else{
                counter++;
                continue;

            }
                
            

            
        }
    }

}
