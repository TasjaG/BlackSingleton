package com.black.singleton;

public abstract class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private String name;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name=getClass().getSimpleName();
    }

    public String toString() {
        return this.name;
    }
}
