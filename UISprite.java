import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.util.*;
public class UISprite extends UIElement
{
    private BufferedImage spriteImage;
    private ArrayList<BufferedImage> frames;
    private double x;
    private double y;
    private double scale;
    protected Color transparent;
    private boolean repeat;
    private double length;
    private boolean removeBackground;
    public UISprite (BufferedImage spriteImage, ArrayList<BufferedImage> frames, double x, double y, double scale, boolean repeat, double length, boolean removeBackground)
    {
        super(spriteImage, x, y, scale);
        this.spriteImage = spriteImage;
        this.frames = frames;
        this.x = x;
        this.y = y;
        t.translate(x, y);
        this.scale = scale;
        t.scale(scale, scale);
        transparent = new Color(0, 0, 0, 0);
        this.repeat = repeat;
        this.length = length;
        this.removeBackground = removeBackground;
    }

    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        for (int i = 0; i < frames.size(); i++)
        {
            g2D.drawImage(frames.get(i), t, panel1);
        }
    }

    
    
    
    
    
}