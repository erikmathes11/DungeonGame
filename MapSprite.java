import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class MapSprite extends UISprite
{
    private BufferedImage spriteImage;
    private ImageIcon uISprite;
    private double x;
    private double y;
    private double scale;
    private Quadrant[][] quadrants;
    private AffineTransform t2;
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
    }

    public void drawUIElement (Graphics2D g2D, GamePanel panel1)
    {
        BufferedImage uISpriteImage = new BufferedImage(uISprite.getImage().getWidth(null), uISprite.getImage().getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2D2 = uISpriteImage.createGraphics();
        g2D2.drawImage(uISprite.getImage(), 0, 0, null);
        g2D2.dispose();
        for (int i = 0; i < uISpriteImage.getWidth(); i++)
        {
            for (int j = 0; j < uISpriteImage.getHeight(); j++)
            {
                if (uISpriteImage.getRGB(i, j) == -1)
                {
                    uISpriteImage.setRGB(i, j, transparent.getRGB());
                }
            }
        }
        g2D.drawImage(uISpriteImage, t2, panel1);
    }

}