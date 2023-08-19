import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = input.nextInt();
        double[] arr = new double[length];
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        double harmonicSum = 0;

        for (double n : arr) {
            harmonicSum += 1/n;
        }
        double harmonicMean = length / harmonicSum;
        System.out.println("Harmonic Mean of Elements " + harmonicMean);
    }
}