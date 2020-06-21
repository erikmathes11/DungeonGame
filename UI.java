import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class UI
{
    private UIElement[] elements;
    public UI(UIElement[] elements)
    {
        this.elements = elements;
    }
    
    public void drawUI(Graphics2D g2D, GamePanel panel1)
    {
        for (int i = 0; i < elements.length; i++)
        {
            elements[i].drawUIElement(g2D, panel1);
        }
    }
    
    public void moveUI(double x, double y)
    {
        for (int i = 0; i < elements.length; i++)
        {
            elements[i].getTranslate().translate(x, y);
        }
    }
}