import java.util.Scanner;


public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {

        double kilo, boy, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : ");
        kilo= input.nextDouble();

        System.out.print("Metre cinsinden boyunuzu giriniz : ");
        boy= input.nextDouble();

        sonuc = kilo / (boy*boy);

        System.out.println("Vücut Kitle Endeksiniz : " + sonuc);

    }
}
