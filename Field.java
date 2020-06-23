import java.util.*;
import java.awt.image.BufferedImage;
public class Field extends PlayArea
{
    private Quadrant[][] quadrants;
    //private AffineTransform t;
    public Field(Quadrant[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}