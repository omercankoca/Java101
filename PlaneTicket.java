import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        int distance, age, ticketType;
        double distanceRate, ageDiscountRate, grossAmount, ageDiscount, discountedAmount, ticketTypeDiscountRate;

        distanceRate = 0.1;
        ticketTypeDiscountRate = 0.2;

        String isError = "Wrong entry";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance you will travel in KM : ");
        distance = input.nextInt();
        System.out.print("Enter your age : ");
        age = input.nextInt();
        System.out.print("Enter the ticket type (One way -> 1, Round Trip ->2) : ");
        ticketType = input.nextInt();

        if (distance > 0 && age > 0 && (ticketType == 1 || ticketType == 2)) {

            if (age <= 12) {
                ageDiscountRate = 0.5;
            } else if (age <= 24) {
                ageDiscountRate = 0.1;
            } else if (age >= 65) {
                ageDiscountRate = 0.3;
            } else {
                ageDiscountRate = 0;
            }

            grossAmount = distance * distanceRate;
            ageDiscount = grossAmount * ageDiscountRate;
            discountedAmount = grossAmount - ageDiscount;

            if (ticketType == 2) {
                discountedAmount =discountedAmount * 2;
                discountedAmount =discountedAmount * (1 - ticketTypeDiscountRate);
            }

            System.out.println("Total ticket price: " + discountedAmount + " TL");
        } else {
            System.out.println(isError);
        }

    }
}
