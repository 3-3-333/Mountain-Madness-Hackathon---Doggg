package org.doggg;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class GameFrame extends JPanel implements Runnable {

    //public Image food = ImageIO.read(getClass().getResourceAsStream("resources/Food1_24x24.png"));
    FoodNode icecream=new FoodNode("icecream", "resources/Food1_24x24.png");
    Image icecreamImage=icecream.getImage();

    FoodNode bread = new FoodNode("bread","resources/Food2_24x24.png");
    Image breadImage = bread.getImage();

    // 我的相对路径有问题 换成绝对路径以后是可以正常显示的
    private int frame_speed = 60;
    private int rows, colm, cellSize, width, height;
    private Thread gameThread;
    private Listener key = new Listener(this);
    private FoodSelector fs = new FoodSelector();
    private int GameState = 0;
    private int title = 0;
    private int game = 1;
    
    GameFrame(int colm, int rows, int cellSize) throws IOException {
        this.colm = colm;
        this.rows = rows;
        this.cellSize = cellSize;
        setUpScreen();
    }

    private void setUpScreen() {
        width = cellSize * colm;
        height = cellSize * rows;
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(new Color(0x123456));
        // this.addKeyListener(key);
        this.setFocusable(true);
    }


    
    public void beginThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    //start of new function
    private void titleScreen(Graphics2D g2) {
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        Font font1 = new Font("Sans Serif", Font.PLAIN, 96);
        Font font2 = new Font("Sans Serif", Font.PLAIN, 36);
        int text1Length = (int)
            g2.getFontMetrics(font1).stringWidth("indecisive.io");
        int text2Length = (int)
            g2.getFontMetrics(font2).stringWidth("press space to continue");
        g2.setFont(font1);
        g2.drawString("indecisive.io",
            (width/2)-(text1Length/2),height/2-96);
        g2.setFont(font2);
        g2.drawString("press space to continue",
             width/2-text2Length/2,height/2+40);
    }


    @Override
    public void run() {
        System.out.println("[run/GameFrame.java] running GameFrame");
        double interval = 1000000000 / frame_speed;
        double nextUpdate = System.nanoTime() + interval;

        runGame();
        try {
            double sleepTime = (nextUpdate - System.nanoTime()) / 1000000;
            if (sleepTime < 0) {
                sleepTime = 0;
            }
            Thread.sleep((long) sleepTime);
            nextUpdate += interval;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //g2.drawImage(icecreamImage, 1, 1, 48, 48, null);
        //g2.drawImage(breadImage,480,480,48,48,null);
        //titleScreen(g2);
        fs.choosefood(g2);
    }

    
    public void runGame() {
        repaint();
    }

}

