import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class InventorySlot extends UIElement
{
    private BufferedImage inventorySlot;
    private double x;
    private double y;
    //private AffineTransform t;
    private double scale;
    public InventorySlot (BufferedImage inventorySlot, double x, double y, double scale)
    {
        super(inventorySlot, x, y, scale);
        this.inventorySlot = inventorySlot;
        this.x = x;
        this.y = y;
        // t = new AffineTransform();
        // t.translate(x, y);
        // t.scale(5, 5);
        this.scale = scale;
    }
    
    public double getInventorySlotX ()
    {
        return x;
    }
    
    public double getInventorySlotY ()
    {
        return y;
    }
    
    
    
    
    
}