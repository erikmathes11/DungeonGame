import java.util.*;
import java.awt.image.BufferedImage;
public class Room extends PlayArea
{
    private Quadrant[][] quadrants;
    public Room(Quadrant[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}