package com.black.singleton;

class WhiteFactory extends BaseFactory {
    WhiteFactory(String color) {
        super(color);
    }

    Circle createCircle(Point center, int radius) {
        WhiteCircle circle = new WhiteCircle(center, radius);
        circle.setColor(getColor());
        return circle;
    }

    Triangle createTriangle(Point a, Point b, Point c) {
        WhiteTriangle triangle = new WhiteTriangle(a, b, c);
        triangle.setColor(getColor());
        return triangle;
    }
}
