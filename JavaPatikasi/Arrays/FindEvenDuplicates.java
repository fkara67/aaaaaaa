public class FindEvenDuplicates {
    public static void main(String[] args) {
        int[] list = {3, 8, 3, 2, 2, 9, 10, 8, 1, 33, 9, 10};
        int[] duplicate = new int[list.length / 2];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0) {
                    if (!contains(duplicate,list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < startIndex; i++) {
            System.out.print(duplicate[i] + " ");
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