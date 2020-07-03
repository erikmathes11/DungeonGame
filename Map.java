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
    public Map (BufferedImage map, Quadrant[][] quadrants, double x, double y, double scale)
    {
        super(map, x, y, scale);
        this.map = map;
        this.quadrants = quadrants;
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
    
    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(map, t, panel1);
        for (int i = 0; i < quadrants.length; i++)
        {
            for (int j = 0; j < quadrants[i].length; j++)
            {
                quadrants[i][j].drawQuadrantOnMap(g2D, panel1);
            }
        }
    }
    
    
}