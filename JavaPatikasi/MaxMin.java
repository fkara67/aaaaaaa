import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter?: ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            int k = input.nextInt();

            if (k > max) {
                max = k;
            }
            if (k < min) {
                min = k;
            }
        }
        System.out.println("Min Number: " + min);
        System.out.println("Max number: " + max);
    }
}
