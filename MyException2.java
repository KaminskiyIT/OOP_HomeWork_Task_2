package net.ukr.kaminskiy;

public class MyException2 extends Exception {
    @Override
    public String getMessage() {
        return "Different diagonals are not a rectangle! Specify another point!";
    }
}
