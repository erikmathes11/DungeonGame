import java.awt.image.BufferedImage;
public class Player
{
    private double realX;
    private double realY;
    private double x;
    private double y;
    private BufferedImage player;
    public Player(BufferedImage player, double realX, double realY)
    {
        this.player = player;
        this.realX = realX;
        this.realY = realY;
        x = 0;
        y = 0;
    }
    
    public double getPlayerRealX()
    {
        return realX;
    }
    
    public double getPlayerRealY()
    {
        return realY;
    }
}