import java.util.Scanner;

public class MultiplesOf4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n;

        do {
            System.out.print("Enter a number: ");
            n = input.nextInt();

            if (n % 4 == 0) {
                sum += n;
            }
        }while (n % 2 == 0);

        System.out.println("Total: " + sum);
    }
}