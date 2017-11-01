package net.ukr.kaminskiy;

public class Circle extends Shape {

    private Point one;
    private Point two;

    public Circle(Point one, Point two) throws SamePointsException {
        super();
        this.one = one;
        this.two = two;

        myExceptionForCircle();
    }

    public Circle() {
        super();
        // TODO Auto-generated constructor stub
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

    @Override
    double getPerimetr() {
        // TODO Auto-generated method stub
        return Math.PI * 2 * Point.sideLength(one, two);
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(Point.sideLength(one, two), 2);
    }

    @Override
    public String toString() {
        return "Circle [Perimetr = " + getPerimetr() + ", Area = " + getArea() + "]";
    }

    public void myExceptionForCircle() throws SamePointsException {
        if (one.equals(two)) throw new SamePointsException();
    }
}