import java.util.Scanner;

public class ExponentCalculator {

    static double Power(int base, int power) {
        if (power == 1) {
            return base;
        } else if (power == 0) {
            return 0;
        } else if (power < 0) {
            int absPower = -1 * power;
            int i;
            int result = 1;
            for (i = 1; i <= absPower; i++) {
                result *= base;
            }
            return (double) 1 / result;
        } else {
            return base * (Power(base, (power - 1)));
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, power;
        System.out.print("Enter the base number :");
        base = input.nextInt();
        System.out.print("Enter the exponent number : ");
        power = input.nextInt();

        System.out.println("Result : " + Power(base, power));


    }


}
