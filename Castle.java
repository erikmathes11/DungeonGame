import java.util.*;
import java.awt.image.BufferedImage;
public class Castle extends PlayArea
{
    private BufferedImage[][] quadrants;
    public Castle(BufferedImage[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}