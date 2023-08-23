import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int rowCount;
    int colCount;
    String[][] map;
    String[][] board;
    int mineCount;
    boolean game = true;

    MineSweeper(int row, int col) {
        this.rowCount = row;
        this.colCount = col;
        this.map = new String[row][col];
        this.board = new String[row][col];
        this.mineCount = (row * col) / 4;
    }

    void run() {
        System.out.println(this.mineCount);
        fillArray(board);
        prepareGame();
        print(this.map);
        System.out.println("Game Started");

        int row = 0, col = 0;
        while (game) {
            System.out.println("====================================================");
            print(board);
            System.out.println("====================================================");
            System.out.print("Row: ");
            row = input.nextInt();
            System.out.print("Col: ");
            col = input.nextInt();

            if ((row < 0 || row > this.rowCount - 1) || (col < 0 || col > this.colCount - 1)) {
                System.out.println("Out of Bounds!!!");
                System.out.println("Please Try Again");
                continue;
            }

            if (!map[row][col].equals("*")) {
                check(row,col);
            }
            else {
                board[row][col] = "*";
                print(board);
                System.out.println("Game over!");
                break;
            }
            if (isWin(board)) {
                System.out.println("=========================================");
                print(board);
                System.out.println("=========================================");
                System.out.println("You win!!!");
                break;
            }
        }
    }

    public void check(int r, int c) {
        int count = 0;
        if (board[r][c].equals("-")) {
            if ((c > 0 && r > 0) && map[r - 1][c - 1].equals("*")) {
                count++;
            }
            if (r > 0 && map[r - 1][c].equals("*")) {
                count++;
            }
            if (c > 0 && map[r][c - 1].equals("*")) {
                count++;
            }
            if (c < this.colCount - 1 && map[r][c + 1].equals("*")) {
                count++;
            }
            if (r < this.rowCount - 1 && map[r + 1][c].equals("*")) {
                count++;
            }
            if ((c < this.colCount - 1 && r < this.rowCount - 1) && map[r + 1][c + 1].equals("*")) {
                count++;
            }
            if ((c < this.colCount - 1 && r > 0) && map[r - 1][c + 1].equals("*")) {
                count++;
            }
            if ((c > 0 && r < this.rowCount - 1) && map[r + 1][c - 1].equals("*")) {
                count++;
            }
            board[r][c] = "" + count;
        }
    }

    void prepareGame() {
        fillArray(this.map);
        int count = 0;
        int randRow;
        int randCol;
        while (count != mineCount){
            randRow = random.nextInt(this.rowCount);
            randCol = random.nextInt(this.colCount);
            if (!map[randRow][randCol].equals("*")) {
                map[randRow][randCol] = "*";
                count++;
            }
        }
    }
    public void print(String[][] arr) {
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + "   ");
            }
            System.out.println();
        }
    }
    public void fillArray(String[][] m) {
        for (String[] a : m) {
            Arrays.fill(a,"-");
        }
    }
    public boolean isWin(String[][] m) {
        int count = 0;
        for (String[] a : m) {
            for (String s : a) {
                if (s.equals("-")) {
                    count++;
                }
            }
        }
        return count == this.mineCount;
    }
}