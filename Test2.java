import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.util.*;
public class Test2 extends JPanel
{
    private BufferedImage image;
    public Test2()
    {
        super();
        try
        {
            image = ImageIO.read(new File("Ground1Picture.png"));
        }
        catch(Exception e)
        {
            
        }
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image, 500, 500, this);
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