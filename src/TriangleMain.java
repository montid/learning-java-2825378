public class TriangleMain {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3,3,30);

        // call the instance method findArea() belonging to the Triangle class
        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);
    }
}
