import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Graphics2D;
import java.util.*;
import java.awt.Polygon;
public class PlayArea
{
    private AffineTransform t;
    private Quadrant[][] quadrants;
    private Polygon rectangle;
    public PlayArea(Quadrant[][] quadrants)
    {
        t = new AffineTransform();
        t.translate(500, 10);
        t.scale(10, 10);
        this.quadrants = quadrants;
        int[] xValues = {500, 500, 1000, 1000};
        int[] yValues = {10, 510, 10, 510};
        rectangle = new Polygon(xValues, yValues, 4);
    }

    public void drawPlayArea(Graphics2D g2D, GamePanel panel1)
    {
        for (int i = 0; i < quadrants.length; i++)
        {
            for (int j = 0; j < quadrants[i].length; j++)
            {
                if (quadrants[i][j].getGenerate() == true)
                {
                    quadrants[i][j].drawQuadrant(g2D, panel1);
                }
            }
        }
    }
    
    // public void changeQuadrants (Player player)
    // {
        // for (int i = 0; i < quadrants.length; i++)
        // {
            // for (int j = 0; j < quadrants[i].length; j++)
            // {
                // if (quadrants[i][j].getBounds().contains(player.getPlayerX(), player.getPlayerY()))
                // {
                    // quadrants[i][j].setGenerate(true);
                // }
                // else
                // {
                    // quadrants[i][j].setGenerate(false);
                // }
            // }
        // }
    // }
    
    
    
    
}