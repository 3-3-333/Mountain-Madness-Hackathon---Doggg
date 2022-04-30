package org.doggg;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class GameFrame extends JPanel implements Runnable{
    public void run(){};
    public void paint(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
    }

}

