import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class InventoryArmorSlot extends InventorySlot
{
    private BufferedImage inventoryArmorSlot;
    private double x;
    private double y;
    private double scale;
    public InventoryArmorSlot (BufferedImage inventoryArmorSlot, double x, double y, double scale)
    {
        super(inventoryArmorSlot, x, y, scale);
        this.inventoryArmorSlot = inventoryArmorSlot;
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
}