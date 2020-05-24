import java.util.*;
import java.awt.image.BufferedImage;
public class Room extends PlayArea
{
    private BufferedImage[][] quadrants;
    public Room(BufferedImage[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}