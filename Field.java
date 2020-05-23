import java.util.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO.*;
import java.io.*;
import javax.imageio.*;
import java.awt.geom.*;
public class Field extends PlayArea
{
    private BufferedImage playArea;
    //private AffineTransform t;
    public Field(String fileName)
    {
        super(fileName);
                try
        {
            playArea = ImageIO.read(new File(fileName));
        }
        catch (Exception e)
        {
        }
    }
}