import java.util.Scanner;
import java.lang.Math;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        double aKenari, bKenari, cKenari, u, Alan;

        Scanner input = new Scanner(System.in);

        System.out.print("ilk kenarı giriniz : ");
        aKenari = input.nextDouble();
        System.out.print("İkinci kenarı giriniz : ");
        bKenari = input.nextDouble();
        System.out.print("Üçüncü kenarı girinizi : ");
        cKenari = input.nextDouble();

        u = (aKenari + bKenari + cKenari)/ 2 ;

        Alan = Math.sqrt(u * (u - aKenari) * (u - bKenari) * (u - cKenari));

        System.out.println("Üçgenin alanı : " + Alan);


    }
}
