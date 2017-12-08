package com.black.singleton;

/**
 * Created by Victoria on 05.12.2017.
 */
public class WhiteFactory extends BaseFactory {
    @Override
    Circle createCircle(Point p, int radius) {
        return new WhiteCircle(p, radius);
    }

    @Override
    Triangle createTriangle(Point p1, Point p2, Point p3) {
        return new WhiteTriangle(p1, p2, p3);
    }

    @Override
    public String toString() {
        return "WhiteFactory";
    }
}
