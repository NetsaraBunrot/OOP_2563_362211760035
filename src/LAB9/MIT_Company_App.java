package LAB9;

import java.sql.*;
import java.util.ArrayList;

public class MIT_Company_App {
    public static void main(String[] args) {

        //Step1 : load driver
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Step2 : create connection
        String SQCONN = "jdbc:sqlite:MIT_Company.sqlite";

        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null)
                System.out.println("Could not connect to database.");
            else
                System.out.println("Database is connected.");

            //step3 : create  Statement
            Statement stmt = conn.createStatement();
            String sql = "select * from Employee";

            //step4 : get data from database
            ResultSet rs = stmt.executeQuery(sql);

            if (rs == null)
                System.out.println("Could not fount any data in database.");
            else {
                ArrayList<Employee> myEmp = new ArrayList<Employee>();
                while (rs.next()){
//                    System.out.println(rs.getString(1));
//                    System.out.println(rs.getString(2));
//                    System.out.println(rs.getString(3));
//                    System.out.println(rs.getString(4));
//                    System.out.println(rs.getDouble(5));

                    Employee emp = new Employee(rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getDouble(5));
                    myEmp.add(emp);

                } //while
                DisplayObject(myEmp);
            }

            // Step5 : close connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//main

    private static void DisplayObject(ArrayList<Employee> myEmp) {
        System.out.println("Data from database: ");
        for (Employee e:myEmp) {
            System.out.println(e.toString());

        }
    }
}//class