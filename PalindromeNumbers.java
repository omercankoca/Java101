import java.util.Scanner;

public class PalindromeNumbers {
    static String isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number) {
            return number + "=" + reverseNumber + " is a palindrom number";
        } else {
            return number + "=" + reverseNumber + " is not a palindrom number";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();

        System.out.println(isPalindrome(number));

    }
}
