package com.black.singleton;

class WhiteCircle extends Circle {
    WhiteCircle(Point center, int radius) {
        super(center, radius);
    }

    @Override
    public String toString() {
        return "White circle{" +
                "center = " + getCenter() +
                ", radius = " + getRadius() +
                ", color = '" + getColor() + '\'' +
                ", square = " + square() +
                '}';
    }
}
