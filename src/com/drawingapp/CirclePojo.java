package com.drawingapp;

/**
 * Circle class is pojo class for
 * storing x-cordinates, y-cordinates and radius
 * @author wajahat
 */
public class CirclePojo {
    /** Circle X- Co-ordinate   **/
    private int x;
    /** Circle Y- Co-ordinate   **/
    private int y;
    /** Circle radius   **/
    private int radius;

    public CirclePojo() {
    }
    /**
     * @param x
     * @param y
     * @param radius
     */
    public CirclePojo(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
    * @return the x
    */
    public int getX() {
           return x;
    }
    /**
    * @param x the x to set
    */
    public void setX(int x) {
           this.x = x;
    }
    /**
    * @return the y
    */
    public int getY() {
           return y;
    }
    /**
    * @param y the y to set
    */
    public void setY(int y) {
           this.y = y;
    }
    /**
    * @return the radius
    */
    public int getRadius() {
           return radius;
    }
    /**
    * @param radius the radius to set
    */
    public void setRadius(int radius) {
           this.radius = radius;
    }
}
