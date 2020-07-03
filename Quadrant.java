import java.util.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
public class Quadrant
{
    private BufferedImage quadrantImage;
    private ArrayList<Prop> props;
    private AffineTransform t2;
    private AffineTransform t;
    private boolean generate;
    private Rectangle2D.Double bounds;
    private double x;
    private double y;
    private double mapX;
    private double mapY;
    private double scale;
    private double mapScale;
    public Quadrant(BufferedImage quadrantImage, double scale, double mapScale, ArrayList<Prop> props, double x, double y, double mapX, double maxY)
    {
        this.quadrantImage = quadrantImage;
        this.props = props;
        t = new AffineTransform();
        t2 = new AffineTransform();
        generate = false;
        this.x = x;
        this.y = y;
        this.mapX = mapX;
        this.mapY = mapY;
        this.scale = scale;
        this.mapScale = mapScale;
        t.translate(x, y);
        t.scale(scale, scale);
        t2.translate(mapX, mapY);
        t2.scale(mapScale, mapScale);
        bounds = new Rectangle2D.Double(x, y, 500, 500);
    }

    public void drawQuadrant (Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(quadrantImage, t, panel1);
    }
    
    public void drawQuadrantOnMap (Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(quadrantImage, t2, panel1);
    }
    
    public void drawQuadrantHitBox (Graphics2D g2D)
    {
        g2D.draw(bounds);
    }

    public boolean getGenerate ()
    {
        return generate;
    }

    public void setGenerate (boolean generate2)
    {
        generate = generate2;
    }
    
    public void moveForward ()
    {
        t.translate(1, 0);
        bounds.setRect(t.getTranslateX(), t.getTranslateY(), 500, 500);
    }
    
    public void moveBackward ()
    {
        t.translate(-1, 0); 
        bounds.setRect(t.getTranslateX(), t.getTranslateY(), 500, 500);
    }
    
    public void moveUp ()
    {
        t.translate(0, -1);
        bounds.setRect(t.getTranslateX(), t.getTranslateY(), 500, 500);
    }
    
    public void moveDown ()
    {
        t.translate(0, 1);
        bounds.setRect(t.getTranslateX(), t.getTranslateY(), 500, 500);
    }

    public Rectangle2D.Double getBounds ()
    {
        return bounds;
    }

    
}