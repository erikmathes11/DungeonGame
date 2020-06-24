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
    private AffineTransform t;
    public TransparentBackground(BufferedImage transparentBackground, double x, double y, double scale, float opacity)
    {
        super(transparentBackground, x, y, scale);
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.opacity = opacity;
        t = new AffineTransform();
        t.translate(0, 0);
        t.scale(scale, scale);
    }

    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
        g2D.drawImage(transparentBackground, t, panel1);
    }

}