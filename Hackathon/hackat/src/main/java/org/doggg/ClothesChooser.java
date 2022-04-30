package org.doggg;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


public class ClothesChooser{
    public ClothesChooser(){
        up=new ArrayList<ClothesNode>();
        head=new ArrayList<ClothesNode>();
        bodysuit= new ArrayList<ClothesNode>();
        r=new Random();
        MakeList();
    }
    private void MakeList(){
        head.add(new ClothesNode("head1", "resources/head1.png"));
        head.add(new ClothesNode("head2", "resources/head2.png"));
        head.add(new ClothesNode("head3", "resources/head3.png"));
        head.add(new ClothesNode("head4", "resources/head4.png"));
        head.add(new ClothesNode("head5", "resources/head5.png"));
        up.add(new ClothesNode("Up1", "resources/Up1.png"));
        up.add(new ClothesNode("Up2", "resources/Up2.png"));
        up.add(new ClothesNode("Up3", "resources/Up3.png"));
        up.add(new ClothesNode("Up4", "resources/Up4.png"));
        bodysuit.add(new ClothesNode("bodysuit1", "resources/bodysuit1.png"));
        bodysuit.add(new ClothesNode("bodysuit2", "resources/bodysuit2.png"));
        bodysuit.add(new ClothesNode("bodysuit3", "resources/bodysuit3.png"));
        down=new ClothesNode("down1", "resources/Up1.png");
        body=new ClothesNode("body", "resources/body.png");
    }
    public void randomSet(Graphics2D g2){
        g2.drawImage(body.getImage(), 1, 1, 166*4, 222*4, null);
        int headIndex=r.nextInt(1,head.size());
        Image headPic=head.get(headIndex).getImage();
        g2.drawImage(headPic, 1, 1, 166*4, 222*4, null);
        int isBodySuit=r.nextInt(0, 2);
        if(isBodySuit==1){
            int index=r.nextInt(1,bodysuit.size()-1);
            Image bodysuitPic=bodysuit.get(index).getImage();
            System.out.println("in bodysuit");
            g2.drawImage(bodysuitPic,1,1,166*4,222*4,null);
        }else{
            System.out.println("in up");
            int upIndex=r.nextInt(1,up.size());
            Image upPic=up.get(upIndex).getImage();
            g2.drawImage(upPic, 1, 1, 166*4, 222*4, null);
            int hasDown=r.nextInt(0, 2);
            if(hasDown==1){
                System.out.println("in down");
                g2.drawImage(down.getImage(), 1, 1, 166*4, 222*4, null);
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

