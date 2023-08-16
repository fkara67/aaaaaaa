import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        recur(n, n);
    }

    static void recur(int n, int first) {
        System.out.print(n + " ");
        if (n <= 0) {
            recursiveAddition(n,first);
            return;
        }
        recur(n - 5, first);
    }

    public static void recursiveAddition(int n, int first) {
        if (n == first) {
            System.out.print(n + " ");
            return;
        }
        if (n > 0) {
            System.out.print(n + " ");
        }
        recursiveAddition(n + 5, first);
    }
}