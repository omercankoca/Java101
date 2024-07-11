import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Please enter number : ");
        int number = input.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number + " is a Perfect Number !!");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }
    }
}
