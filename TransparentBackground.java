import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class TransparentBackground extends UIElement
{
    private BufferedImage transparentBackground;
    private BufferedImage transparentBackgroundClone;
    private double x;
    private double y;
    private double scale;
    private float opacity;
    private float opacity2;
    private Graphics2D g2D2;
    public TransparentBackground(BufferedImage transparentBackground, double x, double y, double scale, float opacity)
    {
        super(transparentBackground, x, y, scale);
        this.transparentBackground = transparentBackground;
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.opacity = opacity;
        opacity2 = 1f;
    }

    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity);
        g2D.setComposite(ac);
        g2D.drawImage(transparentBackground, t, panel1);
        ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity2);
        g2D.setComposite(ac);
    }

}