// defining the Triangle class
public class Triangle {

    // defining attributes or properties
    static int numOfSides = 3;

    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // Triangle class constructor able to create instance
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // defining behaviour or better method, in this case find area method declaration
    public double findArea(){
        return (this.base * this.height) / 2;
    }
}
