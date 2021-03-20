public class Triangle {
    static int numOfSides = 3;


    private double base;
    private double height;
    private double sideLenOne;
    private double sideLenTwo;
    private double sideLenThree;

    public Triangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public static int getNumOfSides() {
        return numOfSides;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideLenOne() {
        return sideLenOne;
    }

    public void setSideLenOne(double sideLenOne) {
        this.sideLenOne = sideLenOne;
    }

    public double getSideLenTwo() {
        return sideLenTwo;
    }

    public void setSideLenTwo(double sideLenTwo) {
        this.sideLenTwo = sideLenTwo;
    }

    public double getSideLenThree() {
        return sideLenThree;
    }

    public void setSideLenThree(double sideLenThree) {
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
