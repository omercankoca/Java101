import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter line number : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println();
            for (int k = 1; k <= (number - i); k++) {
                System.out.print(" ");

            }
            for(int j = 1 ; j<=((i*2)-1);j++){
                System.out.print("*");
            }

        }
    }
}
