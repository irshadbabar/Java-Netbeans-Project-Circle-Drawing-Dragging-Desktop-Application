package com.drawingapp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
/**
 * 
 * DrawCircle class take parameters for circle
 * and draw it on panel
 */
public class DrawCircle {
    /**
     * Draw circle using parameters
     * @param g     graphics references of panel
     * @param circle    it contains circle values
     * @param color     it contains color values
     * 
     */
    public void DrawCircle(Graphics2D g,CirclePojo circle,Color color){
        
        Shape c = new Ellipse2D.Double(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius()); // circle shape
        
        g.setPaintMode(); // paint mode for giving background color to shape
        g.setColor(color); // circle color
        g.fillOval(circle.getX(),circle.getY(), circle.getRadius(), circle.getRadius());
        
        g.draw(c); // draw it
    }
}
