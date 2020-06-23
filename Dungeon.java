import java.util.*;
import java.awt.image.BufferedImage;
public class Dungeon extends PlayArea
{
    private Quadrant[][] quadrants;
    public Dungeon(Quadrant[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}