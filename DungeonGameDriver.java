import java.awt.*;
import javax.swing.*;
public class DungeonGameDriver
{
    public static void main(String[] args)
    {
        JFrame frame1 = new JFrame();
        JLabel coinLabel = new JLabel("Coins: 0");
        coinLabel.setForeground(Color.BLACK);
        coinLabel.setFont(new Font(coinLabel.getFont().getName(), coinLabel.getFont().getStyle(), 20));
        GamePanel panel1 = new GamePanel(frame1);
        panel1.add(coinLabel);
        frame1.add(panel1);
        frame1.setPreferredSize(new Dimension(1920, 1080));
        frame1.pack();
        frame1.setVisible(true);
        while (panel1.getWindowClose() == false)
        {
            coinLabel.setText("Coins: " + panel1.getCoinsGamePanel());
            coinLabel.setFont(new Font(coinLabel.getFont().getName(), coinLabel.getFont().getStyle(), 20));
            try
            {
                Thread.sleep(10);
            }
            catch (Exception e)
            {
                
            }
        }
    }
}