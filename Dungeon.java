import java.util.*;
import java.awt.image.BufferedImage;
public class Dungeon extends PlayArea
{
    private BufferedImage[][] quadrants;
    public Dungeon(BufferedImage[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}