package net.ukr.kaminskiy;

public class SamePointsException extends Exception{
    @Override
    public String getMessage(){
        return "Two points are the same! Specify another point!";
    }
}
