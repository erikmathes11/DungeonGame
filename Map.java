import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class Map extends UIElement
{
    private BufferedImage map;
    private double x;
    private double y;
    private double scale;
    private Quadrant[][] quadrants;
    private Robot robot;
    private BufferedImage backgroundImage;
    private BufferedImage backgroundImage2;
    public Map (BufferedImage map, Quadrant[][] quadrants, double x, double y, double scale)
    {
        super(map, x, y, scale);
        this.map = map;
        this.quadrants = quadrants;
        this.x = x;
        this.y = y;
        this.scale = scale;
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