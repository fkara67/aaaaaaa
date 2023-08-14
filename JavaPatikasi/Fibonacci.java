import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements of the Fibonacci series: ");
        int n = input.nextInt();

        int former = 0;
        int next = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(former + " ");
            int sum = former + next;
            former = next;
            next = sum;
        }
    }
}