


import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.awt.image.WritableRaster;
public class GamePanel extends JPanel
{
    private BufferedImage ground1Picture;
    private BufferedImage ground2Picture;
    private BufferedImage ground3Picture;
    private BufferedImage ground4Picture;
    private BufferedImage coinPicture;
    private BufferedImage coinPouchPicture;
    private BufferedImage inventoryBackgroundPicture;
    private BufferedImage inventorySlotPicture;
    private BufferedImage inventoryPlayerSlotPicture;
    private BufferedImage chestplateInventorySlotPicture;
    private BufferedImage pantsInventorySlotPicture;
    private BufferedImage helmetInventorySlotPicture;
    private BufferedImage shoesInventorySlotPicture;
    private BufferedImage piecesInventorySlotPicture;
    private BufferedImage mapPicture;
    private ImageIcon selectorFrameSprite; //should be imageIcon
    private ImageIcon mapSprite; //should be image
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
    private UIElement inventorySlot;
    private UIElement inventorySlot1;
    private UIElement inventorySlot2;
    private UIElement inventorySlot3;
    private UIElement inventorySlot4;
    private UIElement inventorySlot5;
    private UIElement inventorySlot6;
    private UIElement inventorySlot7;
    private UIElement inventorySlot8;
    private UIElement inventorySlot9;
    private UIElement inventorySlot10;
    private UIElement inventorySlot11;
    private UIElement inventorySlot12;
    private UIElement inventorySlot13;
    private UIElement inventorySlot14;
    private UIElement inventorySlot15;
    private UIElement inventorySlot16;
    private UIElement inventorySlot17;
    private UIElement inventorySlot18;
    private UIElement inventorySlot19;
    private UIElement inventorySlot20;
    private UIElement inventorySlot21;
    private UIElement inventorySlot22;
    private UIElement inventorySlot23;
    private UIElement inventorySlot24;
    private UIElement inventorySlot25;
    private UIElement inventorySlot26;
    private UIElement inventorySlot27;
    private UIElement inventorySlot28;
    private UIElement inventorySlot29;
    private UIElement inventorySlot30;
    private UIElement inventorySlot31;
    private UIElement inventorySlot32;
    private UIElement inventorySlot33;
    private UIElement inventorySlot34;
    private UIElement inventoryBackground;
    private UIElement selectorFrame;
    private UIElement inventoryPlayerSlot;
    private UIElement chestplateInventorySlot;
    private UIElement pantsInventorySlot;
    private UIElement helmetInventorySlot;
    private UIElement shoesInventorySlot;
    private UIElement piecesInventorySlot;
    private UIElement map;

    private UI inventoryUI;
    private UI mapUI;
    private PlayArea town;
    private Player player;
    private JFrame frame1;
    private boolean windowClose;
    private boolean displayInventory;
    private PointerInfo info;
    private Point mousePoint;
    private double mouseX;
    private double mouseY;
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
            inventoryBackgroundPicture = ImageIO.read(new File("InventoryBackgroundPicture.png"));
            //selectorFrameSprite = frame1.getToolkit().createImage("SelectorFrameSprite.gif");
            selectorFrameSprite = new ImageIcon("selectorFrameSprite.gif");
            mapSprite = new ImageIcon("MapSprite.gif");
            //selectorFrameSprite = ImageIO.read(new File("selectorFrameSprite.gif"));
            inventoryPlayerSlotPicture = ImageIO.read(new File("InventoryPlayerSlotPicture.png"));
            chestplateInventorySlotPicture = ImageIO.read(new File("ChestPlateInventorySlotPicture.png"));
            pantsInventorySlotPicture = ImageIO.read(new File("PantsInventorySlotPicture.png"));
            helmetInventorySlotPicture = ImageIO.read(new File("HelmetInventorySlotPicture.png"));
            shoesInventorySlotPicture = ImageIO.read(new File("ShoesInventorySlotPicture.png"));
            piecesInventorySlotPicture = ImageIO.read(new File("PiecesInventorySlotPicture.png"));
            //mapPicture = ImageIO.read(new File(""));
        }
        catch(Exception e)
        {

        }
        props = new ArrayList<Prop>();
        coinIcon = new Coin(coinPicture, 0, 0);
        ground1Quadrant = new Quadrant(ground1Picture, 5, 2, props, -100, -425, 0, 0); //each quadrant is 500, 500 and middle is 400, 75
        ground2Quadrant = new Quadrant(ground2Picture, 5, 2, props, 400, -425, 0, 0);
        ground3Quadrant = new Quadrant(ground3Picture, 5, 2, props, 900, -425, 0, 0);
        ground4Quadrant = new Quadrant(ground4Picture, 5, 2, props, -100, 75, 0, 0);
        ground5Quadrant = new Quadrant(ground1Picture, 5, 2, props, 400, 75, 0, 0);
        ground6Quadrant = new Quadrant(ground2Picture, 5, 2, props, 900, 75, 0, 0);
        ground7Quadrant = new Quadrant(ground3Picture, 5, 2, props, -100, 575, 0, 0);
        ground8Quadrant = new Quadrant(ground4Picture, 5, 2, props, 400, 575, 0, 0);
        ground9Quadrant = new Quadrant(ground1Picture, 5, 2, props, 900, 575, 0, 0);
        inventorySlot = new InventorySlot(inventorySlotPicture, 392, 100, 2);
        inventorySlot1 = new InventorySlot(inventorySlotPicture, 467, 100, 2);
        inventorySlot2 = new InventorySlot(inventorySlotPicture, 542, 100, 2);
        inventorySlot3 = new InventorySlot(inventorySlotPicture, 617, 100, 2);
        inventorySlot4 = new InventorySlot(inventorySlotPicture, 692, 100, 2);
        inventorySlot5 = new InventorySlot(inventorySlotPicture, 767, 100, 2);
        inventorySlot6 = new InventorySlot(inventorySlotPicture, 842, 100, 2);
        inventorySlot7 = new InventorySlot(inventorySlotPicture, 392, 175, 2);
        inventorySlot8 = new InventorySlot(inventorySlotPicture, 467, 175, 2);
        inventorySlot9 = new InventorySlot(inventorySlotPicture, 542, 175, 2);
        inventorySlot10 = new InventorySlot(inventorySlotPicture, 617, 175, 2);
        inventorySlot11 = new InventorySlot(inventorySlotPicture, 692, 175, 2);
        inventorySlot12 = new InventorySlot(inventorySlotPicture, 767, 175, 2);
        inventorySlot13 = new InventorySlot(inventorySlotPicture, 842, 175, 2);
        inventorySlot14 = new InventorySlot(inventorySlotPicture, 392, 250, 2);
        inventorySlot15 = new InventorySlot(inventorySlotPicture, 467, 250, 2);
        inventorySlot16 = new InventorySlot(inventorySlotPicture, 542, 250, 2);
        inventorySlot17 = new InventorySlot(inventorySlotPicture, 617, 250, 2);
        inventorySlot18 = new InventorySlot(inventorySlotPicture, 692, 250, 2);
        inventorySlot19 = new InventorySlot(inventorySlotPicture, 767, 250, 2);
        inventorySlot20 = new InventorySlot(inventorySlotPicture, 842, 250, 2);
        inventorySlot21 = new InventorySlot(inventorySlotPicture, 392, 325, 2);
        inventorySlot22 = new InventorySlot(inventorySlotPicture, 467, 325, 2);

        inventorySlot23 = new InventorySlot(inventorySlotPicture, 542, 325, 2);
        inventorySlot24 = new InventorySlot(inventorySlotPicture, 617, 325, 2);
        inventorySlot25 = new InventorySlot(inventorySlotPicture, 692, 325, 2);
        inventorySlot26 = new InventorySlot(inventorySlotPicture, 767, 325, 2);
        inventorySlot27 = new InventorySlot(inventorySlotPicture, 842, 325, 2);
        inventorySlot28 = new InventorySlot(inventorySlotPicture, 392, 400, 2);
        inventorySlot29 = new InventorySlot(inventorySlotPicture, 467, 400, 2);
        inventorySlot30 = new InventorySlot(inventorySlotPicture, 542, 400, 2);
        inventorySlot31 = new InventorySlot(inventorySlotPicture, 617, 400, 2);
        inventorySlot32 = new InventorySlot(inventorySlotPicture, 692, 400, 2);
        inventorySlot33 = new InventorySlot(inventorySlotPicture, 767, 400, 2);
        inventorySlot34 = new InventorySlot(inventorySlotPicture, 842, 400, 2);
        inventoryBackground = new TransparentBackground(inventoryBackgroundPicture, 0, 0, 5, .5f);
        inventoryPlayerSlot = new InventoryPlayerSlot(inventoryPlayerSlotPicture, 167, 100, 2);
        chestplateInventorySlot = new InventoryArmorSlot(chestplateInventorySlotPicture, 317 , 175 , 2); //317
        pantsInventorySlot = new InventoryArmorSlot(pantsInventorySlotPicture, 317, 250, 2);
        helmetInventorySlot = new InventoryArmorSlot(helmetInventorySlotPicture, 317, 100, 2);
        shoesInventorySlot = new InventoryArmorSlot(shoesInventorySlotPicture, 317, 325, 2);
        piecesInventorySlot = new InventoryPiecesSlot(piecesInventorySlotPicture, 920, 220, 2);
        //selectorFrame = new UISprite(selectorFrameSprite, 0, 0, 2);

        //where other inventory slots should go
        inventoryElements = new UIElement[]{inventoryBackground, piecesInventorySlot, inventoryPlayerSlot, chestplateInventorySlot, pantsInventorySlot, helmetInventorySlot, shoesInventorySlot, inventorySlot, inventorySlot1, inventorySlot2, inventorySlot3, inventorySlot4, inventorySlot5, inventorySlot6, inventorySlot7, inventorySlot8, inventorySlot9, inventorySlot10, inventorySlot11, inventorySlot12, inventorySlot13, inventorySlot14, inventorySlot15, inventorySlot16, inventorySlot17, inventorySlot18, inventorySlot19, inventorySlot20, inventorySlot21, inventorySlot22, inventorySlot23, inventorySlot24, inventorySlot25, inventorySlot26, inventorySlot27, inventorySlot28, inventorySlot29, inventorySlot30, inventorySlot31, inventorySlot32, inventorySlot33, inventorySlot34};
        inventoryUI = new UI(inventoryElements);
        displayInventory = false;

        //add props later
        //quadrants = new Quadrant[3][3];
        quadrants = new Quadrant[][]{{ground1Quadrant, ground2Quadrant, ground3Quadrant},{ground4Quadrant, ground5Quadrant, ground6Quadrant},{ground7Quadrant, ground8Quadrant, ground9Quadrant}};
        town = new PlayArea(quadrants);
        player = new Player(ground4Picture, inventoryUI, 500, 500); //change picture later
        this.setFocusable(true);
        this.addKeyListener(new Listener());
        this.frame1 = frame1;
        frame1.addWindowListener(new ListenerWindow());
        windowClose = false;
        this.addMouseListener(new ListenerMouse());
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
        info = MouseInfo.getPointerInfo();
        mousePoint = info.getLocation();
        mouseX = mousePoint.getX();
        mouseY = mousePoint.getY();
        
        //System.out.println(mouseX + ", " + mouseY);
        if (displayInventory == true)
        {
            player.drawInventory(g2D, this);

        }
        selectorFrameSprite.paintIcon(this, g, 0 , 0); // test
        mapSprite.paintIcon(this, g, 0, 0);
        //g.drawImage(selectorFrameSprite, 500, 500, this);

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

    public class KeyListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyCode() == 40) //Down
            {

            }
            if(e.getKeyCode() == 38) //Up
            {

            }
            if(e.getKeyCode() == 39) //Right
            {

            }
            if(e.getKeyCode() == 37) //Left
            {

            }
            if(e.getKeyCode() == 77) //Map
            {
                
            }

            
            
        }
    }

    public class ListenerMouse extends MouseAdapter
    {

    }

}