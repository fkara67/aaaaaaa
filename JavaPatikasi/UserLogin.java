import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("You have successfully logged in.");
        }
        else {
            System.out.println("Your username or password is incorrect");
            if (!password.equals("java123")) {
                System.out.print("Would you like to change your password? Yes or No: ");
                String answer = input.nextLine();

                if (answer.equalsIgnoreCase("Yes")) {
                    System.out.println("The new password you enter must not be the same as the password " +
                            "you entered incorrectly and the password you forgot.");
                    System.out.print("New Password: ");
                    String newPassword = input.nextLine();
                    if (newPassword.equals("java123") || newPassword.equals(password)) {
                        System.out.println("Could not create password, please enter another password.");
                    }
                    else {
                        System.out.println("Password created successfully");
                    }
                } else if(answer.equalsIgnoreCase("No")) {
                    System.out.println("Your password will not change.");
                }
            }
        }
    }
}
