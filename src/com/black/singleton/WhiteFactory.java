package com.black.singleton;

/**
 * Created by Victoria on 05.12.2017.
 */
public class WhiteFactory extends BaseFactory {
    Circle createCircle(Point p, int radius) {
        return new com.black.singleton.WhiteCircle(p, radius);
    }

    Triangle createTriangle(Point p1, Point p2, Point p3) {
        return new WhiteTriangle(p1, p2, p3);
    }
}
