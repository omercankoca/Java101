import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        double result = 0.0;
        for (int n = 1 ; n<=i; n++){
            result += ((double) 1 /n);
        }
        System.out.println(result);
    }
}
