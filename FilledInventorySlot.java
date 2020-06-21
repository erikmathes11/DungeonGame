import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class FilledInventorySlot extends InventorySlot
{
    private BufferedImage inventorySlot;
    private double x;
    private double y;
    private AffineTransform t;
    private Item item;
    public FilledInventorySlot(BufferedImage inventorySlot, double x, double y, Item item)
    {
        super(inventorySlot, x, y);
        this.inventorySlot = inventorySlot;
        this.x = x;
        this.y = y;
        t = new AffineTransform();
        this.item = item;
    }

    public void drawUIElement (Graphics2D g2D, GamePanel panel1, Item item) //polymorphism
    {
        g2D.drawImage(inventorySlot, t, panel1);
        item.drawItem(g2D, panel1);
    }
}