package Assignment;

import java.util.Scanner;

public class Lab3_Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count<3){
            System.out.print("username :");
            String user = sc.nextLine();

            System.out.print("password : ");
            String pass = sc.nextLine();
            if (user.equals("admin")&& pass.equals("saiyai")){
                System.out.println("Welcome to MT Website.");
                break;
            }else {
                System.out.println("username or password not correct.");
                count++;
            } if (count==3){
                System.out.println("You account has been locked. \n" +
                        "Please, contect admin.");
            }



        }


    }
}