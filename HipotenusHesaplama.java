import java.util.Scanner;
import java.lang.Math;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        double aKenari,bKenari,hipotenus ;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Kenarı giriniz : ");
        aKenari = input.nextDouble();
        System.out.print("İkinci kenarı giriniz : ");
        bKenari = input.nextDouble();

        hipotenus = Math.sqrt((aKenari * aKenari) + (bKenari * bKenari));

        System.out.println("Hipotenüs değeri : " + hipotenus);
    }
}
