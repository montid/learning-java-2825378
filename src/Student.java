// defining the Student class
public class Student {

    // defining attributes or properties

    String studentFirstName;
    String studentLastName;
    int expectedYearToGraduate;
    double studentGPA;
    String declaredMajor;

    // Student class constructor able to create instance
    public Student(String studentFirstName, String studentLastName, int expectedYearToGraduate, double studentGPA, String declaredMajor) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.studentGPA = studentGPA;
        this.declaredMajor = declaredMajor;
    }

    // defining behaviour or better method, in this case find area method declaration
    public void incrementExpectedGraduationYear(){
        this.expectedYearToGraduate = this.expectedYearToGraduate +1;
    }
}