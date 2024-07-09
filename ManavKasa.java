import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double armut, armutTutarPerKg, elma, elmaTutarPerKg, domates, domatesTutarPerkg, muz, muzTutarPerKg, patlican , patlicanTutarPerKg,
        sonuc;

        armutTutarPerKg = 2.14;
        elmaTutarPerKg = 3.67;
        domatesTutarPerkg = 1.11;
        muzTutarPerKg = 0.95;
        patlicanTutarPerKg = 5.00;


        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armut = input.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        elma = input.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        domates = input.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        muz = input.nextDouble();
        System.out.print("Patlican Kaç Kilo? : ");
        patlican = input.nextDouble();

        armut = armut * armutTutarPerKg;
        elma = elma * elmaTutarPerKg;
        domates = domates * domatesTutarPerkg;
        muz = muz * muzTutarPerKg;
        patlican = patlican * patlicanTutarPerKg;

        sonuc = armut + elma + domates + muz + patlican;

        System.out.println("Toplam Tutar : " + sonuc + "TL");


    }
}
