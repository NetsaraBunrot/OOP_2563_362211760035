package LAB9;

public class Employee {
    // class attributes
    private String emp_id;
    private String name;
    private String position;
    private String email;
    private Double salary;

    // constructor

    public Employee() {
    }

    public Employee(String emp_id, String name, String position, String email, Double salart) {
        this.emp_id = emp_id;
        this.name = name;
        this.position = position;
        this.email = email;
        this.salary = salart;
    }

    //getter and setter

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalart() {
        return salary;
    }

    public void setSalart(Double salart) {
        this.salary = salart;
    }

    // toString
    @Override
    public String toString() {
        return "Employee{" +
                "emp_id='" + emp_id + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", salart=" + salary +
                '}';
    }
}