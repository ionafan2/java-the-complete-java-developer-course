package com.ionafan2.jtcjdc.s6;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //distance between this Point and Point 0,0
    public double distance() {
        return distance(0, 0);
    }

    //distance between this Point and another Point
    public double distance(Point p) {
        return Math.sqrt(
                (this.getX() - p.getX()) * (this.getX() - p.getX()) +
                        (this.getY() - p.getY()) * (this.getY() - p.getY())
        );
    }

    //distance between this Point and Point x,y
    public double distance(int x, int y) {
        return distance(new Point(x, y));
    }
}
