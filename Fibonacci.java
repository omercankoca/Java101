import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = input.nextInt();
        int i = 0;
        int firstNumber = 0;
        int secondNumber = 1;

        for (i = 1; i <= n; i++) {
            System.out.println(firstNumber + " ");
            int tempNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = tempNumber;
        }

    }
}
