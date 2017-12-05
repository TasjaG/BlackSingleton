package com.black.singleton;

public abstract class BaseFactory {
    abstract Circle createCircle(Point center, int radius);

    abstract Triangle createTriangle(Point pointA, Point pointB, Point pointC);
}
