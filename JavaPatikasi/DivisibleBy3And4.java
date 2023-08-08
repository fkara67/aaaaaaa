import java.util.Scanner;

public class DivisibleBy3And4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                sum += i;
            }
        }
        
        System.out.println("Avg: " + sum / count);
    }
}