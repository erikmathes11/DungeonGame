import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.lang.Math.*;
public class MapSprite extends UISprite
{
    private BufferedImage spriteImage;
    private ImageIcon uISprite;
    private double x;
    private double y;
    private double scale;
    private Robot robot;
    private BufferedImage backgroundImage;
    //private BufferedImage backgroundImage2;
    private Quadrant[][] quadrants;
    private AffineTransform t3;
    private AffineTransform t4;
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
        try 
        {
            robot = new Robot();
        }
        catch (Exception e)
        {
        }
        backgroundImage = robot.createScreenCapture(new Rectangle( (int) Math.floor(x), (int) Math.floor(y), (int) (uISprite.getIconWidth() * scale) + 1, (int) (uISprite.getIconHeight() * scale) + 1));
        t2.translate(Math.floor(x), Math.floor(y)); //for background image
        t3 = new AffineTransform(); //for map
        t3.translate(x, y);
        t4 = new AffineTransform();
        

        // t2.translate((int) Math.ceil(x), (int) Math.ceil(y));
        // try
        // {
        // robot = new Robot();
        // }
        // catch (Exception e)
        // {

        // }
        // backgroundImage = robot.createScreenCapture(new Rectangle((int) Math.ceil(x), (int) Math.ceil(y), 0, uISprite.getIconHeight()));
        // backgroundImage2 = robot.createScreenCapture(new Rectangle());

    }

    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        //g2D.drawImage(backgroundImage, t2, panel1);
        g2D.setTransform(t3); //g2D2 //passing t doesn't work
        uISprite.paintIcon(panel1, g2D, 0, 0); //g2D2
        g2D.setTransform(t4);
        g2D.drawImage(backgroundImage, t2, panel1); //drawn in wrong spot
        //g2D.dispose(); //gets rid of coins label. doesn't stop from moving
        
        //System.out.println("hello");

        // Graphics2D g2D2 = g2D;
        // int xEndPoint = 0;
        // g2D2.setTransform(t);
        // uISprite.paintIcon(panel1, g2D2, (int) x, (int) y);
        // g2D.drawImage(backgroundImage, t2, panel1);
        // for (int i = (int) x; robot.getPixelColor(i, 0) == Color.WHITE; i++)
        // {
        // xEndPoint = i - 1;
        // }

        // for (int i = 0; i < quadrants.length; i++)
        // {
        // for (int j = 0; j < quadrants[i].length; j++)
        // {
        // quadrants[i][j].drawQuadrantOnMap(g2D, panel1);
        // }
        // }

        // System.out.println("xEndPoint: " + xEndPoint);

    }
    
    public static Rectangle2D.Double getSpriteBounds()
    {
        
    }
    
    
    
}