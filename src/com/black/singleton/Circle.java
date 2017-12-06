package com.black.singleton;

public abstract class Circle extends Shape{
    private Point a;
    private int radius;
    private String name;

    public Circle(Point a, int radius) {
        this.a = a;
        this.radius = radius;
        this.name=this.getClass().getName().toString();
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}
