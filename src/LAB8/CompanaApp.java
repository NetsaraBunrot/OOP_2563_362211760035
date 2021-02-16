package LAB8;

import LAB7.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employee do you have?: ");
        int num = sc.nextInt();

        ArrayList<Employee>myemp = new ArrayList<Employee>();
        for (int i = 0; i < num ; i++) {
            // input data to object
            System.out.println("Please, enter employee info "+(i+1)+":");
            Employee e = inputDataobject ();
            myemp.add(e);
        }


        // display data in ArrayList
        displayObject(myemp);

    } //main

    private static void displayObject(ArrayList<Employee> myemp) {
        System.out.println("All object in ArrayList: ");
        for (Employee e:myemp) {
            System.out.println(e.toString());
        }
    }

    private static Employee inputDataobject() {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        System.out.print("Enter id card: ");
        e.setPid(sc.nextLine());

        System.out.print("Enter name: ");
        e.setName(sc.nextLine());

        System.out.print("Enter age: ");
        e.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("Enter gender: ");
        e.setGender(sc.nextLine());

        System.out.print("Enter tel: ");
        e.setTel(sc.nextLine());

        System.out.print("Enter id : ");
        e.setEmpID(sc.nextLine());

        System.out.print("Enter position: ");
        e.setPosition(sc.nextLine());

        System.out.print("Enter salary: ");
        e.setSalary(Double.parseDouble(sc.nextLine()));

        return e;
    }

}//class