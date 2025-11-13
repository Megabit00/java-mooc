
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());


            if (num == 9999) {
                break;

            }

            list.add(num);



        }
            int compare = list.get(0);
            for(int i = 0; i < list.size(); i++){
                int numero = list.get(i);
                
                if (numero < compare) {
                    compare = numero;


                    
                }
                

            }

                System.out.println("Smallest number: " + compare);

                for(int index = 0; index < list.size(); index++){
                    int second = list.get(index);
                    if (second == compare) {
                        System.out.println("Found at index: " + index);
                    }

                }

        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }


}
