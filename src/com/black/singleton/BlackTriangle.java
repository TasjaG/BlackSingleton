package com.black.singleton;

class BlackTriangle extends Triangle {
    BlackTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    public String toString() {
        return "Black triangle{" +
                "a = " + getA() +
                ", b = " + getB() +
                ", c = " + getC() +
                ", color = '" + getColor() + '\'' +
                ", square = " + square() +
                '}';
    }
}
