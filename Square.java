package net.ukr.kaminskiy;

public class Square extends Shape {

    private Point one;
    private Point two;
    private Point three;
    private Point four;

    public Square(Point one, Point two, Point three, Point four) throws EqualityOfDiagonalsException, SamePointsException {
        super();
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;

        myExceptionForRectangle();
    }
    public Square() {
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
    public Point getFour() {
        return four;
    }
    public void setFour(Point four) {
        this.four = four;
    }

    @Override
    double getPerimetr() {
        return (Point.sideLength(one, two) + Point.sideLength(two, three))*2;
    }

    @Override
    double getArea() {
        return Point.sideLength(one, two) * Point.sideLength(two, three);
    }

    @Override
    public String toString() {
        return "Square [Perimetr = " + getPerimetr() + ", Area = " + getArea() + "]";
    }

    public void myExceptionForRectangle() throws SamePointsException, EqualityOfDiagonalsException {
        if (one.equals(two) || one.equals(three) || one.equals(four)) throw new SamePointsException();
        else if (two.equals(three) || two.equals(four) || three.equals(four)) throw new SamePointsException();
        else if (Point.sideLength(one, three) != Point.sideLength(two, four)) throw new EqualityOfDiagonalsException();
    }

}
