import java.util.*;
import java.awt.image.BufferedImage;
public class Forest extends PlayArea
{
    private BufferedImage[][] quadrants;
    public Forest(BufferedImage[][] quadrants)
    {
        super(quadrants);
        this.quadrants = quadrants;
    }
}