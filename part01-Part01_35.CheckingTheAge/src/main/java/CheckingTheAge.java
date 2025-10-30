
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");

        int inAge = Integer.valueOf(scan.nextLine());

        if (inAge >= 0 && inAge <= 120) {
            System.out.println("OK");
            
            
        }else{
            System.out.println("Impossible!");

        }

    }
}
