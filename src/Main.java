import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String studentFirstName = "Dario";
        String studentLastName = "Montingelli";
        int studentAge = 45;
        double studentGPA = 3.45;
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

        System.out.println("Name:\t" + studentFirstName);
        System.out.println("Surname:\t" + studentLastName.toUpperCase());
        System.out.println("Age:\t" + studentAge);
        System.out.println("First Initial:\t" + studentFirstInitial);
        System.out.println("Last Initial:\t" + studentLastInitial);
        System.out.println("GPA:\t" + studentGPA);
        System.out.println("Perfect Attendance:\t" + hasPerfectAttendance);
        System.out.println("What do you want to update the GPA to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + "now has a GPA of " + studentGPA);
    }
}
