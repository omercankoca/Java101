import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat,fizik,tarih,kimya, turkce, muzik;

        Scanner inp = new Scanner (System.in);

        System.out.println("Not ortalaması hesaplama sistemine hoşgeldiniz");
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int sonuc = (mat + fizik + tarih + kimya + turkce + muzik) / 6;

        String durum = (sonuc >= 60.0) ? "geçtiniz" : "kaldınız";

        System.out.println("Not ortamalanız : " + sonuc + "  " + durum);



    }
}
