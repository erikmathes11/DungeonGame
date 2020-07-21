import java.awt.image.BufferedImage;
import java.awt.*;
public class Frame
{
    private BufferedImage frame;
    public Frame (BufferedImage frame)
    {
        this.frame = frame;
    }

    public void swapRGB(Color old, Color substitute)
    {
        for (int i = 0; i < frame.getWidth(); i++)
        {
            for (int j = 0; j < frame.getHeight(); j++)
            {
                if (frame.getRGB(i, j) == old.getRGB())
                {
                    frame.setRGB(i, j, substitute.getRGB());
                }
            }
        }
    }

    public BufferedImage getFrameBufferedImage()
    {
        return frame;
    }

    public boolean getMatch(Frame frame2)
    {
        for (int i = 0; i < frame.getWidth(); i++)
        {
            for (int j = 0; j < frame.getHeight(); j++)
            {
                if (frame.getRGB(i, j) != frame2.getFrameBufferedImage().getRGB(i, j))
                {
                    return false;
                }
            }
        }
        return true;
    }

    
}