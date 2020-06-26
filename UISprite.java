import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class UISprite extends UIElement
{
    private BufferedImage uISprite;
    private double x;
    private double y;
    private double scale;
    public UISprite (BufferedImage uISprite, double x, double y, double scale)
    {
        super(uISprite, x, y, scale);
        this.uISprite = uISprite;
        this.x = x;
        this.y = y;
        t.translate(x, y);
        this.scale = scale;
        t.scale(scale, scale);
    }
    
    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        
    }
    
    
    
}