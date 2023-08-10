import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("n must be greater than r!");
        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.print("Enter r: ");
        int r = input.nextInt();

        if (n < r) {
            System.out.println("Incorrect input!");
            return;
        }
        
        int nFac = 1;
        int rFac = 1;
        int nMinusRFac = 1;

        for (int i = n; i >= 1; i--) {
            nFac *= i;
            if (i <= r) {
                rFac *= i;
            }
            if (i <= n - r) {
                nMinusRFac *= i;
            }
        }
        int combination =  nFac / (rFac * nMinusRFac);
        System.out.println(combination);
    }
}