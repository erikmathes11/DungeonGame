import java.util.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
public class Quadrant
{
    private BufferedImage quadrantImage;
    private ArrayList<Prop> props;
    private AffineTransform t;
    private boolean generate;
    private Polygon bounds;
    private int[] xArray;
    private int[] yArray;
    private int x;
    private int y;
    public Quadrant(BufferedImage quadrantImage, ArrayList<Prop> props,int x, int y)
    {
        this.quadrantImage = quadrantImage;
        this.props = props;
        t = new AffineTransform();
        generate = false;
        //xArray = new int[]{1, 1, 2, 2}; //still need to set up bounds of each quadrant
        //yArray = new int[]{1, 1, 2, 2};
        this.x = x;
        this.y = y;
        t.translate(x, y);
        t.scale(5, 5);
        //bounds = new Polygon(xArray, yArray, 4);
    }

    public void drawQuadrant(Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(quadrantImage, t, panel1);
    }

    public boolean getGenerate ()
    {
        return generate;
    }

    public void setGenerate (boolean generate2)
    {
        generate = generate2;
    }

    // public Polygon getBounds ()
    // {
        // return bounds;
    // }

    
}