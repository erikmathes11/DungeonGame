import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class CoinPouch extends Currency
{
    private BufferedImage coinPouch;
    private double x;
    private double y;
    public CoinPouch (BufferedImage coinPouch, double x, double y)
    {
        super(coinPouch, x, y);
        this.coinPouch = coinPouch;
        this.x = x;
        this.y = y;
    }
    
}