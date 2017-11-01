package net.ukr.kaminskiy;

public class EqualityOfDiagonalsException extends Exception {
    @Override
    public String getMessage() {
        return "Different diagonals are not a rectangle! Specify another point!";
    }
}
