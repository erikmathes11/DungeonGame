import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.geom.*;
public class Frame2
{
    private Image frame;
    private AffineTransform t;
    private BufferedImage frameBufferedImage;
    private Color transparent;
    public Frame (Image frame, AffineTransform t, Graphics2D g2D)
    {
        this.frame = frame;
        this.t = t;
        transparent = new Color (0, 0, 0, 0);
        frameBufferedImage = new BufferedImage(frame.getWidth(null), frame.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2D2 = frameBufferedImage.createGraphics();
        g2D2.drawImage(frame, 0, 0, null);
        g2D2.dispose();
        swapRGB(Color.WHITE, transparent);
        //frame = new BufferedImage(frame.getWidth(null), frame.getHeight(null), BufferedImage.TYPE_INT_ARG);
    }

    public void swapRGB(Color old, Color substitute)
    {
        for (int i = 0; i < frameBufferedImage.getWidth(); i++)
        {
            for (int j = 0; j < frameBufferedImage.getHeight(); j++)
            {
                if (frameBufferedImage.getRGB(i, j) == old.getRGB())
                {
                    frameBufferedImage.setRGB(i, j, substitute.getRGB());
                }
            }
        }
        System.out.println("Swap RGB");
    }

    public boolean getMatch(Frame frame2)
    {
        //System.out.println("New getMatch call");
        for (int i = 0; i < frameBufferedImage.getWidth(); i++)
        {
            for (int j = 0; j < frameBufferedImage.getHeight(); j++)
            {
                try
                {
                    if (frameBufferedImage.getRGB(i, j) != frame2.getFrameBufferedImage().getRGB(i, j))
                    {
                        //System.out.println("Return false");
                        return false;
                    }
                }
                catch (Exception e)
                {

                }
                //System.out.println("RGB 1: " + frameBufferedImage.getRGB(i, j));
                //System.out.println("RGB 2: " + frame2.getFrameBufferedImage().getRGB(i, j));
            }
        }
        //System.out.println("Return true");
        return true;
    }
    
    public BufferedImage getFrameBufferedImage()
    {
        return frameBufferedImage;
    }

    public void drawFrame(Graphics2D g2D, GamePanel panel1)
    {
        g2D.drawImage(frameBufferedImage, t, panel1);
    }

}