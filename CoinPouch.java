import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class CoinPouch
{
    private BufferedImage coinPouch;
    private double x;
    private double y;
    private AffineTransform t;
    public CoinPouch (BufferedImage coinPouch, double x, double y)
    {
        this.coinPouch = coinPouch;
        this.x = x;
        this.y = y;
        t = new AffineTransform();
    }
    
    public void drawCoinPouch (Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(coinPouch, t, panel1);
    }
    
}