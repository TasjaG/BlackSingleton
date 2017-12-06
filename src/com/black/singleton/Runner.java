package com.black.singleton;

public class Runner {
    public static void main(String[] args) {
        BaseFactory blackFactory = null;
        BaseFactory writeFactory = null;
        try {
            blackFactory = AbstractFactory.getFactory("black");
            writeFactory = AbstractFactory.getFactory("white");
        } catch (IllegalColorException e) {
            e.printStackTrace();
        }

        Circle blackCircle = blackFactory.createCircle(new Point(0, 0), 10);
        Triangle writeTriangle = writeFactory.createTriangle(new Point(0, 0), new Point(1, 4), new Point(3, 4));

        System.out.println(blackCircle);
        System.out.println(writeTriangle);
    }
}
