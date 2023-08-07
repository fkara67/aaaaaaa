import java.util.Scanner;

public class TicketPriceCalculation {
    public static void main(String[] args) {

        double pricePerKm = 0.10;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in km: ");
        int d = input.nextInt();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
        int tripType = input.nextInt();

        if (age < 0 || d < 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Incorrect entry!");
            return;
        }

        double ageDiscountRate = 0;
        if (age < 12) {
            ageDiscountRate = 0.50;
        } else if (age < 24) {
            ageDiscountRate = 0.10;
        } else if (age > 65) {
            ageDiscountRate = 0.30;
        }

        double normalPrice = d * pricePerKm;
        double ageDiscount = normalPrice * ageDiscountRate;
        double priceWithDiscount = normalPrice - ageDiscount;
        double totalPrice;
        if (tripType == 2) {
            double roundTripDiscount = priceWithDiscount * 0.20;
            totalPrice = priceWithDiscount - roundTripDiscount;
            totalPrice *= 2;
        }
        else{
            totalPrice = priceWithDiscount;
        }



        System.out.println("Total Price : " + totalPrice + " TL.");

    }
}