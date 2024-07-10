import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username : ");
        userName = input.nextLine();
        System.out.print("Enter your password : ");
        password = input.nextLine();

        if (userName.equals("omerzan") && password.equals("deneme")) {
            System.out.println("Logged in to the system \nWelcome omerzan");
        }
        else{
            System.out.println("Wrong password or username");
        }
    }
}
