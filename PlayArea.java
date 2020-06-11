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
    public PlayArea(Quadrant[][] quadrants)
    {
        t = new AffineTransform();
        t.translate(500, 10);
        t.scale(10, 10);
        this.quadrants = quadrants;
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

    public void movePlayAreaForward ()
    {
        for (int i = 0; i < quadrants.length; i++)
        {
            for (int j = 0; j < quadrants[i].length; j++)
            {
                quadrants[i][j].moveForward();
            }
        }
    }

    public void movePlayAreaBackward ()
    {
        for (int i = 0; i < quadrants.length; i++)
        {
            for (int j = 0; j < quadrants[i].length; j++)
            {
                quadrants[i][j].moveBackward();
            }
        }
    }

    public void movePlayAreaUp ()
    {
        for (int i = 0; i < quadrants.length; i++)
        {
            for (int j = 0; j < quadrants[i].length; j++)
            {
                quadrants[i][j].moveUp();
            }
        }
    }

    public void movePlayAreaDown ()
    {
        for (int i = 0; i < quadrants.length; i++)
        {
            for (int j = 0; j < quadrants[i].length; j++)
            {
                quadrants[i][j].moveDown();
            }
        }
    }

    public void changeQuadrants (Player player)
    {
        int rightQuadrantX = 0;
        int rightQuadrantY = 0;
        int belowQuadrantY = 0;
        int belowQuadrantX = 0;
        for (int i = 0; i < quadrants.length; i++)
        {
            for (int j = 0; j < quadrants[i].length; j++)
            {
                if (quadrants[i][j].getBounds().contains(player.getPlayerRealX(), player.getPlayerRealY()) == true)
                {
                    try
                    {
                        quadrants[i][j].setGenerate(true);
                        quadrants[i][j - 1].setGenerate(true);
                        quadrants[i][j + 1].setGenerate(true);
                        quadrants[i - 1][j].setGenerate(true);
                        quadrants[i + 1][j].setGenerate(true);
                    }
                    catch(Exception e)
                    {

                    }
                    rightQuadrantX = i + 1;
                    rightQuadrantY = j;
                    belowQuadrantX = i;
                    belowQuadrantY = j + 1;
                }
                else
                {
                    if (i == rightQuadrantX && j == rightQuadrantY)
                    {
                        System.out.println("Right Quadrant Generate: " + quadrants[i][j].getGenerate());
                        //Should be true
                    }
                    else if (i == belowQuadrantX && j == belowQuadrantY)
                    {
                        System.out.println("Below Quadrant Generate: " + quadrants[i][j].getGenerate());
                        //Should be true
                    }
                    else
                    {
                        try
                        {
                            quadrants[i][j].setGenerate(false);
                        }
                        catch (Exception e)
                        {
                            
                        }
                    }
                }
            }
        }
    }

    public void drawQuadrantHitBoxes (Graphics2D g2D)
    {
        for (int i = 0; i < quadrants.length; i++)
        {
            for (int j = 0; j < quadrants[i].length; j++)
            {
                quadrants[i][j].drawQuadrantHitBox(g2D);
            }
        }
    }

}