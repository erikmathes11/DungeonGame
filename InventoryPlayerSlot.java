import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class InventoryPlayerSlot extends InventorySlot
{
    private BufferedImage inventoryPlayerSlot;
    private double x;
    private double y;
    private double scale;
    public InventoryPlayerSlot (BufferedImage inventoryPlayerSlot, double x, double y, double scale)
    {
        super(inventoryPlayerSlot, x, y, scale);
        this.inventoryPlayerSlot = inventoryPlayerSlot;
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
}