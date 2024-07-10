import java.util.Scanner;


public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz \n 1- Toplama\n 2- Çıkarma\n 3- Bölme\n 4- Çarpma");

        System.out.print("Seçiminiz : ");
        select = input.nextInt();
        if (select <= 4){
            System.out.print("İlk sayıyı giriniz : ");
            n1 = input.nextInt();

            System.out.print("İkinci sayıyı giriniz : ");
            n2 = input.nextInt();

            switch (select) {
                case 1:
                    int result = n1 + n2;
                    System.out.println("Toplama sonucunuz : " + result);
                    break;
                case 2:
                    result = n1 - n2;
                    System.out.println("Çıkarma sonucunuz : " + result);
                    break;
                case 3:
                    if (n2 !=0) {
                        result = n1 / n2;
                        System.out.println("Bölme sonucunuz : " + result);

                    }else{
                        System.out.println("Bir sayı sıfıra bölünemez");
                    }
                    break;

                case 4:
                    result = n1 * n2;
                    System.out.println("Çarpma sonucunuz : " + result);
                    break;
            }
        }else{
                System.out.println("Girdiğiniz işlem bilgisi hatalı!!");
            }

        }


    }

