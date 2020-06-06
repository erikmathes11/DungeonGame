import java.awt.*;
import javax.swing.*;
public class Test
{
    public static void mian(String args[])
    {
        JFrame frame1 = new JFrame();
        Test2 panel1 = new Test2();
        frame1.add(panel1);
        frame1.setPreferredSize(new Dimension(1920, 1080));
        frame1.pack();
        frame1.setVisible(true);
    }
}