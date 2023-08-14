import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int k = -2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            k += 2;
            for (int j = 2 * n - 1; j > k; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}