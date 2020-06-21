import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class UIElement
{
    private BufferedImage uIElement;
    private double x;
    private double y;
    private AffineTransform t;
    private double scale;
    public UIElement(BufferedImage uIElement, double x, double y, double scale)
    {
        this.uIElement = uIElement;
        this.x = x;
        this.y = y;
        t = new AffineTransform();
        t.translate(x, y);
        this.scale = scale;
        t.scale(scale, scale);
    }
    
    public void drawUIElement(Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(uIElement, t , panel1);
    }
    
    public AffineTransform getTranslate()
    {
        return t;
    }
    
    
}