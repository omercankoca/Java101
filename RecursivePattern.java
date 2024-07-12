import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int i = input.nextInt();
        int userInput;
        userInput = i;
        PatternDesc(i, userInput);
    }
    static void PatternDesc(int n, int userInput) {
        if (n > 0) {
            System.out.print(n + " ");
            PatternDesc(n - 5, userInput);
        }
        if (n <= 0) {
            System.out.print(n + " ");
            PatternInc(n + 5, userInput);
        }
    }
    static void PatternInc(int n, int userInput) {
        if (n > 0 && n < userInput) {
            System.out.print(n + " ");
            PatternInc(n + 5, userInput);
        }
        if (n == userInput) {
            System.out.print(n);
        }
    }
}




