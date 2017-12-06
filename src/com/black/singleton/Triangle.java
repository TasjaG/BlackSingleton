package com.black.singleton;

import static java.lang.Math.*;

abstract class Triangle {
    private Point a, b, c;
    private String color;

    Triangle(Point a, Point b, Point c) {
        if (!isExist(a, b, c)) {
            throw new IllegalArgumentException("Triangle doesn't exist with these coordinates");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    Point getA() {
        return a;
    }

    Point getB() {
        return b;
    }

    Point getC() {
        return c;
    }

    double square() {
        return abs((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2.0;
    }

    private boolean isExist(Point a, Point b, Point c) {
        double ab = segmentLength(a, b);
        double bc = segmentLength(b, c);
        double ac = segmentLength(a, c);
        return ab + bc > ac || ab + ac > bc || bc + ac > ab;
    }

    private double segmentLength(Point point1, Point point2) {
        return sqrt(pow((point2.getX() - point1.getX()), 2) + pow((point2.getY() - point1.getY()), 2));
    }
}
