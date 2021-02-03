package LAB7;

public class Student {
    // class attributes
    static String faculty = "MT RUTS";
    String name;
    int age;
    String major;

    // constructor
    // default constructor
    public Student(){
        //.....
    }

    // behavior
    public  void introduce(){
        System.out.println("My name is "+ name);
        System.out.println("I am "+ age + " years old.");
        System.out.println("I studying in "+ major);
        System.out.println("My faculty "+ faculty);


    }
    public  void  changeFaculty(String newfac){
        faculty = newfac;
    }
}