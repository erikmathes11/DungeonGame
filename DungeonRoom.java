import java.util.*;
import java.awt.image.BufferedImage;
public class DungeonRoom extends Room
{
    private BufferedImage[][] quadrants;
    public DungeonRoom(BufferedImage[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}