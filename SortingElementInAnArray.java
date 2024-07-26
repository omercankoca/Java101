import java.util.Scanner;
import java.util.Arrays;

public class SortingElementInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your array's length : ");
        int arrayLength = input.nextInt();

        int[] array = new int[arrayLength];

        System.out.println("Enter elements of the array");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(i + 1 + ". element : ");
            int value = input.nextInt();
            array[i] = value;

        }

        Arrays.sort(array);

        System.out.println("Sorted :" + Arrays.toString(array));
    }


}
