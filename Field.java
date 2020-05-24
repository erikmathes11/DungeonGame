import java.util.*;
import java.awt.image.BufferedImage;
public class Field extends PlayArea
{
    private BufferedImage[][] quadrants;
    //private AffineTransform t;
    public Field(BufferedImage[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}