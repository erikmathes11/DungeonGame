import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.util.*;
public class MapSprite extends UISprite{
    private BufferedImage spriteImage;
    private ArrayList<BufferedImage> frames;
    private double x;
    private double y;
    private double scale;
    public MapSprite(BufferedImage spriteImage, ArrayList<BufferedImage> frames, double x, double y, double scale) {
        super(spriteImage, frames, x, y, scale);
        this.spriteImage = spriteImage;
        this.frames = frames;
        this.x = x;
        this.y = y;
        t.setToIdentity();
        t.translate(x, y);
        this.scale = scale;
        t.scale(scale, scale);
        //frame = 0;
    }
    
}