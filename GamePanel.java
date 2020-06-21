import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
public class GamePanel extends JPanel
{
    private BufferedImage ground1Picture;
    private BufferedImage ground2Picture;
    private BufferedImage ground3Picture;
    private BufferedImage ground4Picture;
    private BufferedImage coinPicture;
    private BufferedImage coinPouchPicture;
    private BufferedImage inventorySlotPicture;
    private UIElement[] inventoryElements;
    private Coin coinIcon;
    private Quadrant[][] quadrants;
    private ArrayList<Prop> props;
    private Quadrant ground1Quadrant;
    private Quadrant ground2Quadrant;
    private Quadrant ground3Quadrant;
    private Quadrant ground4Quadrant;
    private Quadrant ground5Quadrant;
    private Quadrant ground6Quadrant;
    private Quadrant ground7Quadrant;
    private Quadrant ground8Quadrant;
    private Quadrant ground9Quadrant;
    private InventorySlot inventorySlot;
    private InventorySlot inventorySlot1;
    private InventorySlot inventorySlot2;
    private InventorySlot inventorySlot3;
    private InventorySlot inventorySlot4;
    private InventorySlot inventorySlot5;
    private InventorySlot inventorySlot6;
    private InventorySlot inventorySlot7;
    private InventorySlot inventorySlot8;
    private InventorySlot inventorySlot9;
    private InventorySlot inventorySlot10;

    private UI inventory;
    private PlayArea town;
    private Player player;
    private JFrame frame1;
    private boolean windowClose;
    private boolean displayInventory;
    public GamePanel (JFrame frame1)
    {
        super();
        try
        {
            ground1Picture = ImageIO.read(new File("Ground1Picture.png"));
            ground2Picture = ImageIO.read(new File("Ground2Picture.png"));
            ground3Picture = ImageIO.read(new File("Ground3Picture.png"));
            ground4Picture = ImageIO.read(new File("Ground4Picture.png"));
            coinPicture = ImageIO.read(new File("CoinPicture.png"));
            coinPouchPicture = ImageIO.read(new File("CoinPouchPicture.png"));
            inventorySlotPicture = ImageIO.read(new File("InventorySlotPicture.png"));
        }
        catch(Exception e)
        {

        }
        props = new ArrayList<Prop>();
        coinIcon = new Coin(coinPicture, 0, 0);
        ground1Quadrant = new Quadrant(ground1Picture, props, -100, -425); //each quadrant is 500, 500 and middle is 400, 75
        ground2Quadrant = new Quadrant(ground2Picture, props, 400, -425);
        ground3Quadrant = new Quadrant(ground3Picture, props, 900, -425);
        ground4Quadrant = new Quadrant(ground4Picture, props, -100, 75);
        ground5Quadrant = new Quadrant(ground1Picture, props, 400, 75);
        ground6Quadrant = new Quadrant(ground2Picture, props, 900, 75);
        ground7Quadrant = new Quadrant(ground3Picture, props, -100, 575);
        ground8Quadrant = new Quadrant(ground4Picture, props, 400, 575);
        ground9Quadrant = new Quadrant(ground1Picture, props, 900, 575);
        inventorySlot = new InventorySlot(inventorySlotPicture, 400, 100, 2);
        //where other inventory slots should go
        inventoryElements = new UIElement[]{inventorySlot};
        inventory = new UI(inventoryElements);
        displayInventory = false;

        //add props later
        //quadrants = new Quadrant[3][3];
        quadrants = new Quadrant[][]{{ground1Quadrant, ground2Quadrant, ground3Quadrant},{ground4Quadrant, ground5Quadrant, ground6Quadrant},{ground7Quadrant, ground8Quadrant, ground9Quadrant}};
        town = new PlayArea(quadrants);
        player = new Player(ground4Picture, inventory, 500, 500); //change picture later
        this.setFocusable(true);
        this.addKeyListener(new Listener());
        this.frame1 = frame1;
        frame1.addWindowListener(new ListenerWindow());
        windowClose = false;
    }

    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        town.drawPlayArea(g2D, this); //won't do anything yet
        town.changeQuadrants(player);
        town.drawQuadrantHitBoxes(g2D); //for testing purposes
        player.drawPlayer(g2D);
        coinIcon.drawCurrency(g2D, this);
        if (displayInventory == true)
        {
            player.drawInventory(g2D, this);
        }
        // ground1Quadrant.drawQuadrant(g2D, this);
        // ground2Quadrant.drawQuadrant(g2D, this);
        // ground3Quadrant.drawQuadrant(g2D, this);
        // ground4Quadrant.drawQuadrant(g2D, this);
        // ground5Quadrant.drawQuadrant(g2D, this);
        // ground6Quadrant.drawQuadrant(g2D, this);
        // ground7Quadrant.drawQuadrant(g2D, this);
        // ground8Quadrant.drawQuadrant(g2D, this);
        // ground9Quadrant.drawQuadrant(g2D, this);
        try
        {
            Thread.sleep(10);
        }
        catch (Exception e)
        {

        }
        this.repaint();
    }

    public boolean getWindowClose()
    {
        return windowClose;
    }

    public int getCoinsGamePanel ()
    {
        return player.getCoins();
    }

    public class Listener extends KeyAdapter
    {
        public void keyPressed (KeyEvent e)
        {
            System.out.println(e.getKeyCode());
            if (e.getKeyCode() == 65) //a
            {
                town.movePlayAreaForward();
            }

            if (e.getKeyCode() == 83) //s
            {
                town.movePlayAreaUp();
            }

            if (e.getKeyCode() == 68) //d
            {
                town.movePlayAreaBackward();
            }

            if (e.getKeyCode() == 87) //w
            {
                town.movePlayAreaDown();
            }

            if (e.getKeyCode() == 69) //e
            {
                if (displayInventory == true)
                {
                    displayInventory = false;
                }
                else
                {
                    displayInventory = true;
                }
            }

        }
    }

    public class ListenerWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            windowClose = true;
        }
    }

}