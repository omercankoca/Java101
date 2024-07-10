import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int birthYear;
        String zodiacSign;
        Scanner input =new Scanner(System.in);

        System.out.print("Please enter your birth year : ");
        birthYear = input.nextInt();
        if(birthYear%12==4){
            zodiacSign = "Rat";
        } else if (birthYear%12== 5) {
            zodiacSign = "Ox";
        } else if (birthYear%12== 6) {
            zodiacSign = "Tiger";
        } else if (birthYear%12== 7) {
            zodiacSign = "Hare";
        } else if (birthYear%12== 8) {
            zodiacSign = "Dragon";
        } else if (birthYear%12== 9) {
            zodiacSign = "Snake";
        } else if (birthYear%12== 10) {
            zodiacSign = "Horse";
        } else if (birthYear%12== 11) {
            zodiacSign = "Ram";
        } else if (birthYear%12== 0) {
            zodiacSign = "Monkey";
        } else if (birthYear%12== 1) {
            zodiacSign = "Rooster";
        } else if (birthYear%12== 2) {
            zodiacSign = "Dog";
        } else if (birthYear%12== 3) {
            zodiacSign = "Pig";
        }else{
            zodiacSign = null;
        }

        if(zodiacSign != null) {

            System.out.println("Your zodiac sign is " + zodiacSign + "!!");
        }else {
            System.out.println("Wrong enrty, Try again.");
        }

    }
}
