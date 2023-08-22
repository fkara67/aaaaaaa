public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int length = matrix.length;
        int[][] tranpose = new int[matrix[0].length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tranpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrix: ");
        printMatrix(matrix);

        System.out.println("Transpose: ");
        printMatrix(tranpose);
    }
    static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}