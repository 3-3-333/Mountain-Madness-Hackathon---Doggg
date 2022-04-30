package org.doggg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Listener implements KeyListener{
    public GameFrame gf;
    public Listener(GameFrame gf) {
        this.gf = gf;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
            gf.changeFoodOrCloth();
        }
        if(key == KeyEvent.VK_DOWN){
            gf.changeFoodOrCloth();
        }
        if(key == KeyEvent.VK_RIGHT){
            gf.changeFoodOrCloth();
        }
        if(key == KeyEvent.VK_LEFT){
            gf.changeFoodOrCloth();
        }
        if(key == KeyEvent.VK_LEFT){
            gf.changeFoodOrCloth();
        }
        if(key == KeyEvent.VK_1){
            gf.changeState();
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
            gf.changeFoodOrCloth();
        }
        if(key == KeyEvent.VK_DOWN){
            gf.changeFoodOrCloth();
        }
        if(key == KeyEvent.VK_RIGHT){
            gf.changeFoodOrCloth();
        }
        if(key == KeyEvent.VK_LEFT){
            gf.changeFoodOrCloth();
        }
        if(key == KeyEvent.VK_LEFT){
            gf.changeFoodOrCloth();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }
        
}
