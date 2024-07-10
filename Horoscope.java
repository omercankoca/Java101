import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth month as a number : ");
        month = input.nextInt();
        System.out.print("Enter your day of birth as a number : ");
        day = input.nextInt();

        if (day < 32 && day > 0) {
            switch (month) {

                case 1:
                    if (day < 22) {
                        horoscope = "Capricorn";
                    } else {
                        horoscope = "Aquarius";
                    }
                    break;
                case 2:
                    if (day < 30) {
                        if (day < 20) {
                            horoscope = "Aquarius";
                        } else {
                            horoscope = "Pisces";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 3:
                    if (day < 21) {
                        horoscope = "Pisces";
                    } else {
                        horoscope = "Aries";
                    }
                    break;
                case 4:
                    if (day < 31) {
                        if (day < 21) {
                            horoscope = "Aries";
                        } else {
                            horoscope = "Taurus";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 5:
                    if (day < 22) {
                        horoscope = "Taurus";
                    } else {
                        horoscope = "Gemini";
                    }
                    break;
                case 6:
                    if (day < 31) {
                        if (day < 23) {
                            horoscope = "Gemini";
                        } else {
                            horoscope = "Cancer";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 7:
                    if (day < 23) {
                        horoscope = "Cancer";
                    } else {
                        horoscope = "Leo";
                    }
                    break;
                case 8:
                    if (day < 23) {
                        horoscope = "Leo";
                    } else {
                        horoscope = "Virgo";
                    }
                    break;
                case 9:
                    if (day < 31) {
                        if (day < 23) {
                            horoscope = "Virgo";
                        } else {
                            horoscope = "Libra";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 10:
                    if (day < 23) {
                        horoscope = "Libra";
                    } else {
                        horoscope = "Scorpio";
                    }
                    break;
                case 11:
                    if (day < 31) {
                        if (day < 22) {
                            horoscope = "Scorpio";
                        } else {
                            horoscope = "Sagittarius";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 12:
                    if (day < 22) {
                        horoscope = "Sagittarius";
                    } else {
                        horoscope = "Capricorn";
                    }
                default:
                    isError = true;

            }

        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Wrong entry, Try Again.");
        } else {
            System.out.println("You are a " + horoscope + "!!");
        }
    }
}
