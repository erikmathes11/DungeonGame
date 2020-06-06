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
    private Quadrant ground5Quadrant;
    private Quadrant ground6Quadrant;
    private Quadrant ground7Quadrant;
    private Quadrant ground8Quadrant;
    private Quadrant ground9Quadrant;
    private PlayArea town;
    public GamePanel ()
    {
        super();
        try
        {
            ground1Picture = ImageIO.read(new File("Ground1Picture.png"));
            ground2Picture = ImageIO.read(new File("Ground2Picture.png"));
            ground3Picture = ImageIO.read(new File("Ground3Picture.png"));
            ground4Picture = ImageIO.read(new File("Ground4Picture.png"));
        }
        catch(Exception e)
        {

        }
        props = new ArrayList<Prop>();
        ground1Quadrant = new Quadrant(ground1Picture, props, -100, -425); //each quadrant is 500, 500 and middle is 400, 75
        ground2Quadrant = new Quadrant(ground2Picture, props, 400, -425);
        ground3Quadrant = new Quadrant(ground3Picture, props, 900, -425);
        ground4Quadrant = new Quadrant(ground4Picture, props, -100, 75);
        ground5Quadrant = new Quadrant(ground1Picture, props, 400, 75);
        ground6Quadrant = new Quadrant(ground2Picture, props, 900, 75);
        ground7Quadrant = new Quadrant(ground3Picture, props, -100, 575);
        ground8Quadrant = new Quadrant(ground4Picture, props, 400, 575);
        ground9Quadrant = new Quadrant(ground1Picture, props, 900, 575);
        //add props later
        //quadrants = new Quadrant[3][3];
        quadrants = new Quadrant[][]{{ground1Quadrant, ground2Quadrant, ground3Quadrant},{ground4Quadrant, ground5Quadrant, ground6Quadrant},{ground7Quadrant, ground8Quadrant, ground9Quadrant}};
        town = new PlayArea(quadrants);
    }

    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        //town.drawPlayArea(g2D, this); //won't do anything yet
        ground1Quadrant.drawQuadrant(g2D, this);
        ground2Quadrant.drawQuadrant(g2D, this);
        ground3Quadrant.drawQuadrant(g2D, this);
        ground4Quadrant.drawQuadrant(g2D, this);
        ground5Quadrant.drawQuadrant(g2D, this);
        ground6Quadrant.drawQuadrant(g2D, this);
        ground7Quadrant.drawQuadrant(g2D, this);
        ground8Quadrant.drawQuadrant(g2D, this);
        ground9Quadrant.drawQuadrant(g2D, this);
        try
        {
            Thread.sleep(40);
        }
        catch (Exception e)
        {

        }
        this.repaint();
    }

}