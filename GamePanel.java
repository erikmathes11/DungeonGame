import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.util.*;
public class GamePanel extends JPanel
{
    private BufferedImage ground1Picture;
    private BufferedImage ground2Picture;
    private BufferedImage ground3Picture;
    private BufferedImage ground4Picture;
    private Quadrant[][] quadrants;
    private ArrayList<Prop> props;
    private Quadrant ground1Quadrant;
    private Quadrant ground2Quadrant;
    private Quadrant ground3Quadrant;
    private Quadrant ground4Quadrant;
    private PlayArea town;
    public GamePanel ()
    {
        super();
        try
        {
            ground1Picture = ImageIO.read(new File("Ground1Picture"));
            ground2Picture = ImageIO.read(new File("Ground2Picture"));
            ground3Picture = ImageIO.read(new File("Ground3Picture"));
            ground4Picture = ImageIO.read(new File("Ground4Picture"));
        }
        catch(Exception e)
        {

        }
        props = new ArrayList<Prop>();
        ground1Quadrant = new Quadrant(ground1Picture, props);
        ground2Quadrant = new Quadrant(ground2Picture, props);
        ground3Quadrant = new Quadrant(ground3Picture, props);
        ground4Quadrant = new Quadrant(ground4Picture, props);
        //add props later
        //quadrants = new Quadrant[3][3];
        quadrants = new Quadrant[][]{{ground1Quadrant, ground1Quadrant, ground1Quadrant},{ground2Quadrant, ground2Quadrant, ground2Quadrant},{ground3Quadrant, ground3Quadrant, ground3Quadrant}};
        town = new PlayArea(quadrants);
    }

    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        try
        {
            Thread.sleep(40);
        }
        catch (Exception e)
        {

        }
    }

}