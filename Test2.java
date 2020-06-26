import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.util.*;
public class Test2 extends JPanel
{
    private BufferedImage image;
    private ImageIcon image2;
    private JLabel label1;
    public Test2()
    {
        super();
        try
        {
            image = ImageIO.read(new File("Ground1Picture.png"));
            image2 = new ImageIcon("SelectorFrameSprite.gif");
        }
        catch(Exception e)
        {
            
        }
        label1.setIcon(image2);
        contentPane.add(label1, java.awt.BorderLayout.CENTER);
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