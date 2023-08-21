import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length = input.nextInt();
        System.out.println("Enter the numbers of the array : ");

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print(i + 1 + ". number: ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Order: ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}