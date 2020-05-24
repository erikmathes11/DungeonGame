import java.util.*;
import java.awt.image.BufferedImage;
public class House extends PlayArea
{
    private BufferedImage[][] quadrants;
    public House(BufferedImage[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}