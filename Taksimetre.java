import java.util.Scanner;


public class Taksimetre {
    public static void main(String[] args) {
        double taksiMetreKatSayisi, kM, baslangicUcreti, toplamUcret, indiBindiUcreti;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Km'yi giriniz : ");
        kM = input.nextDouble();
        baslangicUcreti = 10;
        taksiMetreKatSayisi = 2.20;
        indiBindiUcreti = 20;


        toplamUcret = (kM * taksiMetreKatSayisi) + baslangicUcreti ;

        toplamUcret = (toplamUcret < indiBindiUcreti) ? indiBindiUcreti : toplamUcret ;

        System.out.println("Ödenecek Ücret : " + toplamUcret + "TL");


    }
}
