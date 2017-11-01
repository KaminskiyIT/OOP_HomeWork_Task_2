package net.ukr.kaminskiy;

public class Main {

    public static void main(String[] args) {

        Point firstPoint = new Point(-2, 0);
        Point secondPoint = new Point(-2, 4);
        Point thirdPoint = new Point(2, 4);
        Point fourthPoint = new Point(2, 0);
        Point fifthPoint = new Point(0, 3);

        try {
            Square square = new Square(firstPoint, secondPoint, thirdPoint, fourthPoint);
            Triangle triangle = new Triangle(firstPoint, fifthPoint, fourthPoint);
            Circle circle = new Circle(firstPoint, fifthPoint);

            Board board = new Board();
            board.addShapeByIndex(triangle, 1);
            board.addShapeByIndex(circle, 3);
            board.addShapeByIndex(square, 4);
            System.out.println(board);

            board.deleteShapeByIndex(1);

            System.out.println(board);

        }catch (SamePointsException e) {
            System.out.println(e.getMessage());
        }catch (EqualityOfDiagonalsException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("One of the points does not exist!!!");
            System.out.println("Specify another point!");
        }
    }
}
