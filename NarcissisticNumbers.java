import java.util.Scanner;

public class NarcissisticNumbers {
    public static void main(String[] args) {
        int i = 1, stepNumber, tempNumber, stepValue, result, stepPow,borderNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the border number : ");
        borderNumber = input.nextInt();


        while (i <= borderNumber ) {
            stepNumber = 0;
            result = 0;
            tempNumber = i;
            while (tempNumber != 0) {
                tempNumber /= 10;
                stepNumber++;
            }
            tempNumber = i;
            while (tempNumber != 0) {
                stepValue = tempNumber % 10;
                stepPow = 1;
                for (int k = 1; k <= stepNumber; k++) {
                    stepPow *= stepValue;
                }
                result += stepPow;
                tempNumber /= 10;
            }

            if (result == i) {
                System.out.println(result);
            }
            i++;
        }
    }
}

