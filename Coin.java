import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class Coin extends Currency
{
    private BufferedImage coin;
    private double x;
    private double y;
    public Coin(BufferedImage coin, double x, double y)
    {
        super(coin, x, y);
        this.coin = coin;
        this.x = x;
        this.y = y;
    }
    
}