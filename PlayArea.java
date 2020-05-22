import java.util.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.geom.*;
public class PlayArea
{
    private ArrayList<Prop> props;
    private BufferedImage playArea;
    private AffineTransform t;
    public PlayArea(ArrayList<Prop> props, BufferedImage playArea)
    {
        this.props = props;
        this.playArea = playArea;
        t = new AffineTransform();
    }
    
    public void initializePlayArea()
    {
        try
        {
            playArea = ImageIO.read(new File("Path1Picture.png"));
        }
        catch (Exception e)
        {
        }
    }
    
    public void drawPlayArea(Graphics2D g2D)
    {
        
    }
}