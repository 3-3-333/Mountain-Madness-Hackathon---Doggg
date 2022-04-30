package org.doggg;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

public class ClothesChooser{
    public ClothesChooser(){
        up=new ArrayList<ClothesNode>();
        r=new Random();
        MakeList();
    }
    private void MakeList(){
        up.add(new ClothesNode("Up1", "resources/Up1.png"));
        up.add(new ClothesNode("Up2", "resources/Up2.png"));
        for(int i=1;i<6;i++){
            bodysuit.add(new ClothesNode("bodysuit"+i, 
                 "resources/bodysuit"+i+".png"));
        }
        for(int i=1;i<5;i++){
            bodysuit.add(new ClothesNode("head"+i, 
                 "resources/head"+i+".png"));
        }
        down=new ClothesNode("down1", "resources/Up1.png");
        body=new ClothesNode("body", "resources/body.png");
    }
    public void randomSet(Graphics2D g2){
        g2.drawImage(body.getImage(), 1, 1, 1668, 2224, null);
        int headIndex=r.nextInt(0,head.size());
        Image headPic=head.get(headIndex+1).getImage();
        g2.drawImage(headPic, 1, 1, 1668, 2224, null);
        int isBodySuit=r.nextInt(0, 2);
        if(isBodySuit==1){
            int index=r.nextInt(0,bodysuit.size());
            Image bodysuitPic=bodysuit.get(index+1).getImage();
            g2.drawImage(bodysuitPic,1,1,1668,2224,null);
        }else{
            int upIndex=r.nextInt(0,up.size());
            Image upPic=up.get(upIndex+1).getImage();
            g2.drawImage(upPic, 1, 1, 1668, 2224, null);
            int hasDown=r.nextInt(0, 2);
            if(hasDown==1){
                g2.drawImage(down.getImage(), 1, 1, 1668, 2224, null);
            }
        }
    }
    private ArrayList<ClothesNode> up;
    ClothesNode down;
    private ArrayList<ClothesNode> bodysuit;
    private ArrayList<ClothesNode> head;
    private ClothesNode body;
    private Random r;
}

