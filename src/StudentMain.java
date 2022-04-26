public class StudentMain {

    public static void main(String[] args) {

        Student studentA = new Student("Dario", "Montingelli", 2030, 4.3, false);
        Student studentB = new Student("Daniela", "Linda", 2026, 4.8, false);

        System.out.println(studentA.studentFirstName + " " + studentA.studentLastName);
        //System.out.println(studentB.studentLastName);

        double newExpectedGraduationYear = studentA.incrementExpectedGraduationYear();
        System.out.println("Expected Graduation Year: " + newExpectedGraduationYear);

    }
}
