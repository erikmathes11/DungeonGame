import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
public class GamePanel extends JPanel
{
    private BufferedImage ground1Picture;
    private BufferedImage ground2Picture;
    private BufferedImage ground3Picture;
    private BufferedImage ground4Picture;
    private Quadrant[][] quadrants;
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
        //quadrants = {};
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