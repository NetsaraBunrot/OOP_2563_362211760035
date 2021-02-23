package LAB8;

public class Teacher extends Person{
    private String university;

    // constructor

    public Teacher() {
    }

    public Teacher(String university) {
        this.university = university;
    }
//getter and setter

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void introduct(){
        super.introduce();
        System.out.println("I am a teacher at " + university);
    }

}