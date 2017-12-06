package com.black.singleton;

class WhiteTriangle extends Triangle {
    WhiteTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    public String toString() {
        return "White triangle{" +
                "a = " + getA() +
                ", b = " + getB() +
                ", c = " + getC() +
                ", color = '" + getColor() + '\'' +
                ", square = " + square() +
                '}';
    }
}
