import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class MapSprite extends UISprite
{
    private BufferedImage spriteImage;
    private ImageIcon uISprite;
    private double x;
    private double y;
    private double scale;
    private Robot robot;
    private BufferedImage backgroundImage;
    private BufferedImage backgroundImage2;
    private Quadrant[][] quadrants;
    public MapSprite (BufferedImage spriteImage, ImageIcon uISprite, Quadrant[][] quadrants, double x, double y, double scale)
    {
        super(spriteImage, uISprite, x, y, scale);
        this.spriteImage = spriteImage;
        this.uISprite = uISprite;
        this.x = x;
        this.y = y;
        t.translate(x, y);
        this.scale = scale;
        t.scale(scale, scale);
        try
        {
            robot = new Robot();
        }
        catch (Exception e)
        {
            
        }
        backgroundImage = robot.createScreenCapture(new Rectangle((int) x, (int) y, 0, map.getHeight()));
        backgroundImage2 = robot.createScreenCapture(new Rectangle());
        
    }
    
    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        int xEndPoint = 0;
        int yEndPoint = 0;
        g2D.drawImage(map, t, panel1);
        g2D.drawImage(backgroundImage, t, panel1);
        for (int i = 0; i < quadrants.length; i++)
        {
            for (int j = 0; j < quadrants[i].length; j++)
            {
                quadrants[i][j].drawQuadrantOnMap(g2D, panel1);
            }
        }
        
        for (int i = (int) x; robot.getPixelColor(i, 0) == Color.WHITE; i++)
        {
            xEndPoint = i - 1;
        }
        for (int i = (int) y; robot.getPixelColor(0, i) == Color.WHITE; i++)
        {
            yEndPoint = i - 1;
        }
        
        System.out.println("xEndPoint: " + xEndPoint);
        System.out.println("yEndPoint: " + yEndPoint);
        
        
    }
}