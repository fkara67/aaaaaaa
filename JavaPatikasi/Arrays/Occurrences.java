import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length = input.nextInt();
        System.out.println("Enter the numbers of the array : ");

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        int[] occurrences = new int[length];
        for (int i = 0; i < length; i++) {
            int count = 1;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (!contains(occurrences,arr[i])) {
                occurrences[i] = arr[i];
                System.out.println("The number " + arr[i] + " was repeated " + count + " times.");
            }
        }
    }

    static boolean contains(int[] arr, int value) {
        for (int e : arr) {
            if (e == value) {
                return true;
            }
        }
        return false;
    }
}