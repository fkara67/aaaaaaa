import java.util.Scanner;

public class PrimeNumbersWithRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (isPrime(n, (int)Math.sqrt(n))) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    static boolean isPrime(int n, int control) {
        if (n <= 1) {
            return false;
        }
        if (control == 1) {
            return true;
        }
        if (n % control == 0) {
            return false;
        }
        return isPrime(n,control - 1);
    }
}