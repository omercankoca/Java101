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

        // Kullanıcıdan bir sayı al
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // Sayının asal olup olmadığını kontrol et
        if (IsPrime(number, 2)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }

    }
}
