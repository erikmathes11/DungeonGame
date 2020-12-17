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
    protected int frame; //do these need to be protected?
    protected int mode;
    protected char direction;
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
        frame = 52;
        mode = 0;
        direction = 'f';
    }
    
    public void changeSpriteMode(int mode) {
        this.mode = mode;
    }
    
    public int getCurrentFrame() {
        return frame;
    }

    public void drawUIElement(Graphics2D g2D, GamePanel panel1)
    {
        if(mode == 0) {
            
        }
        else if(mode == 1) {
            this.drawForward(g2D, panel1);
        }
        else if(mode == 2) {
            this.drawBackward(g2D, panel1);
        }
        else if(mode == 3) {
            this.drawForwardRepeat(g2D, panel1);
        }
        else if(mode == 4) {
            this.drawBackwardRepeat(g2D, panel1);
        }
        else if(mode == 5) {
            this.pause(g2D, panel1);
        }
        else if(mode == 6) {
            this.drawAlternating(g2D, panel1);
        }
        
        // if(frame < frames.size()) {
            // System.out.println(frame);
            // g2D.drawImage(frames.get(frame), t, panel1);
            // frame++;
        // }
        // else {
            // frame = 0;
        // }
        //this.drawForward(g2D, panel1);
        //this.drawBackward(g2D, panel1); //must draw forward first in order to use
    }
    
    public void pause(Graphics2D g2D, GamePanel panel1) {
        g2D.drawImage(frames.get(frame), t, panel1);
    }
    
    public void drawForward(Graphics2D g2D, GamePanel panel1) {
        if(frame < frames.size()) {
            g2D.drawImage(frames.get(frame), t, panel1);
            frame++;
        }
        else {
            //System.out.println(frame);
            g2D.drawImage(frames.get(frames.size() - 1), t, panel1);
        }
    }
    
    public void drawBackward(Graphics2D g2D, GamePanel panel1) {
        if(frame > 0) {
            frame--;
            g2D.drawImage(frames.get(frame), t, panel1);
        }
        else {
            g2D.drawImage(frames.get(0), t, panel1);
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
            frame = frames.size() - 1;
        }
    }
    
    public void drawAlternating(Graphics2D g2D, GamePanel panel1) {
        if(direction == 'f' && frame == frames.size()) {
            direction = 'b';
            this.drawBackward(g2D, panel1);
        }
        else if(direction == 'f') {
            this.drawForward(g2D, panel1);
        }
        else if(direction == 'b' && frame == 0) {
            direction = 'f';
            this.drawForward(g2D, panel1);
        }
        else if(direction == 'b') {
            this.drawBackward(g2D, panel1);
        }
    }
    
    
    
}