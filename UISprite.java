import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class UISprite extends UIElement
{
    private BufferedImage spriteImage;
    private ImageIcon uISprite;
    private double x;
    private double y;
    private double scale;
    public UISprite (BufferedImage spriteImage, ImageIcon uISprite, double x, double y, double scale)
    {
        super(spriteImage, x, y, scale);
        this.spriteImage = spriteImage;
        this.uISprite = uISprite;
        this.x = x;
        this.y = y;
        t.translate(x, y);
        this.scale = scale;
        t.scale(scale, scale);
    }

    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        uISprite.paintIcon(panel1, g2D, 0, 0);
    }

    
    
    
}