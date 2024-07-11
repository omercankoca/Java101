import java.util.Scanner;

public class FindLargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how many number you want :");
        int n = input.nextInt();
        if (n > 0) {
            System.out.print("Please enter 1. number :");
            int firstNumber = input.nextInt();
            int minNumber = firstNumber;
            int maxNumber = firstNumber;

            for (int i = 2; i <= n; i++) {
                System.out.print("Please enter " + i + ". number :");
                int nNumber = input.nextInt();
                if (nNumber >= maxNumber) {
                    maxNumber = nNumber;
                }
                if (nNumber <= minNumber) {
                    minNumber = nNumber;
                }


            }
            System.out.println("Your largest number is " + maxNumber + " and smallest number is " + minNumber);
        }else {
            System.out.println("Wrong entry");
        }
    }
}