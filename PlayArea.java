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
    private ArrayList<String> quadrants;
    public PlayArea(String fileName)
    {
        t = new AffineTransform();
        t.translate(500, 10);
        t.scale(10, 10);
        try
        {
            playArea = ImageIO.read(new File(fileName));
        }
        catch (Exception e)
        {
        }
    }

    public void changePlayArea()
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