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
        System.out.println("Surname:\t" + studentLastName);
        System.out.println("Age:\t" + studentAge);
        System.out.println("First Initial:\t" + studentFirstInitial);
        System.out.println("Last Initial:\t" + studentLastInitial);
        System.out.println("GPA:\t" + studentGPA);
        System.out.println("Perfect Attendance:\t" + hasPerfectAttendance);

    }
}
