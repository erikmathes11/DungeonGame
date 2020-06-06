import java.util.*;
import java.awt.image.BufferedImage;
public class Castle extends PlayArea
{
    private Quadrant[][] quadrants;
    public Castle(Quadrant[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}