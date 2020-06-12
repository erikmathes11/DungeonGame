import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
public class Currency
{
    private BufferedImage currency;
    private double x;
    private double y;
    private AffineTransform t;
    public Currency (BufferedImage currency, double x, double y)
    {
        this.currency = currency;
        this.x = x;
        this.y = y;
        t = new AffineTransform();
        t.translate(x, y);
    }
    
    public void drawCurrency(Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(currency, t, panel1);
    }
}