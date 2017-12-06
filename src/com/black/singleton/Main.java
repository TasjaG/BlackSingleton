package com.black.singleton;

public class Main {
    public static void main(String[] args) {
        //BaseFactory redFactory = AbstractFactory.getFactory("red");

        BaseFactory blackFactory = AbstractFactory.getFactory("black");
        BaseFactory whiteFactory = AbstractFactory.getFactory("white");
        Point pointO = new Point(0, 0);
        int radius = 5;
        Circle blackCircle = blackFactory.createCircle(pointO, radius);
        Circle whiteCircle = whiteFactory.createCircle(pointO, radius);
        Point pointB = new Point(3, 0);
        Point pointC = new Point(0, 4);
        Triangle blackTriangle = blackFactory.createTriangle(pointO, pointB, pointC);
        Triangle whiteTriangle = whiteFactory.createTriangle(pointO, pointB, pointC);

        System.out.println(blackCircle);
        System.out.println(whiteCircle);
        System.out.println(blackTriangle);
        System.out.println(whiteTriangle);
    }
}
