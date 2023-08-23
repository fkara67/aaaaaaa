import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.println("Welcome To MineField!");
        System.out.println("Enter the dimensions you want to play!");

        System.out.print("Count of Rows: ");
        row = input.nextInt();

        System.out.print("Count of columns: ");
        col = input.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,col);
        mineSweeper.run();

    }
}