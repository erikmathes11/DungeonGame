import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.util.*;
//import java.awt.image.*;
public class MapSprite2 extends UISprite
{
    private BufferedImage spriteImage;
    private ImageIcon uISprite;
    private double x;
    private double y;
    private double scale;
    private Quadrant[][] quadrants;
    private AffineTransform t2;
    private BufferedImage uISpriteImage;
    //private BufferedImage previousUISpriteImage;
    private ArrayList<Frame> frames;
    private Frame frame;
    private boolean firstTime;
    //private Frame firstFrame;
    //private boolean firstFrameBoolean;
    //private BufferedImage firstFrameImage;
    public MapSprite (BufferedImage spriteImage, ImageIcon uISprite, Quadrant[][] quadrants, double x, double y, double scale)
    {
        super(spriteImage, uISprite, x, y, scale);
        this.spriteImage = spriteImage;
        this.uISprite = uISprite;
        this.x = x;
        this.y = y;
        t.translate(x, y);
        this.scale = scale;
        t.scale(scale, scale);
        t2 = new AffineTransform();
        t2.translate(x, y);
        t2.scale(scale, scale);
        frames = new ArrayList<Frame>();
        firstTime = true;
        //firstFrameBoolean = true;

        // firstFrameImage = new BufferedImage(uISprite.getImage().getWidth(null), uISprite.getImage().getHeight(null), BufferedImage.TYPE_INT_ARGB);
        // Graphics2D g2D2 = firstFrameImage.createGraphics();
        // g2D2.drawImage(uISprite.getImage(), 0, 0, null);
        // g2D2.dispose();
        // firstFrame = new Frame(firstFrameImage);
        // firstFrame.swapRGB(Color.WHITE, transparent);
        // while (firstFrame.getMatch(frame) != true)
        // {
        // uISpriteImage = new BufferedImage(uISprite.getImage().getWidth(null), uISprite.getImage().getHeight(null), BufferedImage.TYPE_INT_ARGB);
        // g2D2 = uISpriteImage.createGraphics();
        // g2D2.drawImage(uISprite.getImage(), 0, 0, null);
        // g2D2.dispose();
        // frame = new Frame(uISpriteImage);
        // frame.swapRGB(Color.WHITE, transparent);
        // }

        // uISpriteImage = new BufferedImage(uISprite.getImage().getWidth(null), uISprite.getImage().getHeight(null), BufferedImage.TYPE_INT_ARGB);
        // Graphics2D g2D = uISpriteImage.createGraphics();
        // g2D.drawImage(uISprite.getImage(), 0, 0, null);
        // g2D.dispose();
        // frame = new Frame(uISpriteImage);
        // frame.swapRGB(Color.WHITE, transparent);
    }

    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        frame = new Frame(uISprite.getImage(), t2, g2D);
        
        
        
        // uISpriteImage = new BufferedImage(uISprite.getImage().getWidth(null), uISprite.getImage().getHeight(null), BufferedImage.TYPE_INT_ARGB);
        // Graphics2D g2D2 = uISpriteImage.createGraphics();
        // g2D.drawImage(uISprite.getImage(), 0, 0, null);
        // g2D.dispose();
        // frame = new Frame(uISpriteImage, t2);
        // frame.swapRGB(Color.WHITE, transparent);
        
        if (firstTime == true)
        {
            frames.add(frame);
            firstTime = false;
        }
        
        for (int i = 0; i < frames.size(); i++)
        {
            if (frame.getMatch(frames.get(i)) == false)
            {
                frames.add(frame);
                System.out.println("Add Frame");
                break;
            }
        }

        for (int i = 0; i < frames.size(); i++)
        {
            frames.get(i).drawFrame(g2D, panel1);
            //g2D.drawImage(frames.get(i).getFrameBufferedImage(), t2, panel1);
        }

        // if (firstFrameBoolean == true)
        // {
        // firstFrameImage = new BufferedImage(uISprite.getImage().getWidth(null), uISprite.getImage().getHeight(null), BufferedImage.TYPE_INT_ARGB);
        // Graphics2D g2D2 = firstFrameImage.createGraphics();
        // g2D2.drawImage(uISprite.getImage(), 0, 0, null);
        // g2D2.dispose();
        // firstFrameBoolean = false;
        // firstFrame = new Frame(firstFrameImage);
        // }
        // if (firstFrame.getMatch(frame) == true)
        // {
        // }

        // uISpriteImage = new BufferedImage(uISprite.getImage().getWidth(null), uISprite.getImage().getHeight(null), BufferedImage.TYPE_INT_ARGB);
        // Graphics2D g2D2 = uISpriteImage.createGraphics();
        // g2D2.drawImage(uISprite.getImage(), 0, 0, null);
        // g2D2.dispose();
        // frame = new Frame(uISpriteImage);
        // frame.swapRGB(Color.WHITE, transparent);
        // g2D.drawImage(frame.getFrameBufferedImage(), t2, panel1);
    }

    public void removeExtraFrames ()
    {

    }

    // public boolean getFinished()
    // {
    // for (int i = 0; i < frames.size(); i++)
    // {
    // for (int j = 0; j < frames.size(); j++)
    // {
    // if (frames.get(i).getMatch(frames.get(j)) == true)
    // {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // public boolean getFinished(ImageObserver observer)
    // {
    // return observer.imageUpdate(uISpriteImage, ImageObserver.FRAMEBITS, 0, 0, uISprite.getIconWidth(), uISprite.getIconHeight());
    // }

}