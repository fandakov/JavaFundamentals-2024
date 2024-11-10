package ObjectAndClasses.Students;

public class Student {

    private String firstName;
    private String secondName;
    private double grade;


    public Student(String firstName, String secondName , double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade =grade;

    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + ": " + String.format("%.2f", grade);
    }
}