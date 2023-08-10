import java.util.Scanner;

public class PowerOf4And5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        boolean isLimit4 = true, isLimit5 = true;

        int i = 0;
        while(isLimit4||isLimit5) {
            if (Math.pow(4, i) < n && isLimit4) {
                System.out.print("Power of 4: " + (int)Math.pow(4, i));
            }else{
                isLimit4=false;
            }
            if (Math.pow(5, i)<n && isLimit5){
                System.out.print("  ---- Power of 5: " + (int)Math.pow(5, i));
            }else{
                isLimit5=false;
            }
            i++;
            System.out.println();
        }
    }
}