public class TriangleMain {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3,3,30);

        // calling the instance method findArea() belonging to the Triangle class
        double triangleAArea = triangleA.findArea();
        System.out.println("Triangle A area: " + triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("Triangle B area: " + triangleBArea);

        // accessing non-static triangle instance attributes or variables
        System.out.println("Triangle A hypotenuse: " + triangleA.sideLenThree);
        System.out.println("Triangle B base: " + triangleB.base);

        // accessing static triangle attribute
        System.out.println("Triangle nr of sides: " + Triangle.numOfSides);

    }
}
