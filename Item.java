import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class Item
{
    private BufferedImage item;
    private double x;
    private double y;
    private AffineTransform t;
    public Item(BufferedImage item, double x, double y)
    {
        this.item = item;
        this.x = x;
        this.y = y;
        t = new AffineTransform();
        t.translate(x, y);
    }
    
    public void drawItem(Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(item, t, panel1);
    }
}