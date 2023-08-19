import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) {
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int target = input.nextInt();

        Arrays.sort(numbers);

        int closestSmaller = 0;
        int closestLarger = 0;
        for (int num : numbers) {
            if (num < target) {
                closestSmaller = num;
            } else if (num > target) {
                closestLarger = num;
                break;
            }
        }
        System.out.println("big one: " + closestLarger);
        System.out.println("small one: " + closestSmaller);
    }
}