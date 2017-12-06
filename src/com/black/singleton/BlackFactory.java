package com.black.singleton;

class BlackFactory extends BaseFactory {
    BlackFactory(String color) {
        super(color);
    }

    Circle createCircle(Point center, int radius) {
        BlackCircle circle = new BlackCircle(center, radius);
        circle.setColor(getColor());
        return circle;
    }

    Triangle createTriangle(Point a, Point b, Point c) {
        BlackTriangle triangle = new BlackTriangle(a, b, c);
        triangle.setColor(getColor());
        return triangle;
    }
}
