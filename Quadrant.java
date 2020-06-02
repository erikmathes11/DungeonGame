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
    private int[] x;
    private int[] y;
    public Quadrant(BufferedImage quadrantImage, ArrayList<Prop> props)
    {
        this.quadrantImage = quadrantImage;
        this.props = props;
        t = new AffineTransform();
        generate = false;
        x = new int[]{}; //still need to set up bounds of each quadrant
        y = new int[]{};
        bounds = new Polygon(x, y, 4);
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
    
    public Polygon getBounds ()
    {
        return bounds;
    }
    
    
    
    
}