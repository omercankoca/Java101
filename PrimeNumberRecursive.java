import java.util.Scanner;

public class PrimeNumberRecursive {

    static boolean IsPrime(int number, int i) {
        if (i<2){
            return false;
        }
        if (number == i) {
            return true;
        }
        if (number % i == 0) {
            return false;
        }
        return IsPrime(number, i + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = scanner.nextInt();

        if (IsPrime(number, 2)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
}
