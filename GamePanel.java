import java.awt.*;
import javax.swing.*;
public class GamePanel extends JPanel
{
    public GamePanel ()
    {
        super();
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