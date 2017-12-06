package com.black.singleton;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

abstract class Circle {
    private Point center;
    private int radius;
    private String color;

    Circle(Point center, int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.center = center;
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    Point getCenter() {
        return center;
    }

    int getRadius() {
        return radius;
    }

    double square() {
        return PI * pow(radius, 2);
    }
}
