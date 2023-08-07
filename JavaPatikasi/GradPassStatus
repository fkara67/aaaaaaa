import java.util.Scanner;

public class GradePassStatus {
    public static void main(String[] args) {

        String[] lessons = {"Mat","Chemistry","Physical", "Turkish", "Music"};
        int lessonCount = 5;
        int sum = 0;
        double average;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print(lessons[i] + " point: ");
            int point = input.nextInt();
            if (point < 0 || point > 100) {
                lessonCount--;
            }
            else{
                sum += point;
            }
        }
        average = sum / lessonCount;

        if (average >= 55) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        System.out.println("Your average: " + average);
    }
}