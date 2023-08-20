public class PLetter {
    public static void main(String[] args) {
        String[][] arr = new String[5][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == 2) {
                    arr[i][j] = " * ";
                } else if (j == 0) {
                    arr[i][j] = " * ";
                }
                else {
                    arr[i][j] = "   ";
                }
                arr[1][3] = " * ";
            }
        }

        for (String[] a : arr) {
            for (String b : a) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}