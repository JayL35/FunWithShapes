import java.awt.Graphics;

/**
 * Class Oval:  inherits from Shape and handles oval shapes
 * @author Barb Ericson
 */
public class Line extends Shape
{
    /** Constructor */
    public Line()
    {
        super();  // call parent constructor (note the parent's constructor has no parameters)
    }

    /**
     * Draw the shape
     * @param g   the graphics context to draw to
     */
    @Override
    public void draw(Graphics g)
    {
        // set the color to draw the shape in
        g.setColor(getColor());

        // draw the oval given the top left corner of the enclosing
        // rectangle and the width and height
        g.drawLine(getP1().x, getP1().y, getP2().x, getP2().y); // the getter methods here are INHERITED FROM SHAPE!
    }
}


