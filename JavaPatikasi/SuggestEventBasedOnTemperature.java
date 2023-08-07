import java.util.Scanner;
public class SuggestEventBasedOnTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Enter a temperature: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if (heat >= 5 && heat < 10) {
            System.out.print("Sinemaya gidebilirsiniz");
        }
        else if(heat>=10 && heat<=15){
            System.out.print("Sinemaya ya da pikniğe gidebilirsiniz");
        }
        else if (heat > 15 && heat <= 25){
            System.out.print("Pikniğe gidebilirsiniz");
        }
        else {
            System.out.print("Yüzmeye gidebilirsiniz");
        }
    }
}