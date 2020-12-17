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
    private UI inventory;
    private UI map;
    public Player(BufferedImage player, UI inventory, UI map, double realX, double realY)
    {
        this.player = player;
        this.inventory = inventory;
        this.map = map;
        this.realX = realX;
        this.realY = realY;
        x = 0;
        y = 0;
        playerPlaceHolder = new Ellipse2D.Double(realX, realY, 10, 10);
        coins = 0;
    }
    
    public void drawInventory(Graphics2D g2D, GamePanel panel1)
    {
        inventory.drawUI(g2D, panel1);
    }
    
    public void drawMap(Graphics2D g2D, GamePanel panel1) {
        map.drawUI(g2D, panel1);
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