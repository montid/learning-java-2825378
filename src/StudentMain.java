public class StudentMain {

    public static void main(String[] args) {

        Student studentA = new Student("Dario", "Montingelli", 2030, 4.3, "Computer Science");
        Student studentB = new Student("Daniela", "Linda", 2026, 4.8, "Letters");

        System.out.println(studentA.studentFirstName + " " + studentA.studentLastName);
        //System.out.println(studentB.studentLastName);

        studentA.incrementExpectedGraduationYear();
        System.out.println("Expected Graduation Year: " + studentA.expectedYearToGraduate);

    }
}
