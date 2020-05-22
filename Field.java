import java.util.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO.*;
public class Field extends PlayArea
{
    private ArrayList<Prop> props;
    private BufferedImage playArea;
    public Field(ArrayList<Prop> props, BufferedImage playArea)
    {
        super(props, playArea);
        this.props = props;
        this.playArea = playArea;
    }
}