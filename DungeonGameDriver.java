import java.awt.*;
import javax.swing.*;
public class DungeonGameDriver
{
    public static void main(String[] args)
    {
        JFrame frame1 = new JFrame();
        GamePanel panel1 = new GamePanel();
        frame1.add(panel1);
        frame1.setPreferredSize(new Dimension(1920, 1080));
        frame1.pack();
        frame1.setVisible(true);
    }
}