import java.util.Scanner;

public class SiralamaProgrami {
    public static void main(String[] args) {
        int value1, value2, value3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first value : ");
        value1 = input.nextInt();
        System.out.print("Enter the second value : ");
        value2 = input.nextInt();
        System.out.print("Enter the third value : ");
        value3 = input.nextInt();

        if (value1 < value2 && value1 < value3) {
            if (value2 < value3) {
                System.out.println("Sorting done;\n" + value1 + " " + value2 + " " + value3);
            } else {
                System.out.println("Sorting done;\n" + value1 + " " + value3 + " " + value2);
            }
        } else if (value2 < value1 && value2 < value3) {
            if (value1 < value3) {
                System.out.println("Sorting done;\n" + value2 + " " + value1 + " " + value3);
            } else {
                System.out.println("Sorting done;\n" + value2 + " " + value3 + " " + value1);
            }
        } else if (value3 < value2 && value3 < value1) {
            if (value1 < value2) {
                System.out.println("Sorting done;\n" + value3 + " " + value1 + " " + value2);
            } else {
                System.out.println("Sorting done;\n" + value3 + " " + value2 + " " + value1);
            }
        } else {
            System.out.println("Sorting done;\n" + value1 + "=" + value2 + "=" + value3);
        }
    }
}
