import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class TransparentBackground extends UIElement
{
    private BufferedImage transparentBackground;
    private double x;
    private double y;
    private double scale;
    private float opacity;
    private Graphics2D g2D2;
    public TransparentBackground(BufferedImage transparentBackground, double x, double y, double scale, float opacity)
    {
        super(transparentBackground, x, y, scale);
        this.transparentBackground = transparentBackground;
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.opacity = opacity;
    }

    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        //g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
        g2D.drawImage(transparentBackground, t, panel1); //something wrong with the way transparentBackground image is passed to transparent background object
        for (int i = 0; i < transparentBackground.getWidth(); i++)
        {
            for (int j = 0; j < transparentBackground.getHeight(); j++)
            {
                Color c = new Color(transparentBackground.getRGB(i, j));
                c.setAlpha(.5f);
            }
        }
    }

}