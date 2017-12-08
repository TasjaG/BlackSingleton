package com.black.singleton;


public class BlackFactory extends BaseFactory {


    public Circle createCircle(Point p, int radius) {
        return new BlackCircle(p, radius);
    }

    @Override
    public Triangle createTriangle(Point p1, Point p2, Point p3) {
        return new BlackTriangle(p1, p2, p3);
    }
}
