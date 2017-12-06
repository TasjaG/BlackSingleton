package com.black.singleton;

public class Runner {
    public static void main(String[] args) {
        BaseFactory blackFactory = null;
        BaseFactory whiteFactory = null;
        try {
            blackFactory = AbstractFactory.getFactory("black");
            whiteFactory = AbstractFactory.getFactory("white");
        } catch (IllegalColorException e) {
            e.printStackTrace();
        }

        Circle blackCircle = blackFactory.createCircle(new Point(0, 0), 10);
        Triangle blackTriangle = blackFactory.createTriangle(new Point(0, 0), new Point(5, 8), new Point(7, 8));
        Circle whiteCircle = whiteFactory.createCircle(new Point(10, 10), 15);
        Triangle whiteTriangle = whiteFactory.createTriangle(new Point(0, 0), new Point(1, 4), new Point(3, 4));

        System.out.println(blackCircle);
        System.out.println(whiteCircle);
        System.out.println(blackTriangle);
        System.out.println(whiteTriangle);
    }
}
