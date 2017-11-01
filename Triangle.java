package net.ukr.kaminskiy;

public class Triangle extends Shape {

    private Point one;
    private Point two;
    private Point three;

    public Triangle(Point one, Point two, Point three) throws MyException1 {
        super();
        this.one = one;
        this.two = two;
        this.three = three;

        myExceptionForTriangular();
    }

    public Triangle() {
        super();
    }

    public Point getOne() {
        return one;
    }

    public void setOne(Point one) {
        this.one = one;
    }

    public Point getTwo() {
        return two;
    }

    public void setTwo(Point two) {
        this.two = two;
    }

    public Point getThree() {
        return three;
    }

    public void setThree(Point three) {
        this.three = three;
    }

    @Override
    double getPerimetr() {
       return Point.sideLength(one, two) + Point.sideLength(two, three) + Point.sideLength(one, three);
    }

    @Override
    double getArea() {
        double semiperimeter = this.getPerimetr() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - Point.sideLength(one, two))
                * (semiperimeter - Point.sideLength(two, three)) * (semiperimeter - Point.sideLength(one, three)));
    }

    @Override
    public String toString() {
        return "Triangle [Perimetr = " + getPerimetr() + ", Area = " + getArea() + "]";
    }

    public void myExceptionForTriangular() throws MyException1 {
        if (one.equals(two) || one.equals(three) || two.equals(three)) throw new MyException1();
    }


}