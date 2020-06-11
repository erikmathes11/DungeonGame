import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class Player
{
    private double realX;
    private double realY;
    private double x;
    private double y;
    private BufferedImage player;
    private Ellipse2D.Double playerPlaceHolder;
    private int coins;
    public Player(BufferedImage player, double realX, double realY)
    {
        this.player = player;
        this.realX = realX;
        this.realY = realY;
        x = 0;
        y = 0;
        playerPlaceHolder = new Ellipse2D.Double(realX, realY, 10, 10);
        coins = 0;
    }
    
    public double getPlayerRealX()
    {
        return realX;
    }
    
    public double getPlayerRealY()
    {
        return realY;
    }
    
    public void drawPlayer(Graphics2D g2D)
    {
        g2D.draw(playerPlaceHolder);
    }
    
    public void addCoins (int coinsToAdd)
    {
        coins += coinsToAdd;
    }
    
    public void subtractCoins (int coinsToSubtract)
    {
        coins -= coinsToSubtract;
    }
    
    public int getCoins ()
    {
        return coins;
    }
    
    
}