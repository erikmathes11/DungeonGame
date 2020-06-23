import java.util.*;
import java.awt.image.BufferedImage;
public class Forest extends PlayArea
{
    private Quadrant[][] quadrants;
    public Forest(Quadrant[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}