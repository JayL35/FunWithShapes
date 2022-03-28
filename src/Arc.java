import java.awt.*;
import java.util.Scanner;

public class Arc extends Shape {
    private int startAngle;
    private int arcAngle;
    private Scanner scanner;

    public Arc(int startAngle, int arcAngle)
    {
        super();
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
    }

    @Override
    public void draw(Graphics g)
    {
        // set the color to draw the shape in
        g.setColor(getColor());

        // draw the oval given the top left corner of the enclosing
        // rectangle and the width and height
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle); // the getter methods here are INHERITED FROM SHAPE!
    }
}
