package net.ukr.kaminskiy;

public class Board {
    private Shape[] boardForShape = new Shape[4];

    public Board() {
        super();
    }

    public void addShapeByIndex(Shape shape, int index) {
        if ((index - 1 >= 0) && (index - 1 < boardForShape.length) && (boardForShape[index - 1] == null)) {
            boardForShape[index - 1] = shape;
        } else {
            System.out.println("Error while adding a shape!");
        }
    }

    public void deleteShapeByIndex(int index) {
        if (index - 1 >= 0 && index - 1 < boardForShape.length && boardForShape[index - 1] != null) {
            boardForShape[index - 1] = null;
            System.out.println("Shape deleted");
        } else {
            System.out.println("Wrong position");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double totalarea = 0;
        for (int i = 0; i < boardForShape.length; i++) {
            if (boardForShape[i] != null) {
                sb.append(("[" + (i + 1) + "] " + boardForShape[i]));
                totalarea += boardForShape[i].getArea();
            } else {
                sb.append("[" + (i + 1) + "] " + "Empy");
            }
            sb.append(System.lineSeparator());
        }
        sb.append("Total Area = " + totalarea);
        return sb.toString();
    }
}

