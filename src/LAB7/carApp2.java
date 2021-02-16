package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class carApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Car do you have?:");
        int num = sc.nextInt();

        ArrayList<Car> myCar = new ArrayList<Car>();

        for (int i = 0; i < num; i++) {
            //input data to object
            System.out.println("please, Enter Car info" + (i + 1) + ":");
            Car c = inputDataobject();
            myCar.add(c);

        }

        //display data in ArrayList
        displayObject(myCar);


    }//main

    private static void displayObject(ArrayList<Car> myCar) {
        System.out.println("All objects in ArrayList: ");
        for (Car c : myCar) {
            System.out.println(c.toString());
        }
    }


    private static Car inputDataobject() {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();
        System.out.println("Enter car id:");
        String id = sc.nextLine();
        c.setId(id);

        System.out.println("Enter car color:");
        c.setColor(sc.nextLine());

        System.out.println("Enter car brand");
        c.setBrand(sc.nextLine());
        return c;
    }
}