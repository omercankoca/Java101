import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int attempt = 4;
        int select;
        int wallet = 1500;

        while (attempt > 0) {
            System.out.print("Username : ");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();
            if (userName.equals("omerzan") && password.equals("1234a")) {
                System.out.println("Logged in succesfully.");
                do {

                    System.out.println("Please select the operation you want to perform.\n" +
                            "1-Withdraw Money\n" +
                            "2-Deposit Money\n" +
                            "3-Check Balance\n" +
                            "4-Log Out");
                    System.out.print("Enter : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Please enter the amount you wish to withdraw : ");
                        int money = input.nextInt();
                        if (money<wallet){
                            wallet = wallet - money;
                        }else {
                            System.out.println("Insufficient balance. You have only : " + wallet);
                        }
                    } else if (select == 2) {
                        System.out.print("Please enter the amount you wish to deposit : ");
                        int money = input.nextInt();
                        wallet = wallet + money;
                    } else if (select == 3) {
                        System.out.println("Remaining balance in your account : " + wallet);
                    }
                } while (select != 4);
                System.out.println("Logged out!!");
                break;
            } else {
                attempt--;
                if (attempt == 0) {
                    System.out.println("You have logged in incorrectly. Your account has been blocked");
                } else if (attempt == 1) {
                    System.out.println("You have logged in incorrectly. Please try again. This is your last attempt");
                } else {
                    System.out.println("You have logged in incorrectly. Please try again.You have " + attempt + " attempt!!");
                }
            }
        }
    }
}
