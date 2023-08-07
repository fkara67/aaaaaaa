import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int x = input.nextInt();

        System.out.print("b: ");
        int y = input.nextInt();

        System.out.print("c: ");
        int z = input.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        if (y > z) {
            int temp = y;
            y = z;
            z = temp;
        }

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.println("Sorting: " + x + " <= " + y + " <= " + z);
    }
}
