import java.util.*;
import java.awt.image.BufferedImage;
public class House extends PlayArea
{
    private Quadrant[][] quadrants;
    public House(Quadrant[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}