
public class StarSign {

    public static void main(String[] args) {
        // You can test your methods here
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("---");
        printSquare(4);
        System.out.println("---");
        printRectangle(17, 3);
        System.out.println("---");
        printTriangle(4);
    }

    // PART 1: Printing stars
    public static void printStars(int number) {
        // print one star number times
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        // then print a line break
        System.out.println("");
    }

    // PART 2: Printing a square using printStars
    public static void printSquare(int size) {
        int i = 0;
        while (i < size) {
            printStars(size);
            i++;
        }
    }

    // PART 3: Printing a rectangle using printStars
    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
    }

    // PART 4: Printing a triangle using printStars
    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }
}
