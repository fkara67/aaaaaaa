import java.util.Scanner;
public class Calculator {
     Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int n1 = input.nextInt();

    System.out.print("Enter second number: ");
    int n2 = input.nextInt();

    System.out.println("1- Addition\n2- Substraction\n3- Multiplication\n4- Division");        System.out.print("What is your choice: ");
    int operation = input.nextInt();
    

    switch (operation) {
        case 1 :
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            break;
        case 2:
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            break;

        case 3:
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            break;

        case 4:
            if(n2 != 0) {
                double division = (double) n1 / (double) n2;
                System.out.println(n1 + " / " + n2 + " = " + division);
            }
            else {
                System.out.println("A number cannot be divided by zero");
            }
            break;
            default:
                System.out.println("You entered incorrectly");
        }

    }
}