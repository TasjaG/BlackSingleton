package com.black.singleton;

abstract class BaseFactory {
    private String color;

    BaseFactory(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    abstract Circle createCircle(Point center, int radius);

    abstract Triangle createTriangle(Point a, Point b, Point c);
}
