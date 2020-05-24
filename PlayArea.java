import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Graphics2D;
import java.util.*;
public class PlayArea
{
    private BufferedImage playArea;
    private AffineTransform t;
    private BufferedImage[][] quadrants;
    private Polygon rectangle;
    public PlayArea(BufferedImage[][] quadrants)
    {
        t = new AffineTransform();
        t.translate(500, 10);
        t.scale(10, 10);
        this.quadrants = quadrants;
        int[] xValues = {500, 500, 1000, 1000};
        int[] yValues = {10, 510, 10, 510};
        rectangle = new Polygon(xValues, yValues, 4);
    }

    public void changeCenterQuadrant()
    {
        
    }

    public void drawPlayArea(Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(playArea, t, panel1);
    }

    public void movePlayAreaForward()
    {
        t.translate(1, 1);
    }

    public void movePlayAreaBackWard()
    {
        t.translate(-1 , -1);
    }
}