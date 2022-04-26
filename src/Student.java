// defining the Student class
public class Student {

    // defining attributes or properties

    String studentFirstName;
    String studentLastName;
    int expectedYearToGraduate;
    double studentGPA;
    boolean declaredMajor;

    // Student class constructor able to create instance
    public Student(String studentFirstName, String studentLastName, int expectedYearToGraduate, double studentGPA, boolean declaredMajor) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.studentGPA = studentGPA;
        this.declaredMajor = declaredMajor;
    }

    // defining behaviour or better method, in this case find area method declaration
    public double incrementExpectedGraduationYear(){
        return (this.expectedYearToGraduate + 1);
    }
}