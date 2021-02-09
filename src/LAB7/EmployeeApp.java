package LAB7;

public class EmployeeApp {
        public static void main(String[] args) {
            //use default constructor
            Employee emp1 = new Employee();
            //assing constructor
            Employee emp2 = new Employee("Netsara Bunrot",18,"student",20000);
            //call displayData()
            emp1.displayData();
            emp2.displayData();

            //System.out.println(emp2.);

            //assign data to emp1
            emp1.setName("Netsara Bunrot");
            emp1.setAge(22);
            emp1.setPosition("student");
            emp1.setSalary(500000);

            emp1.displayData();



        }//main
    }//class

