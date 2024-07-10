import java.util.Scanner;

public class ClassPassingStatus {
    public static void main(String[] args) {
        int mat, physic, music, tr, chemistry;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your math grade : ");
        mat = input.nextInt();
        System.out.print("Enter your pyhsic grade : ");
        physic = input.nextInt();
        System.out.print("Enter your music grade : ");
        music = input.nextInt();
        System.out.print("Enter your tr grade : ");
        tr = input.nextInt();
        System.out.print("Enter your chemistry grade : ");
        chemistry = input.nextInt();

        double avarage = (double) (mat + physic + music + tr + chemistry) / 5;

        if (mat <= 100 && mat >= 0 && physic <= 100 && physic >= 0 &&
                music <= 100 && music >= 0 && tr <= 100 && tr >= 0 && chemistry <= 100 && chemistry >= 0) {
            if (avarage >= 55) {
                System.out.println("You passed the class successfully!!\n Your grade degree : " + avarage);
            } else {
                System.out.println("Unfortunately you didn't pass the class");
            }
        }else{
            System.out.println("Wrong grade entered");
        }

    }
}
