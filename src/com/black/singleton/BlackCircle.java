package com.black.singleton;

class BlackCircle extends Circle {
    BlackCircle(Point center, int radius) {
        super(center, radius);
    }

    @Override
    public String toString() {
        return "Black circle{" +
                "center = " + getCenter() +
                ", radius = " + getRadius() +
                ", color = '" + getColor() + '\'' +
                ", square = " + square() +
                '}';
    }
}
