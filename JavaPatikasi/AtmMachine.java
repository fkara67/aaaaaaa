import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("User Name :");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to Kodluyoruz Bank!");
                do {
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Balance Inquiry\n" +
                            "4-Log out");
                    System.out.print("Please select the action you want to do: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1: System.out.print("Amount of money : ");
                                int price = input.nextInt();
                                balance += price;
                                break;
                        case 2: System.out.print("Amount of money : ");
                                price = input.nextInt();
                                if (price > balance) {
                                    System.out.println("Insufficient balance.");
                                } else {
                                    balance -= price;
                                }
                                break;
                        case 3: System.out.println("Your balance : " + balance);
                                break;
                        case 4:
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                    break;
                } else {
                    System.out.println("Your Remaining Rights : " + right);
                }
                System.out.println("Wrong username or password. Try again.");
            }
        }
    }
}