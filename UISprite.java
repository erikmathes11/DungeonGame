import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.util.*;
public class UISprite extends UIElement
{
    private BufferedImage spriteImage;
    private ArrayList<BufferedImage> frames;
    private double x;
    private double y;
    private double scale;
    protected Color transparent;
    protected int frame;
    public UISprite (BufferedImage spriteImage, ArrayList<BufferedImage> frames, double x, double y, double scale)
    {
        super(spriteImage, x, y, scale);
        this.spriteImage = spriteImage;
        this.frames = frames;
        this.x = x;
        this.y = y;
        t.translate(x, y);
        this.scale = scale;
        t.scale(scale, scale);
        transparent = new Color(0, 0, 0, 0);
        frame = 0;
    }

    public void drawUIElement(Graphics2D g2D, GamePanel panel1)
    {
        // if(frame < frames.size()) {
            // System.out.println(frame);
            // g2D.drawImage(frames.get(frame), t, panel1);
            // frame++;
        // }
        // else {
            // frame = 0;
        // }
        this.drawForward(g2D, panel1);
        this.drawBackward(g2D, panel1); //must draw forward first in order to use
    }
    
    public void puase(Graphics2D g2D, GamePanel panel1) {
        
    }
    
    public void drawForward(Graphics2D g2D, GamePanel panel1) {
        if(frame < frames.size()) {
            g2D.drawImage(frames.get(frame), t, panel1);
            frame++;
        }
        else {
            g2D.drawImage(frames.get(frame), t, panel1);
        }
    }
    
    public void drawBackward(Graphics2D g2D, GamePanel panel1) {
        if(frame > 0) {
            frame--;
            g2D.drawImage(frames.get(frame), t, panel1);
        }
        else {
            g2D.drawImage(frames.get(frame), t, panel1);
        }
    }

    public void drawForwardRepeat(Graphics2D g2D, GamePanel panel1) {
        if(frame < frames.size()) {
            g2D.drawImage(frames.get(frame), t, panel1);
            frame++;
        }
        else {
            frame = 0;
        }
    }
    
    public void drawBackwardRepeat(Graphics2D g2D, GamePanel panel1) {
        if(frame > 0) {
            frame--;
            g2D.drawImage(frames.get(frame), t, panel1);
        }
        else {
            frame = frames.size();
        }
    }
    
    
    
}