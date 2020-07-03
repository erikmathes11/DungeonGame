import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
public class InventoryPiecesSlot extends InventorySlot
{
    private BufferedImage inventoryPiecesSlot;
    private double x;
    private double y;
    private double scale;
    public InventoryPiecesSlot (BufferedImage inventoryPiecesSlot, double x, double y, double scale)
    {
        super(inventoryPiecesSlot, x, y, scale);
        this.inventoryPiecesSlot = inventoryPiecesSlot;
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
}