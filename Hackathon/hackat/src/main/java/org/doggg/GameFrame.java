package org.doggg;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;
import java.io.IOException;

public class GameFrame extends JPanel implements Runnable{
    public Image food = new ImageIcon("src/main/java/Rewards/Food1_24x24.png").getImage();
    //我的相对路径有问题 换成绝对路径以后是可以正常显示的
    private int frame_speed = 60;
    private int rows,colm,cellSize,width,height;
    private Thread gameThread;
    private Listener key = new Listener(this);

    GameFrame(int colm, int rows, int cellSize) throws IOException {
        this.colm =colm;
        this.rows = rows;
        this.cellSize = cellSize;
        setUpScreen();
    }
    private void setUpScreen(){
        width = cellSize*colm;
        height = cellSize*rows;
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(new Color(0x123456));
        //this.addKeyListener(key);
        this.setFocusable(true);
    }

    public void beginThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){
        System.out.println("[run/GameFrame.java] running GameFrame");
        double interval = 1000000000/frame_speed;
        double nextUpdate = System.nanoTime() + interval;

        runGame();
            try {
                double sleepTime = (nextUpdate - System.nanoTime())/1000000;
                if (sleepTime < 0) {
                    sleepTime = 0;
                }
                Thread.sleep((long)sleepTime);
                nextUpdate += interval;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    };
    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(food,1,1,getWidth(),getHeight(),null);
    }
    public void runGame(){
        repaint();
    }

}

