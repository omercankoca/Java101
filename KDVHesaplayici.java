import java.util.Scanner;

public class KDVHesaplayici {
    public static void main(String[] args) {
        double KDVtutari, tutarWKDV, tutar, KDVkatSayisi = 0.18;
        Scanner input = new Scanner (System.in);

        System.out.print("Tutarı giriniz : ");
        tutar = input.nextDouble();

        KDVtutari = tutar * KDVkatSayisi;
        tutarWKDV = tutar + KDVtutari;

        System.out.println("KDV oranı : " + KDVkatSayisi);
        System.out.println("KDV\'siz tutar : " + tutar);
        System.out.println("KDV tutarı : " + KDVtutari);
        System.out.println("KDV\'li tutarınız : " + tutarWKDV);

    }
}
