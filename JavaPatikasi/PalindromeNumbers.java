public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(22111122));
    }

    static boolean isPalindrome(int number) {
        int temp = number;
        int reversed = 0;
        int lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reversed = (reversed * 10) + lastNumber;
            temp /= 10;
        }

        return reversed == number;
    }
}