package Home_Work;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0 ;

        while (count<3) {
            System.out.println("Username : ");
            String usr = sc.nextLine();

            System.out.println("Password : ");
            String pwd = sc.nextLine();
            if (usr.equals("admin") && pwd.equals("saiyai"))
            {
                System.out.println("Welcome to MT Website.");
                break;
            }
            else {
                System.out.println("Username or password not corrrct.");
                count++;
            }
            if (count==3)
            {
                System.out.println("Your account has been locked. Please, contact admin.");
            }
        }//while
    }//main
}//class
