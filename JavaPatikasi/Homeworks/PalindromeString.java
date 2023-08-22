public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome3("aaaaabbbabbbaaaaa"));
        System.out.println(isPalindrome3("kayak"));
        System.out.println(isPalindrome3("xdvevevevv"));
    }


    static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    static boolean isPalindrome2(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse.equals(str);
    }

    static boolean isPalindrome3(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverse = sb.toString();

        return reverse.equals(str);
    }
}