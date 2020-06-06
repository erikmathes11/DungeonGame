import java.util.*;
import java.awt.image.BufferedImage;
public class DungeonRoom extends Room
{
    private Quadrant[][] quadrants;
    public DungeonRoom(Quadrant[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}