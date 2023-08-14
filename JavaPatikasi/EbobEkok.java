import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        int min = Math.min(n1,n2);
        int ebob = 1;

        while (true) {
            if (n1 % min == 0 && n2 % min == 0) {
                ebob = min;
                break;
            }
            min--;
        }
        System.out.println("ebob " + ebob);

        System.out.println("ekok " + (n1 * n2) / ebob);

        int ekok = 0;
        int i = 1;
        while (true) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("ekok " + ekok);
    }
}